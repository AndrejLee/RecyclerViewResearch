package com.example.cpu10152_local.testrecyclerview;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by cpu10152-local on 24/04/2018.
 */

public class ViewHolder  extends RecyclerView.ViewHolder {

    private final SparseArray<View> mCachedViews = new SparseArray<>();

    public ViewHolder(View itemView) {
        super(itemView);
    }

    public <T extends View> T find(int ID) {
        return (T) findViewById(ID);
    }

    private View findViewById(int ID) {
        final View cachedView = mCachedViews.get(ID);
        if (cachedView != null) {
            return cachedView;
        }
        final View view = itemView.findViewById(ID);
        mCachedViews.put(ID, view);
        return view;
    }

    public ViewHolder setText(int ID, CharSequence text) {
        ((TextView) find(ID)).setText(text);
        return this;
    }

    public ViewHolder setTextSize(int ID, float size) {
        ((TextView) find(ID)).setTextSize(size);
        return this;
    }

    public ViewHolder setImageDrawable(int ID, Drawable drawable) {
        ((ImageView) find(ID)).setImageDrawable(drawable);
        return this;
    }

    public ViewHolder setAlpha(int ID, int alpha) {
        find(ID).setAlpha(alpha);
        return this;
    }
}