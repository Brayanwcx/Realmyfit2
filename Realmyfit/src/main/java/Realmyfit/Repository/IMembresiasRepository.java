package Realmyfit.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.Realmyfit.model.Membresia;

@Repository
public interface IMembresiasRepository extends JpaRepository<Membresia, Integer> {
    List<Membresia> findByUsuarioId(Integer idUsuario);
    List<Membresia> findByGimnasioId(Integer idGimnasio);
    List<Membresia> findByFechaInicioBetween(LocalDate inicio, LocalDate fin);
    List<Membresia> findByPrecioLessThan(Double precio);
}