package entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "enrollment_id", nullable = false)
	private String enrollmentId;
	
	private String name;
	
	@ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)//by default single point associations (ManyToOne) are eagerly fetched so we change that to layz because of n+1 problem
	@JoinColumn(name = "guide_id")
	private Guide guide;
	
	public Student() {}

	public Student(String enrollmentId, String name, Guide guide) {
		this.enrollmentId = enrollmentId;
		this.name = name;
		this.guide = guide;
	}
	
	

	public Student(String enrollmentId, String name) {
		this(enrollmentId, name, null);
	}

	public void setGuide(Guide guide) {this.guide = guide;}

	public Guide getGuide() {return guide;}
	
	


	
	public String getEnrollmentId() {return enrollmentId;}

	public String getName() {return name;}

	@Override
	public String toString() {
		return "Student [id=" + id + ", enrollmentId=" + enrollmentId + ", name=" + name + ", guide=" + guide + "]";
	}
	

	@Override
	public int hashCode() {return new HashCodeBuilder().append(enrollmentId).toHashCode();}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) return false;
		Student other = (Student)obj;
		return new EqualsBuilder().append(enrollmentId, other.enrollmentId).isEquals();
	}
	
	
	
	
	
}
