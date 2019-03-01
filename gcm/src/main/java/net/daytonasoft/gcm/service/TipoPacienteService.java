package net.daytonasoft.gcm.service;

import net.daytonasoft.gcm.domain.TipoPaciente;
import java.util.List;

public interface TipoPacienteService {

	public abstract List<TipoPaciente> listAllTipoPacientes();
	public abstract TipoPaciente addTipoPaciente(TipoPaciente tipoPaciente);
	public abstract int removeTipoPaciente(int id);
	public abstract TipoPaciente updateTipoPaciente(TipoPaciente tipoPaciente);

}
