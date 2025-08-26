package com.Realmyfit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Realmyfit.model.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {

}
