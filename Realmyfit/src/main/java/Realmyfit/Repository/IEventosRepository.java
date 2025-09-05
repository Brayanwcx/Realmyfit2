package Realmyfit.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.Realmyfit.model.Evento;

@Repository
public interface IEventosRepository extends JpaRepository<Evento, Integer> {
	List<Evento> findByTituloContaining(String titulo);

	List<Evento> findByFecha(LocalDate fecha);

	List<Evento> findByGimnasioId(Integer idGimnasio);
}