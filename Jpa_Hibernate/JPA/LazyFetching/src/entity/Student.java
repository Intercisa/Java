package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "enrollment_id", nullable = false)
	private String enrollmentId;
	
	private String name;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "guide_id")
	private Guide guide;
	
	public Student() {}

	
	public Student(String enrollmentId, String name) {
		this(enrollmentId, name, null);
	}



	public Student(String enrollmentId, String name, Guide guide) {
		this.enrollmentId = enrollmentId;
		this.name = name;
		this.guide = guide;
	}
	

	public void setGuide(Guide guide) {this.guide = guide;}

	public Guide getGuide() {return guide;}
	
	
	
}
