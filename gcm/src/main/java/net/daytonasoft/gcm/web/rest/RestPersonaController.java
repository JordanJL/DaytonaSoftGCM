package net.daytonasoft.gcm.web.rest;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.daytonasoft.gcm.domain.Alergia;
import net.daytonasoft.gcm.domain.Persona;
import net.daytonasoft.gcm.service.PersonaService;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/personas")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class RestPersonaController {

	@Autowired
	@Qualifier("personaServiceImpl")
	private PersonaService personaService;

	
	@GetMapping("/personas")
	public ResponseEntity<List<Persona>> getAllPersonas(){ 
		return new ResponseEntity(personaService.listAllPersonas(),HttpStatus.OK);
	}
	
	@GetMapping("/personas/{id}")
	public ResponseEntity<List<Persona>> getDetailsPersona(@PathVariable int id){ 
		return new ResponseEntity(personaService.findOne(id),HttpStatus.OK);
	}
	
	@PostMapping("/personas")
	public ResponseEntity<Persona> addPersona(@Valid @RequestBody Persona persona) {
		return new ResponseEntity(personaService.addPersona(persona),HttpStatus.OK);
	}
	
	@PutMapping("/personas")
	public ResponseEntity<Persona>  updateCourses(@Valid @RequestBody Persona persona) {
		return new ResponseEntity(personaService.updatePersona(persona),HttpStatus.OK);
	}
	
	@DeleteMapping("/personas/{id}")
	public boolean deletePersona(@PathVariable int id) {
		return personaService.removePersona(id) > 0;
	}
	

}



