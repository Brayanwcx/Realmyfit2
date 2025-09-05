package Realmyfit.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.Realmyfit.model.Rol;

@Repository
public interface IRolesRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByNombre(String nombre);
}