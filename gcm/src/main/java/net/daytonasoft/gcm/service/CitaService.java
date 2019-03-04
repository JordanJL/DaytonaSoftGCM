package net.daytonasoft.gcm.service;

import net.daytonasoft.gcm.domain.Cita;
import java.util.List;

public interface CitaService {

	public abstract List<Cita> listAllCitas();
	public abstract Cita addCita(Cita cita);
	public abstract int removeCita(int id);
	public abstract Cita updateCita(Cita cita);

}
