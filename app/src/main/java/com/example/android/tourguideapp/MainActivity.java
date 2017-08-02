package com.example.android.tourguideapp;

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

        // Find the View that shows the theme parks category
        TextView theme_parks = (TextView) findViewById(R.id.theme_parks);

        // Set a click listener on that View
        theme_parks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the theme parks category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ThemeParksActivity}
                Intent theme_parks_Intent = new Intent(MainActivity.this, ThemeParksActivity.class);

                // Start the new activity
                startActivity(theme_parks_Intent);
            }
        });

        // Find the View that shows the resorts category
        TextView resorts = (TextView) findViewById(R.id.resorts);

        // Set a click listener on that View
        resorts.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the resorts category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ResortsActivity}
                Intent resortsIntent = new Intent(MainActivity.this, ResortsActivity.class);

                // Start the new activity
                startActivity(resortsIntent);
            }
        });

        // Find the View that shows the golf category
        TextView golf = (TextView) findViewById(R.id.golf);

        // Set a click listener on that View
        golf.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the golf category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GolfActivity}
                Intent GolfIntent = new Intent(MainActivity.this, GolfActivity.class);

                // Start the new activity
                startActivity(GolfIntent);
            }
        });

        // Find the View that shows the entertainment category
        TextView entertainment = (TextView) findViewById(R.id.entertainment);

        // Set a click listener on that View
        entertainment.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the entertainment category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link EntertainmentActivity}
                Intent entertainmentIntent = new Intent(MainActivity.this, EntertainmentActivity.class);

                // Start the new activity
                startActivity(entertainmentIntent);
            }
        });

























    }
}
