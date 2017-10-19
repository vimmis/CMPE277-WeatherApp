package edu.sjsu.vimmi_swami.weatherapp.model;

/**
 * Created by VimmiRao on 10/18/2017.
 */

public class Weather {
    private int id;
    private String main;
    private String desc;
    private String icon;

    public Weather(int id, String main, String desc, String icon) {
        this.id = id;
        this.main = main;
        this.desc = desc;
        this.icon = icon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
