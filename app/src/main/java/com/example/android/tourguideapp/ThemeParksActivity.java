package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ThemeParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        /* create a new list of theme park locations */
        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.theme_park1),getString(R.string.theme_park_info1),R.drawable.animal_kingdom));
        locations.add(new Location(getString(R.string.theme_park2),getString(R.string.theme_park_info2),R.drawable.aquatica));
        locations.add(new Location(getString(R.string.theme_park3),getString(R.string.theme_park_info3),R.drawable.blizzard_beach));
        locations.add(new Location(getString(R.string.theme_park4),getString(R.string.theme_park_info4),R.drawable.hollywood_studios));
        locations.add(new Location(getString(R.string.theme_park5),getString(R.string.theme_park_info5),R.drawable.epcot));
        locations.add(new Location(getString(R.string.theme_park6),getString(R.string.theme_park_info6),R.drawable.gatorland));
        locations.add(new Location(getString(R.string.theme_park7),getString(R.string.theme_park_info7),R.drawable.holy_land_experience));
        locations.add(new Location(getString(R.string.theme_park8),getString(R.string.theme_park_info8),R.drawable.islands_of_adventure));
        locations.add(new Location(getString(R.string.theme_park9),getString(R.string.theme_park_info9),R.drawable.magic_kingdom));
        locations.add(new Location(getString(R.string.theme_park10),getString(R.string.theme_park_info10),R.drawable.seaworld));
        locations.add(new Location(getString(R.string.theme_park11),getString(R.string.theme_park_info11),R.drawable.typhoon_lagoon));
        locations.add(new Location(getString(R.string.theme_park12),getString(R.string.theme_park_info12),R.drawable.wetnwild));


        LocationAdapter  adapter =
                new LocationAdapter(this,locations,R.color.category_theme_parks);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
