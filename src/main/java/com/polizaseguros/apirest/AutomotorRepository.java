package com.polizaseguros.apirest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomotorRepository extends JpaRepository<Automotor, Integer> {

}
