package minstack;


public class MinStack {
	private Node head;
	
	public void push(int x) {
		if(head == null)
			head = new Node(x, x);
		else
			head = new Node(x, Math.min(x, head.min), head);
	}
	
	public void pop() {head = head.next;}
	
	public int top() {return head.val;}
	
	public int getMin() {return head.min;}
	
	
	private class Node {
		Node next; 
		int val;
		int min;

	
	private Node(int val, int min) {
		this(val, min, null);
	}
		
	private Node(int val, int min, Node next) {
		this.val = val;
		this. min = min;
		this.next = next;
	}

	}
}



/* with arrayList not bad -not good 
public class MinStack {
	private List<Integer>  stackList;
	
	public MinStack() {stackList = new ArrayList<>();}
	
	public void push(int x) {stackList.add(x);}
    
    public void pop() {stackList.remove(stackList.size()-1);}
    
    public int top() {return stackList.get(stackList.size()-1);}
    
    public int getMin() {
    	return stackList.stream().min(Integer::compare).get();
    }
}
*/