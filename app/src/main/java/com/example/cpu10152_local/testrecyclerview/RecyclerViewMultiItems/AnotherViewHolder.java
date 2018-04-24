package com.example.cpu10152_local.testrecyclerview.RecyclerViewMultiItems;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.cpu10152_local.testrecyclerview.R;

/**
 * Created by cpu10152-local on 24/04/2018.
 */

public class AnotherViewHolder extends RecyclerView.ViewHolder {

    public final TextView mTitle;
    public final TextView mDes;

    public AnotherViewHolder(View itemView) {
        super(itemView);
        mTitle = (TextView) itemView.findViewById(R.id.title);
        mDes = (TextView) itemView.findViewById(R.id.description);
    }
}
