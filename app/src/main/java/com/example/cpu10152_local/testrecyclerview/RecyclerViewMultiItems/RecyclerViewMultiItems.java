package com.example.cpu10152_local.testrecyclerview.RecyclerViewMultiItems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.cpu10152_local.testrecyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewMultiItems extends AppCompatActivity {
    private RendererRecyclerViewAdapter mRecyclerViewAdapter;
    private RecyclerView mRecyclerView;
    private ArrayList<ItemModel> mItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_multi_items);

        mRecyclerViewAdapter = new RendererRecyclerViewAdapter();
        mRecyclerViewAdapter.registerRenderer(new SomeViewRenderer(SomeModel.TYPE, this));
        mRecyclerViewAdapter.registerRenderer(new AnotherViewRenderer(AnotherModel.TYPE, this));

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mRecyclerViewAdapter);

        mRecyclerViewAdapter.setItems(getItems());
        mRecyclerViewAdapter.notifyDataSetChanged();
    }

    private ArrayList getItems() {
        mItems.add(new SomeModel("Title 1"));
        mItems.add(new SomeModel("Title 2"));
        mItems.add(new SomeModel("Title 3"));
        mItems.add(new SomeModel("Title 4"));
        mItems.add(new SomeModel("Title 5"));
        mItems.add(new SomeModel("Title 6"));
        mItems.add(new SomeModel("Title 7"));
        mItems.add(new SomeModel("Title 8"));
        mItems.add(new SomeModel("Title 9"));
        mItems.add(new SomeModel("Title 10"));
        mItems.add(new SomeModel("Title 11"));
        mItems.add(new SomeModel("Title 12"));
        mItems.add(new SomeModel("Title 13"));
        mItems.add(new SomeModel("Title 14"));
        mItems.add(new AnotherModel("Title 15", "Description 1"));
        mItems.add(new AnotherModel("Title 16", "Description 2"));
        mItems.add(new AnotherModel("Title 17", "Description 3"));
        mItems.add(new AnotherModel("Title 18", "Description 4"));
        mItems.add(new AnotherModel("Title 19", "Description 5"));
        mItems.add(new AnotherModel("Title 20", "Description 6"));
        mItems.add(new AnotherModel("Title 21", "Description 7"));
        return mItems;
    }


}
