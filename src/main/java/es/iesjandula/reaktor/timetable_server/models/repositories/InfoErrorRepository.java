package es.iesjandula.reaktor.timetable_server.models.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.iesjandula.reaktor.timetable_server.models.entities.InfoErrorEntity;

@Repository
public interface InfoErrorRepository extends JpaRepository<InfoErrorEntity, Long>
{

	// Método para obtener el último error registrado
    Optional<InfoErrorEntity> findTopByOrderByIdDesc() ;
	
}
