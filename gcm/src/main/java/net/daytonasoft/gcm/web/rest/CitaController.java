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
import net.daytonasoft.gcm.domain.Cita;
 
import net.daytonasoft.gcm.domain.Persona;
import net.daytonasoft.gcm.service.CitaService;
import net.daytonasoft.gcm.service.LoginService;
import net.daytonasoft.gcm.service.PersonaService;
 
import net.daytonasoft.gcm.domain.TipoCita;
import net.daytonasoft.gcm.domain.Usuario;
import net.daytonasoft.gcm.service.CitaService;
import net.daytonasoft.gcm.service.TipoCitaService;


@org.springframework.web.bind.annotation.RestController
public class CitaController {
 
	
	@Autowired
	@Qualifier("citaServiceImpl")
	private CitaService citaService;

	@CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/citas")
	public ResponseEntity<List<Cita>> getAllCitas(){ 
		return new ResponseEntity(citaService.listAllCitas(),HttpStatus.OK);
	}

	
	@PostMapping("/citas")
	public ResponseEntity<Cita> addCourses(@Valid @RequestBody Cita cita) {
		return new ResponseEntity(citaService.addCita(cita),HttpStatus.OK);
	}
	
	@PutMapping("/citas")
	public ResponseEntity<Cita>  updateCourses(@Valid @RequestBody Cita cita) {
		return new ResponseEntity(citaService.updateCita(cita),HttpStatus.OK);
	}
	
	@DeleteMapping("/citas/{id}")
	public boolean deleteCitas(@PathVariable int id) {
		return citaService.removeCita(id) > 0;
	}
	
}
