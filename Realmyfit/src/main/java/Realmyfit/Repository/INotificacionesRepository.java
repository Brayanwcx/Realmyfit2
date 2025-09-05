package Realmyfit.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.Realmyfit.model.Notificacion;

@Repository
public interface INotificacionesRepository extends JpaRepository<Notificacion, Integer> {
    List<Notificacion> findByUsuarioId(Integer idUsuario);
    List<Notificacion> findByTipoNotificacion(String tipo);
}