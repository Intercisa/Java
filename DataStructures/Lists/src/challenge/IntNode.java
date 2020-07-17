package challenge;

public class IntNode {


    private Integer value;
    private IntNode next;

    public IntNode(Integer value) {
        this.value = value;
    }
    
    public Integer getValue() {return value;}
    public void setValue(Integer value) {this.value = value;}
    public IntNode getNext() {return next;}
    public void setNext(IntNode next) {this.next = next;}

    @Override
	public String toString() {
        return value.toString();
    }
}