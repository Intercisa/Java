package binarysearchtrees;

public class Main {

	public static void main(String[] args) {

		Tree bst = new Tree();
		bst.insert(25);
		bst.insert(20);
		bst.insert(15);
		bst.insert(27);
		bst.insert(30);
		bst.insert(29);
		bst.insert(26);
		bst.insert(22);
		bst.insert(32);
		bst.insert(17);
		
		
		System.out.println(bst.get(22));
		System.out.println(bst.get(22322));
		
		System.out.println("\n-------------------------");
		System.out.println(bst.max());
		System.out.println("\n-------------------------");
		System.out.println(bst.min());
		/*
		bst.traversInOrder();
		System.out.println("\n-------------------------");
		bst.delete(15);
		System.out.println("\n-------------------------");
		bst.traversInOrder();
		bst.delete(27);
		System.out.println("\n-------------------------");
		bst.traversInOrder();
		bst.delete(25);
		System.out.println("\n-------------------------");
		bst.traversInOrder();
		bst.delete(7687);
		System.out.println("\n-------------------------");
		*/
		bst.traversInOrder();
		System.out.println("\n-------------------------");
		bst.traversPreOrder();
		System.out.println("\n-------------------------");
		bst.traversPostOrder();
	}
}
