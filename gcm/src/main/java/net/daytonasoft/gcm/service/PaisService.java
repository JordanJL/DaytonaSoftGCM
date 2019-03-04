package net.daytonasoft.gcm.service;

import net.daytonasoft.gcm.domain.Pais;
import java.util.List;

public interface PaisService {

	public abstract List<Pais> listAllPaises();
	public abstract Pais addPais(Pais pais);
	public abstract int removePais(int id);
	public abstract Pais updatePais(Pais pais);

}
