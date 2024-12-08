package es.iesjandula.reaktor.timetable_server.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SancionEntity 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	@ManyToOne
	@JoinColumn(name = "estudiante_id")
	private StudentEntity estudiante ;
	
	@ManyToOne
	@JoinColumn(name = "actitude_points_id")
	private ActitudePointsEntity actitudePointsEntity ;

	public SancionEntity(StudentEntity estudiante, ActitudePointsEntity actitudePointsEntity) {
		super();
		this.estudiante = estudiante;
		this.actitudePointsEntity = actitudePointsEntity;
	}
	
	
	
}
