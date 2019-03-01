package net.daytonasoft.gcm.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import net.daytonasoft.gcm.domain.Consultorio;
import net.daytonasoft.gcm.repository.ConsultorioJpaRepository; 
import net.daytonasoft.gcm.service.ConsultorioService;

@Service("consultorioServiceImpl")
public class ConsultorioServiceImpl implements ConsultorioService{


	@Autowired
	@Qualifier("consultorioRepository")
	private ConsultorioJpaRepository consultorioJpaRepository;
	@Override
	public List<Consultorio> listAllConsultorios() {
		// TODO Auto-generated method stub
		return consultorioJpaRepository.findAll();
	}

	@Override
	public Consultorio addConsultorio(Consultorio consultorio) {
		// TODO Auto-generated method stub
		return consultorioJpaRepository.save(consultorio); 
	}

	@Override
	public int removeConsultorio(int id) {
		// TODO Auto-generated method stub
		consultorioJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public Consultorio updateConsultorio(Consultorio consultorio) {
		// TODO Auto-generated method stub
		return consultorioJpaRepository.save(consultorio);
	}

	
	
}
