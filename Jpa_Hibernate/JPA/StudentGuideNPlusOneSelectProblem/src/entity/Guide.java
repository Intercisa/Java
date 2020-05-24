package entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.BatchSize;

@Entity
@BatchSize(size = 4) //Batch fetching!!
public class Guide {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "staff_id", nullable = false)
	private String staffId;
	
	private String name;
	private Integer salary;
	
	@OneToMany(mappedBy = "guide", 
			cascade = {CascadeType.PERSIST},
			fetch = (FetchType.LAZY)) //by default collection associations (OneToMany) are lazily fetched
	private Set<Student> students;
	
	public Guide() {}

	public Guide(String staffId, String name, Integer salary) {
		this.staffId = staffId;
		this.name = name;
		this.salary = salary;
		students = new HashSet<Student>();
	}
	
	public void addStudent(Student... student) {
		Set<Student>temp = new HashSet<Student>();
		for (Student st : student) {
			st.setGuide(this);
			temp.add(st);
		}
		students.addAll(temp);
	}

	public String getStaffId() {return staffId;}

	public String getName() {return name;}

	public Integer getSalary() {return salary;}

	public Set<Student> getStudents() {return students;}

	@Override
	public String toString() {
		return "Guide [id=" + id + ", staffId=" + staffId + ", name=" + name + ", salary=" + salary + "]"; //!!don't include students because that cause an stack overflow error >> recursion error! 
	}
	
	

	
}