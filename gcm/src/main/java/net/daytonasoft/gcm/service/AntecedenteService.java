package net.daytonasoft.gcm.service;

import net.daytonasoft.gcm.domain.Antecedente;
import java.util.List;

public interface AntecedenteService {

	public abstract List<Antecedente> listAllAntecedente();
	public abstract Antecedente addAntecedente(Antecedente antecedente);
	public abstract int removeAntecedente(int id);
	public abstract Antecedente updateAntecedente(Antecedente antecedente);

}
