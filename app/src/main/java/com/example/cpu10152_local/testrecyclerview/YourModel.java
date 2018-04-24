package com.example.cpu10152_local.testrecyclerview;

import com.example.cpu10152_local.testrecyclerview.RecyclerViewMultiItems.ItemModel;

/**
 * Created by cpu10152-local on 24/04/2018.
 */

public class YourModel implements ItemModel {

    private String mText;

    public YourModel(String text){
        mText = text;
    }

    public String getYourText() {return mText; }

    @Override
    public int getType() {
        return 3;
    }
}
