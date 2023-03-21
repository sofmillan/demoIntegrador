package com.example.demoIntegrador.controller;

import com.example.demoIntegrador.model.Aviso;
import com.example.demoIntegrador.model.Empleado;
import com.example.demoIntegrador.service.EmpleadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados-api")
public class EmpleadosController {

    private EmpleadosService empleadosService;

    @Autowired
    public EmpleadosController(EmpleadosService empleadosService) {
        this.empleadosService = empleadosService;
    }


    @GetMapping("/empleados")
    public List<Empleado> getEmployees(){
        return this.empleadosService.getEmployees();
    }

    @GetMapping("/empleado/{cedula}")
    public Empleado getEmployee(@PathVariable String cedula){
        return this.empleadosService.getEmployee(cedula);
    }

    @PostMapping("/empleado")
    public ResponseEntity<Empleado> addEmployee(@RequestBody Empleado empleado){
        Empleado empleado1 = empleadosService.createEmployee(empleado);
        return ResponseEntity.ok(empleado1);
    }

    @DeleteMapping("/empleado/{cedula}")
    public Aviso deleteEmployee(@PathVariable String cedula){
        return this.empleadosService.deleteEmployee(cedula);
    }

    @PutMapping("/empleado/{cedula}")
    public Empleado updateEmployee(@PathVariable String cedula, @RequestBody Empleado empleado){
        return this.empleadosService.updateEmployee(cedula, empleado);
    }



}
