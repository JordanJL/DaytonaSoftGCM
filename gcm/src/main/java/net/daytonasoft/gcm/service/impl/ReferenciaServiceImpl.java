package net.daytonasoft.gcm.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.daytonasoft.gcm.domain.Referencia;
import net.daytonasoft.gcm.repository.ReferenciaJpaRepository;
import net.daytonasoft.gcm.service.ReferenciaService;

@Service("referenciaServiceImpl")
public class ReferenciaServiceImpl implements ReferenciaService{

	@Autowired
	@Qualifier("referenciaRepository")
	private ReferenciaJpaRepository referenciaJpaRepository;
	@Override
	public List<Referencia> listAllReferencias() {
		// TODO Auto-generated method stub
		Pageable pag= PageRequest.of(0,2);
		return referenciaJpaRepository.findAll(pag).getContent();
	}
 
	@Override
	public Referencia addReferencia(Referencia referencia) {
		// TODO Auto-generated method stub
		return referenciaJpaRepository.save(referencia); 
	}

	@Override
	public int removeReferencia(int id) {
		// TODO Auto-generated method stub
		referenciaJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public Referencia updateReferencia(Referencia referencia) {
		// TODO Auto-generated method stub
		return referenciaJpaRepository.save(referencia);
	}

	
}
