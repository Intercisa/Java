package entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Guide {

	//inverse end
	//the inverse end dose not care about the relationship -> can't update the owner from here 'backwards' without the helper method -> addStudent(Student student)
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "staff_id", nullable = false)
	private String staffId;
	
	private String name;
	private Integer salary;
	
	@OneToMany(mappedBy = "guide", cascade = {CascadeType.PERSIST})
	private Set<Student> students;

	public Guide() {}

	public Guide(String staffId, String name, Integer salary) {
		super();
		this.staffId = staffId;
		this.name = name;
		this.salary = salary;
		students = new HashSet<Student>();
	}
	
	
	//helperMethod!! -> this way the inverse (Guide in this case) will care about the relationship, just like the owner (Student.class) 
	public void addStudent(Student student) {
		students.add(student);
		student.setGuide(this);
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
	

}
