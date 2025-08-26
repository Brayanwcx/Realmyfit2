package com.Realmyfit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Realmyfit.model.Pago;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Long> {

}
