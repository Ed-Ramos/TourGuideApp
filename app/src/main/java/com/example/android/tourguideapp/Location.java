package com.example.android.tourguideapp;

/**
 * Created by Edwin on 7/14/2017.
 */

public class Location {

    private String mName;

    private String mInfo;

    public Location(String Name, String Info) {
        mName = Name;
        mInfo = Info;
    }

    /* get the location name */
    public String getName() {
        return mName;
    }

    /* get the location information */
    public String getInfo() {
        return mInfo;
    }
}
