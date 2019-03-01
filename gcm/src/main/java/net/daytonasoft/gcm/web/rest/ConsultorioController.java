package net.daytonasoft.gcm.web.rest;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import net.daytonasoft.gcm.domain.Consultorio;
 
import net.daytonasoft.gcm.domain.Persona;
import net.daytonasoft.gcm.service.ConsultorioService;
import net.daytonasoft.gcm.service.LoginService;
import net.daytonasoft.gcm.service.PersonaService;
 
import net.daytonasoft.gcm.domain.TipoCita;
import net.daytonasoft.gcm.domain.Usuario;
import net.daytonasoft.gcm.service.ConsultorioService;
import net.daytonasoft.gcm.service.TipoCitaService;


@org.springframework.web.bind.annotation.RestController
public class ConsultorioController {
 
	
	@Autowired
	@Qualifier("consultorioServiceImpl")
	private ConsultorioService consultorioService;

	@CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/consultorios")
	public ResponseEntity<List<Consultorio>> getAllConsultorios(){ 
		return new ResponseEntity(consultorioService.listAllConsultorios(),HttpStatus.OK);
	}

	
	@PostMapping("/consultorios")
	public ResponseEntity<Consultorio> addCourses(@Valid @RequestBody Consultorio consultorio) {
		return new ResponseEntity(consultorioService.addConsultorio(consultorio),HttpStatus.OK);
	}
	
	@PutMapping("/consultorios")
	public ResponseEntity<Consultorio>  updateCourses(@Valid @RequestBody Consultorio consultorio) {
		return new ResponseEntity(consultorioService.updateConsultorio(consultorio),HttpStatus.OK);
	}
	
	@DeleteMapping("/consultorios/{id}")
	public boolean deleteConsultorios(@PathVariable int id) {
		return consultorioService.removeConsultorio(id) > 0;
	}
	
}
