package challenge;

public class SortedLinkedList  {
	private IntNode head;
	private int size;

    public void push(Integer value) {
    	IntNode node = new IntNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntNode poll() {
        if (isEmpty()) {
            return null;
        }

        IntNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {

        // assumption: the list is sorted

        if (head == null || head.getValue() >= value) {
        	push(value);
            return;
        }

        // find the insertion point
        IntNode current = head.getNext(); // two pointer fast
        IntNode previous = head; // two pointer slow
        while (current != null && current.getValue() < value) {
            previous = current;
            current = current.getNext();
        }

        IntNode newNode = new IntNode(value);
        newNode.setNext(current);
        previous.setNext(newNode);

        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
    	IntNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}

