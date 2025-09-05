package Realmyfit.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.Realmyfit.model.Gimnasio;

@Repository
public interface IGimnasioRepository extends JpaRepository<Gimnasio, Integer> {
    List<Gimnasio> findByNombreContaining(String nombre);
    List<Gimnasio> findByDireccion(String direccion);
    List<Gimnasio> findByUsuarioId(Integer idUsuario);
}