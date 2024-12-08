package es.iesjandula.reaktor.timetable_server.models.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import es.iesjandula.reaktor.timetable_server.models.entities.ActitudePointsEntity;

@Repository
public interface ActitudePointsRepository extends JpaRepository<ActitudePointsEntity, Long>
{

	Optional<ActitudePointsEntity> findByValueAndDescription(Integer value, String description) ;
	
}
