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
public class AulaPlanoEntity 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	private double height ;
    private double width ;
    private double top ;
    private double right ;
    private double left ;
    private String planta ;
    private String numIntAu ;
    
    @ManyToOne
    @JoinColumn(name = "aula_id")
    private AulaEntity aula ;
    
    public AulaPlanoEntity(double height, double width, double top, double right, double left, String planta, AulaEntity aula) {
        this.height = height;
        this.width = width;
        this.top = top;
        this.right = right;
        this.left = left;
        this.planta = planta;
        this.aula = aula;
    }
	
}