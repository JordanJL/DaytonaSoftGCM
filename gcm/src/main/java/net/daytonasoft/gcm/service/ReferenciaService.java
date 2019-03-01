package net.daytonasoft.gcm.service;

import net.daytonasoft.gcm.domain.Referencia;
import java.util.List;

public interface ReferenciaService {

	public abstract List<Referencia> listAllReferencias();
	public abstract Referencia addReferencia(Referencia Referencia);
	public abstract int removeReferencia(int id);
	public abstract Referencia updateReferencia(Referencia Referencia);

}
