package net.daytonasoft.gcm.service;

import net.daytonasoft.gcm.domain.Consultorio;
import java.util.List;

public interface ConsultorioService {

	public abstract List<Consultorio> listAllConsultorios();
	public abstract Consultorio addConsultorio(Consultorio consultorio);
	public abstract int removeConsultorio(int id);
	public abstract Consultorio updateConsultorio(Consultorio consultorio);

}
