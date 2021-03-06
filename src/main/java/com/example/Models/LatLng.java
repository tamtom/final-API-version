package com.example.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by baraa on 2/28/2017.
 */

@Entity(name="line_way_points")
public class LatLng {

    @Id
    @GeneratedValue
    private long lineWayId;
    private double longitude;
    private double latitude;
    private long lineId;
    private boolean isStop;


    public LatLng(double latitude, double longitude, long lineId, boolean isStop) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.lineId = lineId;
        this.isStop = isStop;
    }

    public LatLng(){}


    public long getLineWayId() {
        return lineWayId;
    }

    public void setLineWayId(long lineWayId) {
        this.lineWayId = lineWayId;
    }


    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public long getLineId() {
        return lineId;
    }

    public void setLineId(long lineId) {
        this.lineId = lineId;
    }

    public boolean isStop() {
        return isStop;
    }

    public void setStop(boolean stop) {
        isStop = stop;
    }
}
