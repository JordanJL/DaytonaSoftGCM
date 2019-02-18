package net.daytonasoft.gcm.service.mapper;

@Component("alergiaMapper")
public class AlergiaMapper {


	public AlergiaDTO entityToModel(Alergia alergia) {
		AlergiaDTO alergiaDto = new CourseDTO();
		courseDto.setName(course.getName());
//		courseDto.setDescription(course.getDescription());
//		courseDto.setPrice(course.getPrice());
//		courseDto.setHours(course.getHours());
		return courseDto;
	}
	
	public Course modelToEntity(CourseDTO course) {
		Course courseEntity = new Course();
		courseEntity.setName(course.getName());
//		courseEntity.setDescription(course.getDescription());
//		courseEntity.setPrice(course.getPrice());
//		courseEntity.setHours(course.getHours());
		return courseEntity;
	}

}
