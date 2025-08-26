package com.Realmyfit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Realmyfit.model.Ejercicio;

@Repository
public interface EjercicioRepository extends JpaRepository<Ejercicio,Long> {

}
