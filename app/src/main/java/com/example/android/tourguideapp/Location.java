package com.example.android.tourguideapp;

public class Location {

    /** Value that represents name for this location*/
    private String mName;

    /** Value that represents information about this location*/
    private String mInfo;

    /** Value that represents star rating for this location*/
    private float mRating = NO_RATING_PROVIDED;

    /** Image resource ID for the location */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this location*/
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Constant value that represents no image was provided for this location*/
    private static final float NO_RATING_PROVIDED = -1;

    public Location(String Name, String Info) {
        mName = Name;
        mInfo = Info;

    }

    public Location(String Name, String Info, int ImageResourceId) {
        mName = Name;
        mInfo = Info;
        mImageResourceId = ImageResourceId;

    }

    public Location(String Name, String Info, float Rating) {
        mName = Name;
        mInfo = Info;
        mRating = Rating;

    }
    /* get the location name */
    public String getName() {
        return mName;
    }

    /* get the location information */
    public String getInfo() {
        return mInfo;
    }

    /* Return the image resource ID of the location. */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /* get the rating for this location */
    public float getRating() {
        return mRating;
    }

    /* Returns whether or not there is an image for this word. */
     public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasRating() {
        return mRating != NO_RATING_PROVIDED;
    }

}
