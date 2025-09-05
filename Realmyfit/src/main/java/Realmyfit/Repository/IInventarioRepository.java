package Realmyfit.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.Realmyfit.model.Inventario;

@Repository
public interface IInventarioRepository extends JpaRepository<Inventario, Integer> {
    List<Inventario> findByProductosContaining(String producto);
    List<Inventario> findByGimnasioId(Integer idGimnasio);
}