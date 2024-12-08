package es.iesjandula.reaktor.timetable_server.models.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import es.iesjandula.reaktor.timetable_server.models.entities.ActividadEntity;
import es.iesjandula.reaktor.timetable_server.models.entities.ActividadEntityId;

public interface ActividadRepository extends JpaRepository<ActividadEntity,ActividadEntityId>
{
	
}