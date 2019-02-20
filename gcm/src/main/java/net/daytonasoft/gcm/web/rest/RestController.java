package net.daytonasoft.gcm.web.rest;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import net.daytonasoft.gcm.domain.Alergia;
 
import net.daytonasoft.gcm.domain.Persona;
import net.daytonasoft.gcm.service.AlergiaService;
import net.daytonasoft.gcm.service.PersonaService;
 
import net.daytonasoft.gcm.domain.TipoCita;
import net.daytonasoft.gcm.service.AlergiaService;
import net.daytonasoft.gcm.service.TipoCitaService;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/restalergias")
public class RestController {
 
	
	@Autowired
	@Qualifier("alergiaServiceImpl")
	private AlergiaService alergiaService;
	
	@GetMapping("/listall")
	public ResponseEntity<List<Alergia>> getAllAlergias(){ 
		return new ResponseEntity(alergiaService.listAllAlergias(),HttpStatus.OK);
	}

	
	@PostMapping("/addalergia")
	public ResponseEntity<Alergia> addCourses(@Valid @RequestBody Alergia alergia) {
		return new ResponseEntity(alergiaService.addAlergia(alergia),HttpStatus.OK);
	}
	
	@PutMapping("/updatealergia")
	public ResponseEntity<Alergia>  updateCourses(@Valid @RequestBody Alergia alergia) {
		return new ResponseEntity(alergiaService.updateAlergia(alergia),HttpStatus.OK);
	}
	
	@DeleteMapping("/deletealergia/{id}")
	public boolean deleteAlergias(@PathVariable int id) {
		return alergiaService.removeAlergia(id) > 0;
	}
	
	@Autowired
	@Qualifier("tipoCitaServiceImpl")
	private TipoCitaService tipoCitaService;
	
	@GetMapping("/listalltipocitas")
	public ResponseEntity<List<TipoCita>> getAllTipoCitas(){ 
		return new ResponseEntity(tipoCitaService.listAllTipoCitas(),HttpStatus.OK);
	}

	
}
