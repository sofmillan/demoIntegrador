package com.example.demoIntegrador.model;

public class Usuario {
    private String cedula;
    private String nombre;
    private String apellidos;
    private long celular;
    private String correo;
    private String direccion;
    private String ciudad;

    public Usuario(){}
    public Usuario(String cedula, String nombre, String apellidos, long celular, String correo, String direccion, String ciudad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.celular = celular;
        this.correo = correo;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public long getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
}
