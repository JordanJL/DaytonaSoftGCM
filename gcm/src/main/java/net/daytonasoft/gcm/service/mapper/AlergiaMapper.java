package net.daytonasoft.gcm.service.mapper;

import org.springframework.stereotype.Component;

import net.daytonasoft.gcm.domain.Alergia;
import net.daytonasoft.gcm.service.dto.AlergiaDTO;

@Component("alergiaMapper")
public class AlergiaMapper {


	public AlergiaDTO entityToModel(Alergia alergia) {
		AlergiaDTO alergiaDto = new AlergiaDTO();
		alergiaDto.setDescripcion(alergia.getDescripcion());
		alergiaDto.setCreadoPor(alergia.getCreadoPor());
		alergiaDto.setEmpresa(alergia.getEmpresa());
		alergiaDto.setEstado(alergia.getEstado());
		alergiaDto.setFechaCreacion(alergia.getFechaCreacion());
		alergiaDto.setModificadoPor(alergia.getModificadoPor());
		alergiaDto.setFechaModificacion(alergia.getFechaModificacion());
		alergiaDto.setSecuencia(alergia.getSecuencia());
		return alergiaDto;
	}
	
	public Alergia modelToEntity(AlergiaDTO alergia) {
		Alergia alergiaEntity = new Alergia();
		alergiaEntity.setDescripcion(alergia.getDescripcion());
		alergiaEntity.setCreadoPor(alergia.getCreadoPor());
		alergiaEntity.setEmpresa(alergia.getEmpresa());
		alergiaEntity.setEstado(alergia.getEstado());
		alergiaEntity.setFechaCreacion(alergia.getFechaCreacion());
		alergiaEntity.setModificadoPor(alergia.getModificadoPor());
		alergiaEntity.setFechaModificacion(alergia.getFechaModificacion());
		alergiaEntity.setSecuencia(alergia.getSecuencia());
		return alergiaEntity;
	}

}
