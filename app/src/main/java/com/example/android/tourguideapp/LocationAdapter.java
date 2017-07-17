package com.example.android.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Edwin on 7/15/2017.
 */

public class LocationAdapter extends ArrayAdapter<Location> {


    public LocationAdapter(Activity context, ArrayList<Location> locations) {

        // Initialize the ArrayAdapter's internal storage for the context and the list.
        // Since we are using a custom adapter for two TextViews and an ImageView, the adapter does not
        // use the second argument. It can can be any value. Here, we used 0. NOTE: This argument is used
        // when the ArrayAdapter is populating a single TextView
        super(context, 0, locations);
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }

        // Get the {@link Location} object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the location name from the current Location object and
        // set this text on the name TextView
        nameTextView.setText(currentLocation.getName());

        // Find the TextView in the list_item.xml layout with the ID info_text_view
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.info_text_view);
        // Get the location info from the current Location object and
        // set this text on the Info TextView
        numberTextView.setText(currentLocation.getInfo());

        return listItemView;
    }
}
