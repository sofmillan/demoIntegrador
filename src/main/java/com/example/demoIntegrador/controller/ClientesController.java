package com.example.demoIntegrador.controller;


import com.example.demoIntegrador.model.Aviso;
import com.example.demoIntegrador.model.Cliente;
import com.example.demoIntegrador.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ClientesController {

    private ClientesService clienteService;

    @Autowired
    public ClientesController(ClientesService clienteService) {
        this.clienteService = clienteService;
    }



    @GetMapping("/clientes")
    public List<Cliente> getClients(){
        return this.clienteService.getClients();
    }

    @GetMapping("/cliente/{cedula}")
    public Cliente getClient(@PathVariable String cedula){
        return this.clienteService.getClient(cedula);
    }

    @PostMapping("/cliente")
    public ResponseEntity<Cliente> addClient(@RequestBody Cliente client){
        Cliente client1 = clienteService.createClient(client);
        return ResponseEntity.ok(client1);
    }

    @DeleteMapping("/cliente/{cedula}")
    public Aviso deleteClient(@PathVariable String cedula){
        return this.clienteService.deleteClient(cedula);
    }

    @PutMapping("/cliente/{cedula}")
    public Cliente updateClient(@PathVariable String cedula, @RequestBody Cliente client){
       return this.clienteService.updateClient(cedula, client);
    }




}
