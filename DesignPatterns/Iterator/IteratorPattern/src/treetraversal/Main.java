package treetraversal;

public class Main {

	/*
	 * 
	 * Iterator
	 * 
	 */
	//   1
	//  / \
	// 2   3
	
	//213

	public static void main(String[] args) {
		
		Node<Integer> root = new Node<Integer>(1, new Node<Integer>(2), new Node<Integer>(3)); 
		InOrderIterator<Integer> iterator = new InOrderIterator<Integer>(root);
		
		while(iterator.hasNext())
			System.out.print("" + iterator.next()+ ",");
		
		System.out.println();
		
		
		BinaryTree<Integer> tree = new BinaryTree<Integer>(root);
		for (int n : tree) {
			System.out.print(""+ n + ",");
		}
		
		
	}
}
