package com.example.android.runapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by mhesah on 2017-07-01.
 */

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_main);

        // Create a list of words
        final ArrayList<CustomData> customData = new ArrayList<CustomData>();
        customData.add(new CustomData(R.drawable.icon_food_01, R.string.food01));
        customData.add(new CustomData(R.drawable.icon_food_02, R.string.food02));
        customData.add(new CustomData(R.drawable.icon_food_03, R.string.food03));
        customData.add(new CustomData(R.drawable.icon_food_04, R.string.food04));

        // setting adapters
        CustomDataAdapter customDataAdapter = new CustomDataAdapter(this, customData);
        ListView listView = (ListView) findViewById(R.id.main_list);
        listView.setAdapter(customDataAdapter);

    }
}
