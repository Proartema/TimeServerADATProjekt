package es.iesjandula.reaktor.timetable_server.models.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ActividadEntity 
{

	@EmbeddedId
	private ActividadEntityId actividadEntityId;
	
	@ManyToOne
	private TimeSlotEntity tramo;

	
	@ManyToOne
	private AulaEntity aula;

	
	@ManyToOne
	private ProfesorEntity profesor;

	private String numAct;

	private String numUn;
	
	@ManyToOne
	private AsignaturaEntity asignatura;
	
	@ManyToOne
	private GrupoEntity grupo;
		
}