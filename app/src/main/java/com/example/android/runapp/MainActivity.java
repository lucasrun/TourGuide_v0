package com.example.android.runapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // text views
        TextView cityTV = (TextView) findViewById(R.id.cityTV);
        TextView artTV = (TextView) findViewById(R.id.artTV);
        TextView historyTV = (TextView) findViewById(R.id.historyTV);
        TextView foodTV = (TextView) findViewById(R.id.foodTV);

        // click listeners
        cityTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cityIntent = new Intent(MainActivity.this, CityActivity.class);
                startActivity(cityIntent);
            }
        });

        artTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artIntent = new Intent(MainActivity.this, ArtActivity.class);
                startActivity(artIntent);
            }
        });

        historyTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent historyIntent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(historyIntent);
            }
        });

        foodTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(foodIntent);
            }
        });
    }
}
