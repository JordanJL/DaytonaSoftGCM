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
import net.daytonasoft.gcm.domain.Alergia;
import net.daytonasoft.gcm.domain.Antecedente;
import net.daytonasoft.gcm.domain.Persona;
import net.daytonasoft.gcm.domain.Antecedente;
import net.daytonasoft.gcm.service.AlergiaService;
import net.daytonasoft.gcm.service.AntecedenteService;
 
import net.daytonasoft.gcm.service.AntecedenteService;


@org.springframework.web.bind.annotation.RestController 
public class AntecedenteController {

	@Autowired
	@Qualifier("antecedenteServiceImpl")
	private AntecedenteService antecedenteService;
	
	@GetMapping("/antecedentes")
	public ResponseEntity<List<Antecedente>> getAllAntecedentes(){ 
		
		return new ResponseEntity(antecedenteService.listAllAntecedente(),HttpStatus.OK);
	}

	
	@PostMapping("/antecedentes")
	public ResponseEntity<Antecedente> addAntecedentes(@Valid @RequestBody Antecedente antecedentes) {
		return new ResponseEntity(antecedenteService.addAntecedente(antecedentes),HttpStatus.OK);
	}
	
	@PutMapping("/antecedentes")
	public ResponseEntity<Antecedente>  updateAntecedentes(@Valid @RequestBody Antecedente antecedentes) {
		return new ResponseEntity(antecedenteService.updateAntecedente(antecedentes),HttpStatus.OK);
	}
	
	@DeleteMapping("/antecedentes/{id}")
	public boolean deleteAntecedentes(@PathVariable int id) {
		return antecedenteService.removeAntecedente(id) > 0;
	}
	
}
