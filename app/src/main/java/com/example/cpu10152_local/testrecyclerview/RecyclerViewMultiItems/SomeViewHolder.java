package com.example.cpu10152_local.testrecyclerview.RecyclerViewMultiItems;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.cpu10152_local.testrecyclerview.R;

public class SomeViewHolder extends RecyclerView.ViewHolder {

    public final TextView mTitle;

    public SomeViewHolder(final View itemView) {
        super(itemView);
        mTitle = (TextView) itemView.findViewById(R.id.title);
    }
}
