package Realmyfit.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.Realmyfit.model.Pagos;

@Repository
public interface IPagosRepository extends JpaRepository<Pagos, Integer> {
    List<Pagos> findByUsuarioId(Integer idUsuario);
    List<Pagos> findByFechaPagosBetween(LocalDate inicio, LocalDate fin);
    List<Pagos> findByMedioPago(String medioPago);
}