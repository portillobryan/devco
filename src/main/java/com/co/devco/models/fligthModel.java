package com.co.devco.models;

public class fligthModel {

    private String origen;
    private String destino;
    private String datein;
    private String dateout;

    public fligthModel(String origen, String destino, String datein, String dateout) {
        this.origen = origen;
        this.destino = destino;
        this.datein = datein;
        this.dateout = dateout;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getDatein() {
        return datein;
    }

    public String getDateout() {
        return dateout;
    }
}
