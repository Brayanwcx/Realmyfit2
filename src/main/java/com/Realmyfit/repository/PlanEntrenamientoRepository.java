package com.Realmyfit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Realmyfit.model.PlanEntrenamiento;


@Repository
public interface PlanEntrenamientoRepository extends JpaRepository<PlanEntrenamiento,Long> {
}
