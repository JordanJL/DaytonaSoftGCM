package net.daytonasoft.gcm.web.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.daytonasoft.gcm.domain.Alergia;
import net.daytonasoft.gcm.service.AlergiaService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/restalergias")
public class RestController {

	@Autowired
	@Qualifier("alergiaServiceImpl")
	private AlergiaService alergiaService;
	
	@GetMapping("/listall")
	public ResponseEntity<List<Alergia>> getAllAlergias(){
		List<Alergia> ale= alergiaService.listAllAlergias();
		System.out.println("alergiaService.listAllAlergias()");
		return new ResponseEntity(ale,HttpStatus.OK);
	}

}
