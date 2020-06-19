package treetraversal;

import java.util.Iterator;
import java.util.function.Consumer;

public class BinaryTree<T> implements Iterable<T> {

	private Node<T> root;
	
	
	public BinaryTree(Node<T> root) {
		this.root = root;
	}

	@Override
	public Iterator<T> iterator() {
		return new InOrderIterator<>(root);	
		
	}

	@Override
	public void forEach(Consumer<? super T> action) {
		for(T item : this)
			action.accept(item);
		
	}


}
