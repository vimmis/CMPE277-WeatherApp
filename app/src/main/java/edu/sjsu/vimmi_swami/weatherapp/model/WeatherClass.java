package edu.sjsu.vimmi_swami.weatherapp.model;

import java.util.List;

/**
 * Created by VimmiRao on 10/18/2017.
 */

public class WeatherClass {
    private Coord coord;
    private List<Weather> weatherList;
    private String base;
    private Main main;
    private Wind wind;
    private Cloud cloud;
    private int dt;
    private Sys sys;
    private int id;
    private String name;
    private int cod;

    public WeatherClass(Coord coord, List<Weather> weatherList, String base, Main main, Wind wind, Cloud cloud, int dt, Sys sys, int id, String name, int cod) {
        this.coord = coord;
        this.weatherList = weatherList;
        this.base = base;
        this.main = main;
        this.wind = wind;
        this.cloud = cloud;
        this.dt = dt;
        this.sys = sys;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<Weather> getWeatherList() {
        return weatherList;
    }

    public void setWeatherList(List<Weather> weatherList) {
        this.weatherList = weatherList;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Cloud getCloud() {
        return cloud;
    }

    public void setCloud(Cloud cloud) {
        this.cloud = cloud;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
