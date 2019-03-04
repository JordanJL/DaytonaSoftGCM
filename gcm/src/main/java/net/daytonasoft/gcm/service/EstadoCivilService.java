package net.daytonasoft.gcm.service;

import net.daytonasoft.gcm.domain.EstadoCivil;
import java.util.List;

public interface EstadoCivilService {
 
	public abstract List<EstadoCivil> listAllEstadoCivil();
	public abstract EstadoCivil addEstadoCivil(EstadoCivil estadoCivil);
	public abstract int removeEstadoCivil(int id);
	public abstract EstadoCivil updateEstadoCivil(EstadoCivil estadoCivil);

}
