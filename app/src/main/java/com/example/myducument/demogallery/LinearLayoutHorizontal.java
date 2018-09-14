package com.example.myducument.demogallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import static android.support.v7.widget.LinearLayoutManager.*;

public class LinearLayoutHorizontal extends AppCompatActivity {
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView recyclerView;
    private ArrayList<HinhAnh> hinhAnhs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_horizontal);

        hinhAnhs.add(new HinhAnh("http://i.imgur.com/zuG2bGQ.jpg", "Galaxy"));
        hinhAnhs.add(new HinhAnh("http://i.imgur.com/n6RfJX2.jpg", "Galaxy Orion"));
        hinhAnhs.add(new HinhAnh("http://i.imgur.com/ovr0NAF.jpg", "Space Shuttle"));
        hinhAnhs.add(new HinhAnh("http://i.imgur.com/qpr5LR2.jpg", "Earth"));
        hinhAnhs.add(new HinhAnh("http://i.imgur.com/pSHXfu5.jpg", "Astronaut"));
        hinhAnhs.add(new HinhAnh("http://i.imgur.com/3wQcZeY.jpg", "Satellite"));

        layoutManager = new LinearLayoutManager(this,HORIZONTAL,false);
        recyclerView = findViewById(R.id.recycler_horizontal);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        ImageGalleryAdapter adapter = new ImageGalleryAdapter(this, hinhAnhs);
        recyclerView.setAdapter(adapter);

    }
}
