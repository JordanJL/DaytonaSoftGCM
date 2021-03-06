package net.daytonasoft.gcm.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.daytonasoft.gcm.domain.Alergia;
import net.daytonasoft.gcm.repository.AlergiaJpaRepository;
import net.daytonasoft.gcm.service.AlergiaService;

@Service("alergiaServiceImpl")
public class AlergiaServiceImpl implements AlergiaService{

	@Autowired
	@Qualifier("alergiaRepository")
	private AlergiaJpaRepository alergiaJpaRepository;
	@Override
	public List<Alergia> listAllAlergias() {
		// TODO Auto-generated method stub
		Pageable pag= PageRequest.of(0,2);
		return alergiaJpaRepository.findAll(pag).getContent();
	}

	@Override
	public Alergia addAlergia(Alergia alergia) {
		// TODO Auto-generated method stub
		return alergiaJpaRepository.save(alergia); 
	}

	@Override
	public int removeAlergia(int id) {
		// TODO Auto-generated method stub
		alergiaJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public Alergia updateAlergia(Alergia alergia) {
		// TODO Auto-generated method stub
		return alergiaJpaRepository.save(alergia);
	}

	
}
