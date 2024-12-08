package es.iesjandula.reaktor.timetable_server.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentEntity 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	private String lastName ;
    private String firstName ;
    private String course ;
    private String academicYear ;
    private String tutorFirstName ;
    private String tutorLastName ;
    private String tutorPhone ;
    private String tutorEmail ;
    
    // Constructor explícito con el mismo orden que en el método parseStudent
    public StudentEntity(String firstName, String lastName, String course, String academicYear,
                         String tutorFirstName, String tutorLastName, String tutorPhone, String tutorEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.academicYear = academicYear;
        this.tutorFirstName = tutorFirstName;
        this.tutorLastName = tutorLastName;
        this.tutorPhone = tutorPhone;
        this.tutorEmail = tutorEmail;
    }
	
}
