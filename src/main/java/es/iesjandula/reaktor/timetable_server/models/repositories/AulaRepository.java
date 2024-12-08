package es.iesjandula.reaktor.timetable_server.models.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import es.iesjandula.reaktor.timetable_server.models.entities.AulaEntity;

public interface AulaRepository extends JpaRepository<AulaEntity,String>
{
	
	List<AulaEntity> findByPlanta(String planta) ;
	
}