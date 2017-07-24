package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ResortsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        /* create a new list of resort locations */
        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.resort1),getString(R.string.resort1_info)));
        locations.add(new Location(getString(R.string.resort2),getString(R.string.resort2_info)));
        locations.add(new Location(getString(R.string.resort3),getString(R.string.resort3_info)));
        locations.add(new Location(getString(R.string.resort4),getString(R.string.resort4_info)));
        locations.add(new Location(getString(R.string.resort5),getString(R.string.resort5_info)));
        locations.add(new Location(getString(R.string.resort6),getString(R.string.resort6_info)));
        locations.add(new Location(getString(R.string.resort7),getString(R.string.resort7_info)));
        locations.add(new Location(getString(R.string.resort8),getString(R.string.resort8_info)));
        locations.add(new Location(getString(R.string.resort9),getString(R.string.resort9_info)));
        locations.add(new Location(getString(R.string.resort10),getString(R.string.resort10_info)));

        LocationAdapter  adapter =
                new LocationAdapter(this,locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
