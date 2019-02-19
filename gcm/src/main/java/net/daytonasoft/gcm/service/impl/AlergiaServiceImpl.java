package net.daytonasoft.gcm.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import net.daytonasoft.gcm.domain.Alergia;
import net.daytonasoft.gcm.repository.AlergiaJPARepository;
import net.daytonasoft.gcm.service.AlergiaService;

@Service("alergiaServiceImpl")
public class AlergiaServiceImpl implements AlergiaService{

	@Autowired
	@Qualifier("alergiaRepository")
	private AlergiaJPARepository alergiaJpaRepository;
	@Override
	public List<Alergia> listAllAlergias() {
		// TODO Auto-generated method stub
		return alergiaJpaRepository.findAll();
	}

	@Override
	public Alergia addCourse(Alergia alergia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int removeAlergia(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Alergia updateCourse(Alergia alergia) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
