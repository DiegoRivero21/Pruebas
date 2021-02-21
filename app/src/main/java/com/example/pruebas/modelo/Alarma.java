package com.example.pruebas.modelo;

public class Alarma {

    private String hora;
    private boolean activo;

    public Alarma(String hora, boolean activo) {
        this.activo = activo;
        this.hora = hora;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}