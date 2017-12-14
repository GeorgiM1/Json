package com.example.android.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.json.imagelist.Image;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.recycleview)
    RecyclerView recyclerView;
    CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        adapter = new CustomAdapter(this);
        adapter.setItems(generateList());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);





    }

    ArrayList<Image> generateList(){
        ArrayList<Image> images = new ArrayList<>();
        images.add(new Image("https://pixabay.com/get/ea35b00c2df1083ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg"));
        images.add(new Image("https://pixabay.com/get/ea35b00c2df1083ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg"));
        images.add(new Image("https://pixabay.com/get/ea35b00c2df1083ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg"));
        images.add(new Image("https://pixabay.com/get/ea35b00c2df1083ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg"));
        images.add(new Image("https://pixabay.com/get/ea35b00c2df1083ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg"));
        images.add(new Image("https://pixabay.com/get/ea35b00c2df1083ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg"));
        images.add(new Image("https://pixabay.com/get/ea35b00c2df1083ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg"));
        images.add(new Image("https://pixabay.com/get/ea35b00c2df1083ed95c4518b74b449fe37ee0d404b0144096f2c679a5e9b4_640.jpg"));

        return images;


    }
}
