package net.daytonasoft.gcm.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.daytonasoft.gcm.domain.EstadoCivil;
import net.daytonasoft.gcm.repository.EstadoCivilJpaRepository;
import net.daytonasoft.gcm.service.EstadoCivilService;

@Service("estadoCivilServiceImpl")
public class EstadoCivilServiceImpl implements EstadoCivilService{

	@Autowired
	@Qualifier("estadoCivilRepository")
	private EstadoCivilJpaRepository estadoCivilJpaRepository;
	@Override
	public List<EstadoCivil> listAllEstadoCivil() {
		// TODO Auto-generated method stub
		Pageable pag= PageRequest.of(0,1000);
		return estadoCivilJpaRepository.findAll(pag).getContent();
	}

	@Override
	public EstadoCivil addEstadoCivil(EstadoCivil estadoCivil) {
		// TODO Auto-generated method stub
		return estadoCivilJpaRepository.save(estadoCivil); 
	}

	@Override
	public int removeEstadoCivil(int id) {
		// TODO Auto-generated method stub
		estadoCivilJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public EstadoCivil updateEstadoCivil(EstadoCivil estadoCivil) {
		// TODO Auto-generated method stub
		return estadoCivilJpaRepository.save(estadoCivil); 
	}

	
}
