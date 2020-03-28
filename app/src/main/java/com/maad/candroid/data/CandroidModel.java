package com.maad.candroid.data;

public class CandroidModel {

    private int picture;
    private int name;
    private String url;

    public CandroidModel(int picture, int name, String url) {
        this.picture = picture;
        this.name = name;
        this.url = url;
    }

    public int getPicture() {
        return picture;
    }

    public int getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
