package com.polizaseguros.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class PolizaService {
    @Autowired
    private PolizaRepository polizaRepository;

    public List<Poliza> finAll(){
        return polizaRepository.findAll();
    }

    public Poliza save(Poliza poliza){
        return polizaRepository.save(poliza);
    }

    public Poliza get(Integer idPoliza){
        return polizaRepository.getReferenceById(idPoliza);
    }

    public void delete(Integer idPoliza){
        polizaRepository.deleteById(idPoliza);
    }
}
