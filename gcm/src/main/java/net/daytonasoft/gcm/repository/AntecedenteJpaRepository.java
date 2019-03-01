package net.daytonasoft.gcm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.daytonasoft.gcm.domain.Antecedente;

@Repository("antecedenteRepository")
public interface AntecedenteJpaRepository extends JpaRepository<Antecedente,Integer> {
	
//	public abstract Course findByPrice(int price);
//	
//	public abstract Course findByPriceAndName(int price, String name);
//	
//	public abstract Course findByNameOrderByHours(String name);

}
