package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EntertainmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);


        /* create a new list of entertainment locations */
        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.entertainment1),getString(R.string.entertainment1_info)));
        locations.add(new Location(getString(R.string.entertainment2),getString(R.string.entertainment2_info)));
        locations.add(new Location(getString(R.string.entertainment3),getString(R.string.entertainment3_info)));
        locations.add(new Location(getString(R.string.entertainment4),getString(R.string.entertainment4_info)));
        locations.add(new Location(getString(R.string.entertainment5),getString(R.string.entertainment5_info)));
        locations.add(new Location(getString(R.string.entertainment6),getString(R.string.entertainment6_info)));
        locations.add(new Location(getString(R.string.entertainment7),getString(R.string.entertainment7_info)));
        locations.add(new Location(getString(R.string.entertainment8),getString(R.string.entertainment8_info)));
        locations.add(new Location(getString(R.string.entertainment9),getString(R.string.entertainment9_info)));
        locations.add(new Location(getString(R.string.entertainment10),getString(R.string.entertainment10_info)));

        LocationAdapter  adapter =
                new LocationAdapter(this,locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
