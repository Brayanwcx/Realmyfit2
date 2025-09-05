package Realmyfit.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.Realmyfit.model.ObjetoDeportivo;

@Repository
public interface IObjetosDeportivosRepository extends JpaRepository<ObjetoDeportivo, Integer> {
    List<ObjetoDeportivo> findByNombreObjetoContaining(String nombre);
    List<ObjetoDeportivo> findByNumeroObjeto(Integer numeroObjeto);
    List<ObjetoDeportivo> findByInventarioId(Integer idInventario);
}