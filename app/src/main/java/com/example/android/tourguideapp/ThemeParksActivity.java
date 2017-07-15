package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ThemeParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme_parks);

        /* create a new list of theme park locations */
        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location("ThemePark1","ThemeParkInfo1"));
        locations.add(new Location("ThemePark2","ThemeParkInfo2"));
        locations.add(new Location("ThemePark3","ThemeParkInfo3"));
        locations.add(new Location("ThemePark4","ThemeParkInfo4"));
        locations.add(new Location("ThemePark5","ThemeParkInfo5"));


    }
}
