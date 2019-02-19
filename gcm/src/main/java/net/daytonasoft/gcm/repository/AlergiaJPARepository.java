package net.daytonasoft.gcm.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.daytonasoft.gcm.domain.Alergia;

@Repository("alergiaRepository")
public interface AlergiaJPARepository extends JpaRepository<Alergia,Integer> {
	
//	public abstract Course findByPrice(int price);
//	
//	public abstract Course findByPriceAndName(int price, String name);
//	
//	public abstract Course findByNameOrderByHours(String name);

}
