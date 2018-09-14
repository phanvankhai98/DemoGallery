package com.example.myducument.demogallery;

import android.os.Parcel;
import android.os.Parcelable;

public class HinhAnh {
    private String mUrl;
    private String mTitle;

    public HinhAnh(String url, String title) {
        mUrl = url;
        mTitle = title;
    }


    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }


}
