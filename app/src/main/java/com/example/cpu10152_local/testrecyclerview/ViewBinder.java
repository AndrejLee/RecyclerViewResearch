package com.example.cpu10152_local.testrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.cpu10152_local.testrecyclerview.RecyclerViewMultiItems.ViewRenderer;

/**
 * Created by cpu10152-local on 24/04/2018.
 */

public class ViewBinder<M extends YourModel>
        extends ViewRenderer<M, ViewHolder> {

    private final Binder mBinder;

    public ViewBinder(int layoutID,
                      Class<M> type,
                      Context context,
                      Binder<M> binder) {
        super(layoutID, (Class<YourModel>) type, context);
        mBinder = binder;
    }

    public void bindView(M model, ViewHolder holder) {
        mBinder.bindView(model, holder);
    }

    @NonNull
    @Override
    public ViewHolder createViewHolder(@Nullable ViewGroup parent) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.your_layout, parent, false));
    }

    @Override
    public int getType() {
        return 3;
    }

    public interface Binder <M> {
        void bindView(M model, ViewHolder holder);
    }
}
