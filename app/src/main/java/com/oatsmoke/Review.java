package com.oatsmoke;

/**
 * Created by abe707 on 7/12/15.
 */
public class Review {
    public final double LAT;
    public final double LNG;
    public final Shelf SHELF;

    enum Shelf{TOP,MID,DIRT};

    public Review(){
        LAT = 42.3598;
        LNG = -71.0921;
        SHELF = Shelf.TOP;
    }

    public Review(double lat, double lng, Shelf shelf){
        LAT = lat;
        LNG = lng;
        SHELF = shelf;
    }




}
