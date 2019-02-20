package net.daytonasoft.gcm.service;

import net.daytonasoft.gcm.domain.Alergia;
import java.util.List;

public interface AlergiaService {

	public abstract List<Alergia> listAllAlergias();
	public abstract Alergia addAlergia(Alergia alergia);
	public abstract int removeAlergia(int id);
	public abstract Alergia updateAlergia(Alergia alergia);

}
