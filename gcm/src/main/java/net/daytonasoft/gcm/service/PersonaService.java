package net.daytonasoft.gcm.service;


import java.util.List;
import java.util.Optional;

import net.daytonasoft.gcm.domain.Alergia;
import net.daytonasoft.gcm.domain.Persona;

public interface PersonaService {
	
	public abstract List<Persona> listAllPersonas();
	public abstract Optional<Persona> findOne(int id);
	public abstract Persona addPersona(Persona persona);
	public abstract int removePersona(int id);
	public abstract Persona updatePersona(Persona persona);
}
