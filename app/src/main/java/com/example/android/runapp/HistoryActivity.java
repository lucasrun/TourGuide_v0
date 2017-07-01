package com.example.android.runapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by mhesah on 2017-07-01.
 */

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_main);

        // Create a list of words
        final ArrayList<CustomData> customData = new ArrayList<CustomData>();
        customData.add(new CustomData(R.drawable.icon_history_01, R.string.history01));
        customData.add(new CustomData(R.drawable.icon_history_02, R.string.history02));
        customData.add(new CustomData(R.drawable.icon_history_03, R.string.history03));
        customData.add(new CustomData(R.drawable.icon_history_04, R.string.history04));

        // setting adapters
        CustomDataAdapter customDataAdapter = new CustomDataAdapter(this, customData);
        ListView listView = (ListView) findViewById(R.id.main_list);
        listView.setAdapter(customDataAdapter);

    }
}
