package Realmyfit.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.Realmyfit.model.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
	Optional<Usuario> findByCorreo(String correo);

	Optional<Usuario> findByIdentificacion(String identificacion);

	Optional<Usuario> findByNombreAndApellido(String nombre, String apellido);

	List<Usuario> findByGenero(String genero);

	List<Usuario> findByUbicacion(String ubicacion);
}