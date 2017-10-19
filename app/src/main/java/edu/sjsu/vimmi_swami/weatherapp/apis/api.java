package edu.sjsu.vimmi_swami.weatherapp.apis;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by VimmiSwami on 10/18/2017.
 * lab2, Cmpe277_lab2
 */

public class api {

    public static String key= "4d24bc6be2371dad87666ac843e640ad";
    public static String link= "http://api.openweathermap.org/data/2.5/Weather";

    public static String request(int city){
        StringBuilder sb= new StringBuilder(link);
        sb.append(String.format("?q=%s&APPID=%s&units=metric",city,key));
        return sb.toString();
    }

    public static String timeConversion(double unixTime){
        DateFormat df= new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long) unixTime*1000);
        return df.format(date);

    }

    public static String getIcon(String icon){
        return String.format("http://api.openweathermap.org/img/w/%s.png", icon);
    }

    public static String gettodayDate(){
        DateFormat df=  new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date = new Date();
        return df.format(date);
    }
}
