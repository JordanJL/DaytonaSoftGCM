package net.daytonasoft.gcm.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.daytonasoft.gcm.domain.Pais;
import net.daytonasoft.gcm.repository.PaisJpaRepository;
import net.daytonasoft.gcm.service.PaisService;

@Service("paisServiceImpl")
public class PaisServiceImpl implements PaisService{

	@Autowired
	@Qualifier("paisRepository")
	private PaisJpaRepository paisJpaRepository;
	@Override
	public List<Pais> listAllPaises() {
		// TODO Auto-generated method stub
		Pageable pag= PageRequest.of(0,1000);
		return paisJpaRepository.findAll(pag).getContent();
	}

	@Override
	public Pais addPais(Pais pais) {
		// TODO Auto-generated method stub
		return paisJpaRepository.save(pais); 
	}

	@Override
	public int removePais(int id) {
		// TODO Auto-generated method stub
		paisJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public Pais updatePais(Pais pais) {
		// TODO Auto-generated method stub
		return paisJpaRepository.save(pais);
	}

	
}
