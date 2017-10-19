package edu.sjsu.vimmi_swami.weatherapp.model;

/**
 * Created by VimmiRao on 10/18/2017.
 */

public class Coord {

    private Double lon;
    private Double lat;

    public Coord(Double lon, Double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }
}
