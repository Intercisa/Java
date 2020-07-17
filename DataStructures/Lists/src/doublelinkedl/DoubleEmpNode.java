package doublelinkedl;

import bean.Emplyee;

public class DoubleEmpNode {
	
	private Emplyee emplyee;
	private DoubleEmpNode next;
	private DoubleEmpNode prev;
	
	public DoubleEmpNode(Emplyee emplyee) {
		this.emplyee = emplyee;
	}

	
	public Emplyee getEmplyee() {return emplyee;}
	public void setEmplyee(Emplyee emplyee) {this.emplyee = emplyee;}
	public DoubleEmpNode getNext() {return next;}
	public void setNext(DoubleEmpNode next) {this.next = next;}
	public DoubleEmpNode getPrev() {return prev;}
	public void setPrev(DoubleEmpNode prev) {this.prev = prev;}

	@Override
	public String toString() {
		return emplyee.toString();
	}
}
