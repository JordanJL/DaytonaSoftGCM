package net.daytonasoft.gcm.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.daytonasoft.gcm.domain.Persona;

@Repository("personaRepository")
public interface PersonaJpaRepository extends JpaRepository<Persona,Integer> {


	
//	public abstract Course findByPrice(int price);
//	
	@Query("select p from Persona p where p.paciente= ?2 AND (p.nombre LIKE %?1% OR p.apellidos LIKE %?1% " + 
			" OR p.documento LIKE %?1% ) ") 
	public abstract Page<Persona> findPacienteByCriteria(String criteria,String value, Pageable pageable);

	@Query("select p from Persona p where p.medico= ?2 AND (p.nombre LIKE %?1% OR p.apellidos LIKE %?1% " + 
			" OR p.documento LIKE %?1% )")
	public abstract Page<Persona> findMedicoByCriteria(String criteria, String value, Pageable pageable);
	//	
//	public abstract Course findByNameOrderByHours(String name);

}
