package com.example.cpu10152_local.testrecyclerview.RecyclerViewMultiItems;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.cpu10152_local.testrecyclerview.R;
import com.example.cpu10152_local.testrecyclerview.YourModel;

public class SomeViewRenderer extends ViewRenderer<SomeModel, SomeViewHolder> {

    public SomeViewRenderer(int type, Context context) {
        super(type, context);
    }

    @Override public
    void bindView(@NonNull final SomeModel model, @NonNull final SomeViewHolder holder) {
        holder.mTitle.setText(model.getTitle());
    }

    @NonNull
    @Override
    public SomeViewHolder createViewHolder(@Nullable final ViewGroup parent) {
        return new SomeViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.some_item, parent, false));
    }

    @Override
    public int getType() {
        return 0;
    }
}
