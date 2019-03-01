package net.daytonasoft.gcm.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.daytonasoft.gcm.domain.ServicioTipoCita;
import net.daytonasoft.gcm.repository.ServicioTipoCitaJpaRepository;
import net.daytonasoft.gcm.service.ServicioTipoCitaService;

@Service("servicioTipoCitaServiceImpl")
public class ServicioTipoCitaServiceImpl implements ServicioTipoCitaService{

	@Autowired
	@Qualifier("servicioTipoCitaRepository")
	private ServicioTipoCitaJpaRepository servicioTipoCitaJpaRepository;
	@Override
	public List<ServicioTipoCita> listAllServicioTipoCitas() {
		// TODO Auto-generated method stub
		Pageable pag= PageRequest.of(0,2);
		return servicioTipoCitaJpaRepository.findAll(pag).getContent();
	}

	@Override
	public ServicioTipoCita addServicioTipoCita(ServicioTipoCita servicioTipoCita) {
		// TODO Auto-generated method stub
		return servicioTipoCitaJpaRepository.save(servicioTipoCita); 
	}

	@Override
	public int removeServicioTipoCita(int id) {
		// TODO Auto-generated method stub
		servicioTipoCitaJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public ServicioTipoCita updateServicioTipoCita(ServicioTipoCita servicioTipoCita) {
		// TODO Auto-generated method stub
		return servicioTipoCitaJpaRepository.save(servicioTipoCita);
	}

	
}
