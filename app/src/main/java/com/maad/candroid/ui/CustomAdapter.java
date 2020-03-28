package com.maad.candroid.ui;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.maad.candroid.R;
import com.maad.candroid.data.CandroidModel;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private Activity activity;
    private ArrayList<CandroidModel> candroidModels;

    public CustomAdapter(Activity activity, ArrayList<CandroidModel> candroidModels) {
        this.activity = activity;
        this.candroidModels = candroidModels;
    }

    @Override
    public int getCount() {
        return candroidModels.size();
    }

    @Override
    public Object getItem(int i) {
        return candroidModels.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = activity.getLayoutInflater();
            view = inflater.inflate(R.layout.list_item, viewGroup, false);
            //Log.d("listView", "Inflation...");
        }
        ImageView imageView = view.findViewById(R.id.iv);
        TextView textView = view.findViewById(R.id.tv);
        imageView.setImageResource(candroidModels.get(i).getPicture());
        textView.setText(candroidModels.get(i).getName());
        return view;
    }
}
