package com.example.demoIntegrador.model;

public class Cliente extends Usuario{

    public Cliente(){}
    public Cliente(String cedula, String nombre, String apellidos, long celular, String correo, String direccion, String ciudad) {
        super(cedula, nombre, apellidos, celular, correo, direccion, ciudad);
    }
}

