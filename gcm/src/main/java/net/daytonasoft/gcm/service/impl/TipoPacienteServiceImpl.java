package net.daytonasoft.gcm.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.daytonasoft.gcm.domain.TipoPaciente;
import net.daytonasoft.gcm.repository.TipoPacienteJpaRepository;
import net.daytonasoft.gcm.service.TipoPacienteService;

@Service("tipoPacienteServiceImpl")
public class TipoPacienteServiceImpl implements TipoPacienteService{

	@Autowired
	@Qualifier("tipoPacienteRepository")
	private TipoPacienteJpaRepository tipoPacienteJpaRepository;
	@Override
	public List<TipoPaciente> listAllTipoPacientes() {
		// TODO Auto-generated method stub
		Pageable pag= PageRequest.of(0,2);
		return tipoPacienteJpaRepository.findAll(pag).getContent();
	}

	@Override
	public TipoPaciente addTipoPaciente(TipoPaciente tipoPaciente) {
		// TODO Auto-generated method stub
		return tipoPacienteJpaRepository.save(tipoPaciente); 
	}

	@Override
	public int removeTipoPaciente(int id) {
		// TODO Auto-generated method stub
		tipoPacienteJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public TipoPaciente updateTipoPaciente(TipoPaciente tipoPaciente) {
		// TODO Auto-generated method stub
		return tipoPacienteJpaRepository.save(tipoPaciente);
	}

	
}
