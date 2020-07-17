package linkedl;

import bean.Emplyee;

public class EmpNode  {
	
	private Emplyee employee;
	private EmpNode next;
	
	public EmpNode(Emplyee employee) {
		this.employee = employee;
	}

	public Emplyee getEmployee() {return employee;}
	public void setEmployee(Emplyee employee) {this.employee = employee;}
	public EmpNode getNext() {return next;}
	public void setNext(EmpNode next) {this.next = next;}

	@Override
	public String toString() {
		return employee.toString();
	}
}
