package net.daytonasoft.gcm.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.daytonasoft.gcm.domain.Alergia;
import net.daytonasoft.gcm.domain.TipoCita;

@Repository("tipoCitaRepository")
public interface TipoCitaJpaRepository extends JpaRepository<TipoCita,Integer> {
	
//	public abstract Course findByPrice(int price);
//	
//	public abstract Course findByPriceAndName(int price, String name);
//	
//	public abstract Course findByNameOrderByHours(String name);

}
