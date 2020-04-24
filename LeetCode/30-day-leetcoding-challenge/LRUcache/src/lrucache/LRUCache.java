package lrucache;

import java.util.HashMap;

public class LRUCache {
	
	 	Node head;
	    Node tail;
	    HashMap<Integer, Node> map;
	    int cap;
		
	
	    public LRUCache(int capacity) {
	        this.cap = capacity;
	        this.map = new HashMap<>();
	    }
	
	    public int get(int key) {
	        if(map.get(key)==null)
	            return -1;
	        
	        //move to tail
	        Node tmp = map.get(key);
	 
	        removeNode(tmp);
	        offerNode(tmp);
	 
	        return tmp.value;
	    }
	
	
	    public void put(int key, int value) {
	        if(map.containsKey(key)){
	            Node tmp = map.get(key);
	            tmp.value = value;
	 
	            //move to tail
	            removeNode(tmp);
	            offerNode(tmp);
	        }else{
	            if(map.size()>=cap){
	                //delete head
	                map.remove(head.key);
	                removeNode(head);
	            }
	 
	            //add to tail
	            Node node = new Node(key, value);
	            offerNode(node);
	            map.put(key, node);
	        }
	    }

	    
	    private void offerNode(Node node) {
	    	 if(tail!=null)
	             tail.next = node;
	         
	         node.prev = tail;
	         node.next = null;
	         tail = node;
	  
	         if(head == null)
	             head = tail;   
	         
	    }
	    
	    private void removeNode(Node node) {
	    	  if(node.prev!=null)
	              node.prev.next = node.next;
	          else
	              head = node.next;
	          
	   
	          if(node.next!=null)
	              node.next.prev = node.prev;
	          else
	              tail = node.prev;
	    }
	    
	    
		private class Node{
		    int key;
		    int value;
		    Node prev;
		    Node next;
		 
		    public Node(int key, int value){
		        this.key=key;
		        this.value=value;
		    }
		}
}


