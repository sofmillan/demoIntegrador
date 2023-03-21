package com.example.demoIntegrador.model;

public class Envio {
    private String cedulaCliente;
    private String ciudadOrigen;
    private String ciudadDestino;
    private String direccionDestino;
    private String nombreRecibe;
    private long celular;
    private int valorDeclarado;
    private int peso;

    public Envio() {
    }

    public Envio(String cedulaCliente, String ciudadOrigen, String ciudadDestino, String direccionDestino,
                 String nombreRecibe, long celular, int valorDeclarado, int peso) {
        this.cedulaCliente = cedulaCliente;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.direccionDestino = direccionDestino;
        this.nombreRecibe = nombreRecibe;
        this.celular = celular;
        this.valorDeclarado = valorDeclarado;
        this.peso = peso;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public String getNombreRecibe() {
        return nombreRecibe;
    }

    public long getCelular() {
        return celular;
    }

    public int getValorDeclarado() {
        return valorDeclarado;
    }

    public int getPeso() {
        return peso;
    }
}
