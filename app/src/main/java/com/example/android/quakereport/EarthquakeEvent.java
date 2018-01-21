package com.example.android.quakereport;

/**
 * Created by c4q on 1/20/18.
 */

// this is our custom model object

public class EarthquakeEvent {

    // we use hungarian notation here bc it's what the aosp uses. it's not strictly required. the m stands for member

    private String mPlace;
    private Double mMagnitude;
    private String mTimestamp;

    // Init the object as we would in Swift, of course

    public EarthquakeEvent(String place, Double magnitude, String time) {
        mPlace = place;
        mMagnitude = magnitude;
        mTimestamp = time;
    }

    // our member fields are private, so we set up some methods to expose them safely

    public String getPlace() {
        return mPlace;
    }

    public Double getMagnitude() {
        return mMagnitude;
    }

    public String getTimestamp() {
        return mTimestamp;
    }
}
