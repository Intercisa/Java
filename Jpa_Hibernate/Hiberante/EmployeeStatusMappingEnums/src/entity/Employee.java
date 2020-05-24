package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@Column(name = "employee_id", unique = true)
	private String employeeId;
	
	@Enumerated(EnumType.STRING) //if you are not define the EnumType then the value of the Enum will show in the table (0,1,2... n) or same as EnumType.ORDINAL
	@Column(name = "employee_status")
	private EmplyeeStatus emplyeeStatus; 
	
	public Employee() {}

	public Employee(String name, String employeeId, EmplyeeStatus emplyeeStatus) {
		this.name = name;
		this.employeeId = employeeId;
		this.emplyeeStatus = emplyeeStatus;
	}
	
	@Override
	public String toString() {
		return "Employee["
				+"id= "+id
				+" name= "+name
				+" emplyeeId= "+ employeeId
				+" emplyeeStatus= "
				+ emplyeeStatus+"]";
	}
	
	
}
