package net.daytonasoft.gcm.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.daytonasoft.gcm.domain.Antecedente;
import net.daytonasoft.gcm.repository.AntecedenteJpaRepository;
import net.daytonasoft.gcm.service.AntecedenteService;

@Service("antecedenteServiceImpl")
public class AntecedenteServiceImpl implements AntecedenteService{

	@Autowired
	@Qualifier("antecedenteRepository")
	private AntecedenteJpaRepository antecedenteJpaRepository;
	@Override
	public List<Antecedente> listAllAntecedente() {
		// TODO Auto-generated method stub
		Pageable pag= PageRequest.of(0,2);
		return antecedenteJpaRepository.findAll(pag).getContent();
	}

	@Override
	public Antecedente addAntecedente(Antecedente antecedente) {
		// TODO Auto-generated method stub
		return antecedenteJpaRepository.save(antecedente); 
	}

	@Override
	public int removeAntecedente(int id) {
		// TODO Auto-generated method stub
		antecedenteJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public Antecedente updateAntecedente(Antecedente antecedente) {
		// TODO Auto-generated method stub
		return antecedenteJpaRepository.save(antecedente);
	}

	
}
