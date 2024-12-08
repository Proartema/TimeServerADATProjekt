package es.iesjandula.reaktor.timetable_server.models.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AulaEntity
{
	@Id
	private String numIntAu;
	
	private String abreviatura;
	
	private String nombre;
	
	private String planta ;
	
	@OneToMany(mappedBy = "aula")
	private List<AulaPlanoEntity> aulasPlanos ;

}
