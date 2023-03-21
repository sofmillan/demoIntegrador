package com.example.demoIntegrador.model;

public class Empleado extends Usuario {
    private int antiguedad;
    private String rh;
    private String tipoEmpleado;

    public Empleado(){}
    public Empleado(String cedula, String nombre, String apellidos, long celular, String correo, String direccion, String ciudad, int antiguedad, String rh, String tipoEmpleado) {
        super(cedula, nombre, apellidos, celular, correo, direccion, ciudad);
        this.antiguedad = antiguedad;
        this.rh = rh;
        this.tipoEmpleado = tipoEmpleado;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public String getRh() {
        return rh;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }
}

