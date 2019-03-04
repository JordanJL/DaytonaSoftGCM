package net.daytonasoft.gcm.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.daytonasoft.gcm.domain.Profesion;
import net.daytonasoft.gcm.repository.ProfesionJpaRepository;
import net.daytonasoft.gcm.service.ProfesionService;

@Service("profesionServiceImpl")
public class ProfesionServiceImpl implements ProfesionService{

	@Autowired
	@Qualifier("profesionRepository")
	private ProfesionJpaRepository profesionJpaRepository;
	@Override
	public List<Profesion> listAllProfesiones() {
		// TODO Auto-generated method stub
		Pageable pag= PageRequest.of(0,1000);
		return profesionJpaRepository.findAll(pag).getContent();
	}

	@Override
	public Profesion addProfesion(Profesion profesion) {
		// TODO Auto-generated method stub
		return profesionJpaRepository.save(profesion); 
	}

	@Override
	public int removeProfesion(int id) {
		// TODO Auto-generated method stub
		profesionJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public Profesion updateProfesion(Profesion profesion) {
		// TODO Auto-generated method stub
		return profesionJpaRepository.save(profesion);
	}

	
}
