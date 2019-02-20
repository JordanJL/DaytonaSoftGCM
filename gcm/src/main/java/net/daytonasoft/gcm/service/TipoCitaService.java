package net.daytonasoft.gcm.service;

import net.daytonasoft.gcm.domain.TipoCita;
import java.util.List;

public interface TipoCitaService {

	public abstract List<TipoCita> listAllTipoCitas();
	public abstract TipoCita addTipoCita(TipoCita tipoCita);
	public abstract int removeTipoCita(int id);
	public abstract TipoCita updateTipoCita(TipoCita tipoCita);

}
