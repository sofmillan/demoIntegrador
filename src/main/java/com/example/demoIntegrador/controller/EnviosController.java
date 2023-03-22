package com.example.demoIntegrador.controller;

import com.example.demoIntegrador.model.Empleado;
import com.example.demoIntegrador.model.Envio;
import com.example.demoIntegrador.service.EnviosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EnviosController {

    private EnviosService enviosService;

    @Autowired
    public EnviosController(EnviosService enviosService) {
        this.enviosService = enviosService;
    }

    @PostMapping("/envio")
    public ResponseEntity<Envio> addEnvio(@RequestBody Envio envio){
        Envio envio1 = enviosService.createEnvio(envio);
        return ResponseEntity.ok(envio1);
    }

    @GetMapping("/envio")
    public List<Envio> filterByStatus(@RequestParam String estado, @RequestParam String cedulaEmpelado){
        return enviosService.filterByStatus(estado);
    }
}
