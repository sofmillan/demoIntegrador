package com.example.demoIntegrador.service;


import com.example.demoIntegrador.model.Envio;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnviosService {
    private List<Envio> envios;

    public EnviosService() {
        this.envios = new ArrayList<>();
    }

    public Envio createEnvio(Envio envio){
        envios.add(envio);
        return envio;
    }

    public List<Envio> filterByStatus( String estado){
        return envios.stream().filter(envio-> envio.getEstado().equals(estado)).collect(Collectors.toList());
    }
}
