package net.daytonasoft.gcm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import net.daytonasoft.gcm.domain.Alergia;
import net.daytonasoft.gcm.domain.Persona;
import net.daytonasoft.gcm.repository.PersonaJpaRepository;
import net.daytonasoft.gcm.service.PersonaService;
@Service("personaServiceImpl")
public class PersonaServiceImpl implements PersonaService{


		@Autowired
		@Qualifier("personaRepository")
		private PersonaJpaRepository personaJpaRepository;
		@Override
		public List<Persona> listAllPacientes(int size, int page, String criteria) {
			
		Pageable pag= PageRequest.of(page,size);
		return personaJpaRepository.findPacienteByCriteria(criteria,"1", pag).getContent();
		}

		@Override 
		public List<Persona> listAllMedicos(int size, int page, String criteria) {
			
		Pageable pag= PageRequest.of(page,size); 
		return personaJpaRepository.findMedicoByCriteria(criteria,"1",pag).getContent();
		}

		
		@Override
		public Optional<Persona>  findOne(int id) {
			return  personaJpaRepository.findById(id);
		}
		

		
		@Override
		public Persona addPersona(Persona persona) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int removePersona(int id) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Persona updatePersona(Persona persona) {
			// TODO Auto-generated method stub
			return personaJpaRepository.save(persona);
		}
		
	}
