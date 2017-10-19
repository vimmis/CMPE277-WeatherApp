package edu.sjsu.vimmi_swami.weatherapp.model;

/**
 * Created by VimmiRao on 10/18/2017.
 */

public class Sys {

    private int type;
    private int id;
    private String msg;
    private String country;
    private String sunrise;
    private String sunset;

    public Sys(int type, int id, String msg, String country, String sunrise, String sunset) {
        this.type = type;
        this.id = id;
        this.msg = msg;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }
}
