package net.daytonasoft.gcm.web.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import net.daytonasoft.gcm.service.LoginService;
import net.daytonasoft.gcm.domain.Usuario;


@org.springframework.web.bind.annotation.RestController
public class LoginController {

	@Autowired
	@Qualifier("loginServiceImpl")
	private LoginService loginService;

@CrossOrigin(origins = "http://localhost:8081")
@PostMapping("/login")	
public ResponseEntity login( @Valid @RequestBody Usuario usuario){ 
	HttpStatus status=  loginService.loginAction(usuario.getUsername(),usuario.getPassword());
	if ( status == HttpStatus.OK) {
		return new ResponseEntity(status, HttpStatus.OK);
	}else {
		return new ResponseEntity(status, HttpStatus.UNAUTHORIZED);
	}
//	return loginService.loginAction(usuario.getUsername(),usuario.getPassword());
}
}
