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
		
		bst.traversInOrder();
		
		System.out.println("\n-------------------------");
		
		System.out.println(bst.get(22));
		System.out.println(bst.get(22322));
		
		System.out.println("\n-------------------------");
		System.out.println(bst.max());
		System.out.println("\n-------------------------");
		System.out.println(bst.min());
	}
}
