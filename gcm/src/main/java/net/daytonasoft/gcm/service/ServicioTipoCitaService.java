package net.daytonasoft.gcm.service;

import net.daytonasoft.gcm.domain.ServicioTipoCita;
import java.util.List;

public interface ServicioTipoCitaService {

	public abstract List<ServicioTipoCita> listAllServicioTipoCitas();
	public abstract ServicioTipoCita addServicioTipoCita(ServicioTipoCita servicioTipoCita);
	public abstract int removeServicioTipoCita(int id);
	public abstract ServicioTipoCita updateServicioTipoCita(ServicioTipoCita servicioTipoCita);

}
