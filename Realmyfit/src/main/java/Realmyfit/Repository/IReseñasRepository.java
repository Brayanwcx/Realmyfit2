package Realmyfit.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.Realmyfit.model.Reseña;

@Repository
public interface IReseñasRepository extends JpaRepository<Reseña, Integer> {
    List<Reseña> findByUsuarioId(Integer idUsuario);
    List<Reseña> findByCalificacion(Integer calificacion);
    List<Reseña> findByFechaReseñaAfter(LocalDate fecha);
}