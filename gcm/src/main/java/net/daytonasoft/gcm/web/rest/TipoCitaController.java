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
import net.daytonasoft.gcm.domain.TipoCita;
 
import net.daytonasoft.gcm.domain.Persona;
import net.daytonasoft.gcm.service.TipoCitaService;
import net.daytonasoft.gcm.service.LoginService;
import net.daytonasoft.gcm.service.PersonaService;
 
import net.daytonasoft.gcm.domain.TipoCita;
import net.daytonasoft.gcm.domain.Usuario;
import net.daytonasoft.gcm.service.TipoCitaService;
import net.daytonasoft.gcm.service.TipoCitaService;


@org.springframework.web.bind.annotation.RestController 
public class TipoCitaController {

	@Autowired
	@Qualifier("tipoCitaServiceImpl")
	private TipoCitaService tipoCitaService;
	
	@GetMapping("/tipocitas")
	public ResponseEntity<List<TipoCita>> getAllTipoCitas(){ 
		
		return new ResponseEntity(tipoCitaService.listAllTipoCitas(),HttpStatus.OK);
	}

	@PostMapping("/tipocitas")
	public ResponseEntity<TipoCita> addCourses(@Valid @RequestBody TipoCita tipoCita) {
		return new ResponseEntity(tipoCitaService.addTipoCita(tipoCita),HttpStatus.OK);
	}
	
	@PutMapping("/tipocitas")
	public ResponseEntity<TipoCita>  updateCourses(@Valid @RequestBody TipoCita tipoCita) {
		return new ResponseEntity(tipoCitaService.updateTipoCita(tipoCita),HttpStatus.OK);
	}
	
	@DeleteMapping("/tipocitas/{id}")
	public boolean deleteTipoCitas(@PathVariable int id) {
		return tipoCitaService.removeTipoCita(id) > 0;
	}

}
