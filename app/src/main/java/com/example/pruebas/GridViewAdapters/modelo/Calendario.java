package com.example.pruebas.GridViewAdapters.modelo;

public class Calendario {

    private String mes;
    private int imagen;

    public Calendario(int imagen, String mes) {
        this.imagen = imagen;
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

}
