package com.polizaseguros.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente get(Integer idCliente){
        return clienteRepository.getReferenceById(idCliente);
    }

    public void delete(Integer idCliente){
        clienteRepository.deleteById(idCliente);
    }
}
