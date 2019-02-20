package net.daytonasoft.gcm.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import net.daytonasoft.gcm.domain.Alergia;
import net.daytonasoft.gcm.domain.TipoCita;
import net.daytonasoft.gcm.repository.AlergiaJpaRepository;
import net.daytonasoft.gcm.repository.TipoCitaJpaRepository;
import net.daytonasoft.gcm.service.AlergiaService;
import net.daytonasoft.gcm.service.TipoCitaService;

@Service("tipoCitaServiceImpl")
public class TipoCitaServiceImpl implements TipoCitaService{

	@Autowired
	@Qualifier("tipoCitaRepository")
	private TipoCitaJpaRepository tipoCitaJpaRepository;
	@Override
	public List<TipoCita> listAllTipoCitas() {
		// TODO Auto-generated method stub
		return tipoCitaJpaRepository.findAll();
	}

	@Override
	public TipoCita addTipoCita(TipoCita tipoCita) {
		// TODO Auto-generated method stub
		return tipoCitaJpaRepository.save(tipoCita); 
	}

	@Override
	public int removeTipoCita(int id) {
		// TODO Auto-generated method stub
		tipoCitaJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public TipoCita updateTipoCita(TipoCita tipoCita) {
		// TODO Auto-generated method stub
		return tipoCitaJpaRepository.save(tipoCita);
	}

	
}
