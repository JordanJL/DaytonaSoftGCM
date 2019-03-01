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
import net.daytonasoft.gcm.domain.Referencia;
 
import net.daytonasoft.gcm.domain.Persona;
import net.daytonasoft.gcm.service.ReferenciaService;
import net.daytonasoft.gcm.service.LoginService;
import net.daytonasoft.gcm.service.PersonaService;
 
import net.daytonasoft.gcm.domain.TipoCita;
import net.daytonasoft.gcm.domain.Usuario;
import net.daytonasoft.gcm.service.ReferenciaService;
import net.daytonasoft.gcm.service.TipoCitaService;


@org.springframework.web.bind.annotation.RestController
public class ReferenciaController {
 
	
	@Autowired
	@Qualifier("referenciaServiceImpl")
	private ReferenciaService referenciaService;

	@CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/referencias")
	public ResponseEntity<List<Referencia>> getAllReferencias(){ 
		return new ResponseEntity(referenciaService.listAllReferencias(),HttpStatus.OK);
	}

	
	@PostMapping("/referencias")
	public ResponseEntity<Referencia> addCourses(@Valid @RequestBody Referencia referencia) {
		return new ResponseEntity(referenciaService.addReferencia(referencia),HttpStatus.OK);
	}
	
	@PutMapping("/referencias")
	public ResponseEntity<Referencia>  updateCourses(@Valid @RequestBody Referencia referencia) {
		return new ResponseEntity(referenciaService.updateReferencia(referencia),HttpStatus.OK);
	}
	
	@DeleteMapping("/referencias/{id}")
	public boolean deleteReferencias(@PathVariable int id) {
		return referenciaService.removeReferencia(id) > 0;
	}
	
}
