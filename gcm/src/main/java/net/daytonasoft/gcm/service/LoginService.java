package net.daytonasoft.gcm.service;

import org.springframework.http.HttpStatus;

import net.daytonasoft.gcm.domain.Usuario;

public interface LoginService {

	public abstract HttpStatus loginAction(String usuario, String clave);

}
