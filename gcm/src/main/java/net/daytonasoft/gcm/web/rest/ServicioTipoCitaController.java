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
import net.daytonasoft.gcm.domain.ServicioTipoCita;
 
import net.daytonasoft.gcm.domain.Persona;
import net.daytonasoft.gcm.service.ServicioTipoCitaService;
import net.daytonasoft.gcm.service.LoginService;
import net.daytonasoft.gcm.service.PersonaService;
 
import net.daytonasoft.gcm.domain.TipoCita;
import net.daytonasoft.gcm.domain.Usuario;
import net.daytonasoft.gcm.service.ServicioTipoCitaService;
import net.daytonasoft.gcm.service.TipoCitaService;


@org.springframework.web.bind.annotation.RestController
public class ServicioTipoCitaController {
 
	
	@Autowired
	@Qualifier("servicioTipoCitaServiceImpl")
	private ServicioTipoCitaService servicioTipoCitaService;

	@CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/serviciotipocitas")
	public ResponseEntity<List<ServicioTipoCita>> getAllServicioTipoCitas(){ 
		return new ResponseEntity(servicioTipoCitaService.listAllServicioTipoCitas(),HttpStatus.OK);
	}

	
	@PostMapping("/serviciotipocitas")
	public ResponseEntity<ServicioTipoCita> addServicioTipoCitas(@Valid @RequestBody ServicioTipoCita serviciotipocitas) {
		return new ResponseEntity(servicioTipoCitaService.addServicioTipoCita(serviciotipocitas),HttpStatus.OK);
	}
	
	@PutMapping("/serviciotipocitas")
	public ResponseEntity<ServicioTipoCita>  updateServicioTipoCitas(@Valid @RequestBody ServicioTipoCita serviciotipocitas) {
		return new ResponseEntity(servicioTipoCitaService.updateServicioTipoCita(serviciotipocitas),HttpStatus.OK);
	}
	
	@DeleteMapping("/serviciotipocitas/{id}")
	public boolean deleteServicioTipoCitas(@PathVariable int id) {
		return servicioTipoCitaService.removeServicioTipoCita(id) > 0;
	}
	
}
