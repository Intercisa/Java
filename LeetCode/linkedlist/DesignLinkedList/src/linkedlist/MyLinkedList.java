package linkedlist;

class Node{
	int val;
	Node next;
	
	Node(){};
	Node(int val){
		this.val = val;
	}
}

public class MyLinkedList {
	 Node currHead;
	 Node currTail;
	 int size;
    public MyLinkedList() {
    	currHead = null;
        currTail = null;
        
        size = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
    	 if (index >= size) return -1;
         Node tmp = currHead;
         for (int i = 0; i < index; i++) 
        	 tmp = tmp.next;
         
         return tmp.val;

    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
    	Node tmp = new Node(val);
        tmp.next = currHead;
        currHead = tmp;
        
        if (currTail == null) 
        	currTail = currHead;
        
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node tmp = new Node(val);
        
        if (currTail != null)
        	currTail.next = tmp;
        
        if (currTail == null) 
        	currHead = tmp;
        
        currTail = tmp;
        size++;
        
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
    	  if (index > size) return;
          
          if (index == size) {
              addAtTail(val);
              return;
          }
          if (index == 0) {
              addAtHead(val);
              return;
          }
          
          Node ith = currHead;
          for (int i = 0; i < index-1; i++) 
        	  ith = ith.next;
          
          Node tmp = new Node(val);
          Node saveIth = ith;
          ith = ith.next;
          
          saveIth.next = tmp;
          tmp.next = ith;
          
          size++;
    	
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
    	
    	if (size == 0) return;
        if (index >= size) return;
        if (index == 0) {
            if (size == 1) {
                size = 0;
                currHead = null;
                currTail = null;
                return;
            }
            currHead = currHead.next;
            size--;
            return;
        }

        if (index != 0) {
            Node ith = currHead;
            for (int i = 0; i < index-1; i++) 
            	ith = ith.next;
           
            if (index == size - 1) {
                currTail = ith;
                currTail.next = null;
                size--;
                return;
            }
            Node node = ith.next;
            ith.next = node.next;
            
        }
        
        size--;
    }

}



