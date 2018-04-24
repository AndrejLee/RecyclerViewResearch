package com.example.cpu10152_local.testrecyclerview.RecyclerViewMultiItems;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.cpu10152_local.testrecyclerview.R;
import com.example.cpu10152_local.testrecyclerview.YourModel;

/**
 * Created by cpu10152-local on 24/04/2018.
 */

public class AnotherViewRenderer extends ViewRenderer<AnotherModel, AnotherViewHolder> {

    public AnotherViewRenderer(int type, Context context) {
        super(type, context);
    }

    @Override public
    void bindView(@NonNull final AnotherModel model, @NonNull final AnotherViewHolder holder) {
        holder.mTitle.setText(model.getTitle());
        holder.mDes.setText(model.getDes());
    }

    @NonNull
    @Override
    public AnotherViewHolder createViewHolder(@Nullable final ViewGroup parent) {
        return new AnotherViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.another_item, parent, false));
    }

    @Override
    public int getType() {
        return 1;
    }
}