package com.example.cpu10152_local.testrecyclerview.RecyclerViewMultiItems;

import android.support.annotation.NonNull;

/**
 * Created by cpu10152-local on 24/04/2018.
 */

public class AnotherModel implements ItemModel {

    public static final int TYPE = 1;
    @NonNull
    private final String mTitle;
    @NonNull
    private final String mDes;

    public AnotherModel(@NonNull final String title, @NonNull final String des) {
        mTitle = title;
        mDes = des;
    }

    @Override
    public int getType() {
        return TYPE;
    }

    @NonNull
    public String getTitle() {
        return mTitle;
    }

    @NonNull
    public String getDes() {
        return mDes;
    }

}
