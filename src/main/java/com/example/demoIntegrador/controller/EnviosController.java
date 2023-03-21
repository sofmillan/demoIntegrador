package com.example.demoIntegrador.controller;

import com.example.demoIntegrador.model.Empleado;
import com.example.demoIntegrador.model.Envio;
import com.example.demoIntegrador.service.EnviosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/envios-api")
public class EnviosController {

    private EnviosService enviosService;

    @Autowired
    public EnviosController(EnviosService enviosService) {
        this.enviosService = enviosService;
    }

    @PostMapping("/empleado")
    public ResponseEntity<Envio> addEnvio(@RequestBody Envio envio){
        Envio envio1 = enviosService.createEnvio(envio);
        return ResponseEntity.ok(envio1);
    }
}
