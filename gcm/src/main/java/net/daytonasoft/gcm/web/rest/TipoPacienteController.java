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
import net.daytonasoft.gcm.domain.TipoPaciente;
 
import net.daytonasoft.gcm.domain.Persona;
import net.daytonasoft.gcm.service.TipoPacienteService;
import net.daytonasoft.gcm.service.LoginService;
import net.daytonasoft.gcm.service.PersonaService;
 
import net.daytonasoft.gcm.domain.TipoCita; 
import net.daytonasoft.gcm.domain.Usuario;
import net.daytonasoft.gcm.service.TipoPacienteService;
import net.daytonasoft.gcm.service.TipoCitaService;


@org.springframework.web.bind.annotation.RestController
public class TipoPacienteController {
 
	
	@Autowired
	@Qualifier("tipoPacienteServiceImpl")
	private TipoPacienteService tipoPacienteService;

	@CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/tipoPacientes")
	public ResponseEntity<List<TipoPaciente>> getAllTipoPaciente(){ 
		return new ResponseEntity(tipoPacienteService.listAllTipoPacientes(),HttpStatus.OK);
	}

	
	@PostMapping("/tipoPacientes")
	public ResponseEntity<TipoPaciente> addCourses(@Valid @RequestBody TipoPaciente tipoPaciente) {
		return new ResponseEntity(tipoPacienteService.addTipoPaciente(tipoPaciente),HttpStatus.OK);
	}
	
	@PutMapping("/tipoPacientes")
	public ResponseEntity<TipoPaciente>  updateCourses(@Valid @RequestBody TipoPaciente tipoPaciente) {
		return new ResponseEntity(tipoPacienteService.updateTipoPaciente(tipoPaciente),HttpStatus.OK);
	}
	
	@DeleteMapping("/tipoPacientes/{id}")
	public boolean deleteTipoPaciente(@PathVariable int id) {
		return tipoPacienteService.removeTipoPaciente(id) > 0;
	}
	
}
