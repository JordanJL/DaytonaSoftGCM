package net.daytonasoft.gcm.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import net.daytonasoft.gcm.domain.Usuario;
import net.daytonasoft.gcm.repository.AlergiaJpaRepository;
import net.daytonasoft.gcm.repository.UsuarioJpaRepository;
import net.daytonasoft.gcm.service.LoginService;

@Service("loginServiceImpl")
public class LoginServiceImpl implements LoginService{

	@Autowired
	@Qualifier("usuarioRepository") 
	private UsuarioJpaRepository usuarioJpaRepository;
	
	@Override
	public HttpStatus loginAction(String username, String clave) {
		int userId = usuarioJpaRepository.loginAction(username, clave);
		if (userId == 0) {
			return HttpStatus.UNAUTHORIZED;
		}else {
			return HttpStatus.OK;
		}
	}

}
