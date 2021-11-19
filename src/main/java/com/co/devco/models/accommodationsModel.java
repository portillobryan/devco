package com.co.devco.models;

public class accommodationsModel {

    private String ubication;
    private String depart;
    private String datein;
    private String dateout;
    private String hotel;
    private String room;
    private String name;
    private String lastname;
    private String email;

    public accommodationsModel(String ubication, String depart, String datein, String dateout, String hotel, String room, String name, String lastname, String email) {
        this.ubication = ubication;
        this.depart = depart;
        this.datein = datein;
        this.dateout = dateout;
        this.hotel = hotel;
        this.room = room;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }

    public String getUbication() {
        return ubication;
    }

    public String getDepart() {
        return depart;
    }

    public String getDatein() {
        return datein;
    }

    public String getDateout() {
        return dateout;
    }

    public String getHotel() {
        return hotel;
    }

    public String getRoom() {
        return room;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }
}
