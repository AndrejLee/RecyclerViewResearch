package com.example.cpu10152_local.testrecyclerview.RecyclerViewMultiItems;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.cpu10152_local.testrecyclerview.YourModel;

/**
 * Created by cpu10152-local on 24/04/2018.
 */

public abstract class ViewRenderer <M extends ItemModel, VH extends RecyclerView.ViewHolder>{

    public ViewRenderer(int layoutID, Class<YourModel> type, Context context) {

    }

    public ViewRenderer(int type, Context context) {

    }

    public abstract	void bindView(@NonNull M model, @NonNull VH holder);

    @NonNull
    public abstract	VH createViewHolder(@Nullable ViewGroup parent);

    public abstract int getType();
}
