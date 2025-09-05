package Realmyfit.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.Realmyfit.model.Factura;

@Repository
public interface IFacturaRepository extends JpaRepository<Factura, Integer> {
    List<Factura> findByUsuarioId(Integer idUsuario);
    List<Factura> findByReciboPagoContaining(String reciboPago);
}