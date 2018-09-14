package com.example.myducument.demogallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonHorizontal;
    private Button buttonVertical;
    private Button buttonGridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inIt();
        buttonVertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,LinearLayoutVertical.class));
            }
        });
        buttonHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,LinearLayoutHorizontal.class));
            }
        });
        buttonGridLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,GridLayout.class));
            }
        });
    }

    private void inIt() {
        buttonGridLayout = findViewById(R.id.button_GridLayout);
        buttonHorizontal = findViewById(R.id.button_horizonto);
        buttonVertical = findViewById(R.id.button_vertical);
    }
}
