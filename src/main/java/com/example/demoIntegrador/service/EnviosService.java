package com.example.demoIntegrador.service;

import com.example.demoIntegrador.model.Cliente;
import com.example.demoIntegrador.model.Envio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnviosService {
    private List<Envio> envios;
    public Envio createEnvio(Envio envio){
        envios.add(envio);
        return envio;
    }
}
