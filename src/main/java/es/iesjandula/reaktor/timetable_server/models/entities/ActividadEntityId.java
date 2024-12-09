package es.iesjandula.reaktor.timetable_server.models.entities;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ActividadEntityId implements Serializable
{
	private static final long serialVersionUID = 1542990175879333089L;

	private TimeSlotEntity tramo;
	
	private AulaEntity aula;

	private ProfesorEntity profesor;
}
