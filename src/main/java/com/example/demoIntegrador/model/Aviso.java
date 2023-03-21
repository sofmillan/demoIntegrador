package com.example.demoIntegrador.model;

public class Aviso {
    private String mensaje;

    public Aviso(){}

    public Aviso(String mensaje){
        this.mensaje = mensaje;
    }
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
