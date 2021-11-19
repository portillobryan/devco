package com.co.devco.models;

public class carsModel {

    private String location;
    private String mounthin;
    private String datein;
    private String mounthout;
    private String dateout;

    public carsModel(String location, String mounthin, String datein, String mounthout, String dateout) {
        this.location = location;
        this.mounthin = mounthin;
        this.datein = datein;
        this.mounthout = mounthout;
        this.dateout = dateout;
    }

    public String getLocation() {
        return location;
    }

    public String getMounthin() {
        return mounthin;
    }

    public String getDatein() {
        return datein;
    }

    public String getMounthout() {
        return mounthout;
    }

    public String getDateout() {
        return dateout;
    }
}
