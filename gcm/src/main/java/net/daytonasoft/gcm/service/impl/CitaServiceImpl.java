package net.daytonasoft.gcm.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.daytonasoft.gcm.domain.Cita;
import net.daytonasoft.gcm.repository.CitaJpaRepository;
import net.daytonasoft.gcm.service.CitaService;

@Service("citaServiceImpl")
public class CitaServiceImpl implements CitaService{

	@Autowired
	@Qualifier("citaRepository")
	private CitaJpaRepository citaJpaRepository;
	@Override
	public List<Cita> listAllCitas() {
		// TODO Auto-generated method stub
		Pageable pag= PageRequest.of(0,2);
		return citaJpaRepository.findAll(pag).getContent();
	}

	@Override
	public Cita addCita(Cita cita) {
		// TODO Auto-generated method stub
		return citaJpaRepository.save(cita); 
	}

	@Override
	public int removeCita(int id) {
		// TODO Auto-generated method stub
		citaJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public Cita updateCita(Cita cita) {
		// TODO Auto-generated method stub
		return citaJpaRepository.save(cita);
	}

	
}
