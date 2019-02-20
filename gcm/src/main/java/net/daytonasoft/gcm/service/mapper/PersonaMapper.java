package net.daytonasoft.gcm.service.mapper;

import org.springframework.stereotype.Component;

import net.daytonasoft.gcm.domain.Persona;
import net.daytonasoft.gcm.service.dto.PersonaDTO;
@Component("personaMapper")
public class PersonaMapper {

	public PersonaDTO entityToModel(Persona persona) {
		PersonaDTO personaDTO = new PersonaDTO();
		personaDTO.setNombre(persona.getNombre());
		personaDTO.setApellidos(persona.getApellidos());
//		personaDTO.setDescription(persona.getDescription());
//		personaDTO.setPrice(persona.getPrice());
//		personaDTO.setHours(persona.getHours());
		return personaDTO;
	}
	
	public Persona modelToEntity(PersonaDTO personaDTO) {
		Persona personaEntity = new Persona();
		personaEntity.setNombre(personaDTO.getNombre());
		personaEntity.setApellidos(personaDTO.getApellidos());
//		personaEntity.setDescription(personaDTO.getDescription());
//		personaEntity.setPrice(personaDTO.getPrice());
//		personaEntity.setHours(personaDTO.getHours());
		return personaEntity;
	}
}

