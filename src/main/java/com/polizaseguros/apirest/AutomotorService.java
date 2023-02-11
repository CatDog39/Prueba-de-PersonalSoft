package com.polizaseguros.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutomotorService {
    @Autowired
    private AutomotorRepository automotorRepository;

    public List<Automotor> findAll(){
        return automotorRepository.findAll();
    }

    public Automotor save(Automotor automotor){
        return automotorRepository.save(automotor);
    }

    public Automotor get(Integer matriculaAutomor){
        return automotorRepository.getReferenceById(matriculaAutomor);
    }

    public void delete(Integer matriculaAutomotor){
        automotorRepository.deleteById(matriculaAutomotor);
    }
}
