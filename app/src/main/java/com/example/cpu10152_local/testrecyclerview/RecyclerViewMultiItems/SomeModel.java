package com.example.cpu10152_local.testrecyclerview.RecyclerViewMultiItems;

import android.support.annotation.NonNull;

/**
 * Created by cpu10152-local on 24/04/2018.
 */

public class SomeModel implements ItemModel {

    public static final int TYPE = 0;
    @NonNull
    private final String mTitle;

    public SomeModel(@NonNull final String title) {
        mTitle = title;
    }

    @Override
    public int getType() {
        return TYPE;
    }

    @NonNull
    public String getTitle() {
        return mTitle;
    }

}

