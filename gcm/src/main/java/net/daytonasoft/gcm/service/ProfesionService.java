package net.daytonasoft.gcm.service;

import net.daytonasoft.gcm.domain.Profesion;
import java.util.List;

public interface ProfesionService {

	public abstract List<Profesion> listAllProfesiones();
	public abstract Profesion addProfesion(Profesion profesion);
	public abstract int removeProfesion(int id);
	public abstract Profesion updateProfesion(Profesion profesion);

}
