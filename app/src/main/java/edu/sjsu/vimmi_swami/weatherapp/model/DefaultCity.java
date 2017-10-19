package edu.sjsu.vimmi_swami.weatherapp.model;

/**
 * Created by VimmiRao on 10/18/2017.
 */

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class DefaultCity extends AppCompatActivity implements LocationListener {

    LocationManager lm;
    String provider;
    Location location;

    SharedPreferences prefs;

    public DefaultCity(Activity activity) {
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // If user hasnt chosen city, return current location.

    String getCity() {
        lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        provider = lm.getBestProvider(new Criteria(), true);
        location = lm.getLastKnownLocation(provider);
        if(location != null) {
            getUserGeoInfo(location.getLatitude(), location.getLongitude());
        }


        return prefs.getString("city", "Sydney, AU");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }
    LocationListener locationListener = new LocationListener() {

        public void onLocationChanged(Location location) {
            // Called when a new location is found by the network location provider.
            getUserGeoInfo(location.getLatitude(), location.getLongitude());
        }

        public void onStatusChanged(String provider, int status, Bundle extras) {}

        public void onProviderEnabled(String provider) {}

        public void onProviderDisabled(String provider) {}
    };


    void getUserGeoInfo(double lat, double lon) {
        Geocoder geoCoder = new Geocoder(Context, Locale.getDefault());
        if (Geocoder.isPresent()) {
            List<Address> addresses = null;
            try {
                addresses = geoCoder.getFromLocation(lat, lon, 1);
            } catch (IOException e) {
                Log.e("ERROR", e.printStackTrace());
            }
            if (addresses.size() > 0) {
                // obtain all information from addresses.get(0)
            }
        }
    }
}
