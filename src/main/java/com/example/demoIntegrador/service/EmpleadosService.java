package com.example.demoIntegrador.service;

import com.example.demoIntegrador.model.Aviso;
import com.example.demoIntegrador.model.Cliente;
import com.example.demoIntegrador.model.Empleado;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmpleadosService {

    private List<Empleado> empleados;

    public EmpleadosService(){
        this.empleados = new ArrayList<>();
    }


    public List<Empleado> getEmployees(){
        return empleados;
    }
    public Empleado getEmployee(String cedula){
        return empleados
                .stream()
                .filter(empleado -> empleado.getCedula().equals(cedula))
                .findFirst().get();
    }


    public Empleado createEmployee(Empleado client){
        empleados.add(client);
        return client;
    }

    public Aviso deleteEmployee(String cedula){
        empleados.removeIf(empleado -> empleado.getCedula().equals(cedula));
        return new Aviso("El empleado con cedula "+ cedula +" fue eliminado con exito");
    }

    public Empleado updateEmployee(String cedula, Empleado empleado){
        for(int i = 0; i< empleados.size(); i++){
            Empleado empleado1 = empleados.get(i);
            if(empleado1.getCedula().equals(cedula)){
                empleados.set(i, empleado);
                return empleado;
            }
        }
        return getEmployee(cedula);
    }
}
