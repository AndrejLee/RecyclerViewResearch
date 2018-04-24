package com.example.cpu10152_local.testrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cpu10152_local.testrecyclerview.RecyclerViewMultiItems.RecyclerViewMultiItems;
import com.example.cpu10152_local.testrecyclerview.RecyclerViewMultiItems.RendererRecyclerViewAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, RecyclerViewMultiItems.class);
        startActivity(intent);
    }
}
