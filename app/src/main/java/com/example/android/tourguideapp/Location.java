package com.example.android.tourguideapp;

/**
 * Created by Edwin on 7/14/2017.
 */

public class Location {

    private String mName;

    private String mInfo;

    /** Image resource ID for the location */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this location*/
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(String Name, String Info) {
        mName = Name;
        mInfo = Info;
    }

    public Location(String Name, String Info, int ImageResourceId) {
        mName = Name;
        mInfo = Info;
        mImageResourceId = ImageResourceId;

    }

    /* get the location name */
    public String getName() {
        return mName;
    }

    /* get the location information */
    public String getInfo() {
        return mInfo;
    }


    /**
     * Return the image resource ID of the location.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }

}
