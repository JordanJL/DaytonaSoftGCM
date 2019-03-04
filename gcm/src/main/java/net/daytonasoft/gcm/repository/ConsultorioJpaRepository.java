package net.daytonasoft.gcm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.daytonasoft.gcm.domain.Consultorio;

@Repository("consultorioRepository")
public interface ConsultorioJpaRepository extends JpaRepository<Consultorio,Integer> {

}
