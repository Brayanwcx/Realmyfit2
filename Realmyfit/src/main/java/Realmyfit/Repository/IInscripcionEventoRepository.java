package Realmyfit.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.Realmyfit.model.InscripcionEvento;

@Repository
public interface IInscripcionEventoRepository extends JpaRepository<InscripcionEvento, Integer> {
    List<InscripcionEvento> findByUsuarioId(Integer idUsuario);
    List<InscripcionEvento> findByGimnasioId(Integer idGimnasio);
    List<InscripcionEvento> findByAsistencia(Boolean asistencia);
}