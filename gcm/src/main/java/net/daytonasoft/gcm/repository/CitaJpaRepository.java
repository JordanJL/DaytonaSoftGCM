package net.daytonasoft.gcm.repository;

import java.util.Date;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.daytonasoft.gcm.domain.Cita;

@Repository("citaRepository")
public interface CitaJpaRepository extends JpaRepository<Cita,Integer> {
	
	@Procedure(name="citaaction")
	int citaAction(@Param("empresa_p") String empresa, @Param ("medico_p") int medico, 
			@Param ("paciente_p") int paciente,
			@Param("consultorio_p") int consultorio, @Param("fecha_inicio_p") Date inicio,
			@Param("fecha_fin_p") Date fin);

}
