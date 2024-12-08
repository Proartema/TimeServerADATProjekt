package es.iesjandula.reaktor.timetable_server.models.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import es.iesjandula.reaktor.timetable_server.models.entities.TimeSlotEntity;

public interface TimeSlotRepository extends JpaRepository<TimeSlotEntity,String>
{
	
}