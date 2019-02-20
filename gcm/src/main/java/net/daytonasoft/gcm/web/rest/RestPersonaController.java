package net.daytonasoft.gcm.web.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import net.daytonasoft.gcm.domain.Persona;
import net.daytonasoft.gcm.service.PersonaService;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("/restpersonas")
public class RestPersonaController {

	@Autowired
	@Qualifier("personaServiceImpl")
	private PersonaService personaService;
	/*
	@GetMapping("/listall")
	public ResponseEntity<List<Persona>> getAllPersona(){
		List<Persona> per= personaService.listAllPersonas();
		System.out.println("personaService.listAllPersona()");
		return new ResponseEntity(per,HttpStatus.OK);
	}
	*/
	

	@GetMapping("/listone")
	public ResponseEntity<List<Persona>> getSinglePersona(){
		Optional<Persona> per= personaService.listSinglePersona();
		System.out.println("personaService.listAllPersona()");
		return new ResponseEntity(per,HttpStatus.OK);
	}
	
	@GetMapping("/listone/{id}")
	public Optional<Persona> getPersona(@PathVariable int id) {
		return personaService.findOne(id);
		
	}
	
	@DeleteMapping("/listone/{id}")
	public boolean deletePersona(@PathVariable int id) {
		personaService.removePersona(id);
		return true;
		
	}
	
	@PostMapping("/listone")
	public Persona createPersona(Persona persona) {
		return personaService.addPersona(persona);		
	}
	
	@PutMapping("/listone")
	public Persona Update(Persona persona) {
		return personaService.updatePersona(persona);		
	}
}
