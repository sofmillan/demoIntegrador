package com.example.demoIntegrador.service;

import com.example.demoIntegrador.model.Aviso;
import com.example.demoIntegrador.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientesService {

    private List<Cliente> clientes;

    public ClientesService(){
        this.clientes = new ArrayList<>();
    }

    public Cliente getClient(String cedula){
        return clientes
                .stream()
                .filter(cliente -> cliente.getCedula().equals(cedula))
                .findFirst().get();
    }

    public List<Cliente> getClients(){
        return clientes;
    }
    public Cliente createClient(Cliente client){
        clientes.add(client);
        return client;
    }

    public Aviso deleteClient(String cedula){
       clientes.removeIf(client -> client.getCedula().equals(cedula));
       return new Aviso("El cliente con cedula "+ cedula +" fue eliminado con exito");
    }

    public Cliente updateClient(String cedula, Cliente client){
        for(int i =0; i<clientes.size();i++){
            Cliente cliente = clientes.get(i);
            if(cliente.getCedula().equals(cedula)){
                clientes.set(i, client);
                return client;
            }
        }
        return getClient(cedula);
    }
}
