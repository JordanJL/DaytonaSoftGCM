package net.daytonasoft.gcm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.daytonasoft.gcm.domain.Usuario;

@Repository("usuarioRepository")
public interface UsuarioJpaRepository extends JpaRepository<Usuario,Integer> {
 
	@Procedure(name="loginaction")
	int loginAction(@Param("username_p") String username, @Param ("clave_p") String clave);

	

}
