package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class GolfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);


        /* create a new list of golf locations */
        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.golf1),getString(R.string.golf1_info)));
        locations.add(new Location(getString(R.string.golf2),getString(R.string.golf2_info)));
        locations.add(new Location(getString(R.string.golf3),getString(R.string.golf3_info)));
        locations.add(new Location(getString(R.string.golf4),getString(R.string.golf4_info)));
        locations.add(new Location(getString(R.string.golf5),getString(R.string.golf5_info)));
        locations.add(new Location(getString(R.string.golf6),getString(R.string.golf6_info)));
        locations.add(new Location(getString(R.string.golf7),getString(R.string.golf7_info)));
        locations.add(new Location(getString(R.string.golf8),getString(R.string.golf8_info)));
        locations.add(new Location(getString(R.string.golf9),getString(R.string.golf9_info)));
        locations.add(new Location(getString(R.string.golf10),getString(R.string.golf10_info)));


        LocationAdapter  adapter =
                new LocationAdapter(this,locations,R.color.category_golf);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
