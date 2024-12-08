package es.iesjandula.reaktor.timetable_server.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.iesjandula.reaktor.timetable_server.models.entities.SancionEntity;

@Repository
public interface SancionRepository extends JpaRepository<SancionEntity, Long>
{

}
