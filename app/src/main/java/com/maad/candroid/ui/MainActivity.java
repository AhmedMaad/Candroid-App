package com.maad.candroid.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.maad.candroid.R;
import com.maad.candroid.data.CandroidModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<CandroidModel> candroidModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        candroidModels.add(new CandroidModel(R.drawable.jelly_bean, R.string.jelly_bean, "https://www.android.com/versions/jelly-bean-4-3/"));
        candroidModels.add(new CandroidModel(R.drawable.kitkat, R.string.kitkat, "https://www.android.com/versions/kit-kat-4-4/"));
        candroidModels.add(new CandroidModel(R.drawable.lollipop, R.string.lollipop, "https://www.android.com/versions/lollipop-5-0/"));
        candroidModels.add(new CandroidModel(R.drawable.marshmallow, R.string.marshmallow, "https://www.android.com/versions/marshmallow-6-0/"));
        candroidModels.add(new CandroidModel(R.drawable.nougat, R.string.nougat, "https://www.android.com/versions/nougat-7-0/"));
        candroidModels.add(new CandroidModel(R.drawable.oreo, R.string.oreo, "https://www.android.com/versions/oreo-8-0/"));
        candroidModels.add(new CandroidModel(R.drawable.pie, R.string.pie, "https://www.android.com/versions/pie-9-0/"));

        CustomAdapter adapter = new CustomAdapter(MainActivity.this, candroidModels);
        ListView lv = findViewById(R.id.lv);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Uri link = Uri.parse(candroidModels.get(i).getUrl());
                Intent intent = new Intent(Intent.ACTION_VIEW, link);
                startActivity(intent);
            }
        });

    }
}
