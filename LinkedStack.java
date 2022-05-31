
/*
 * Mukta Jaiswal
 * A code to show the implementation of linked stacks
 */
import java.util.EmptyStackException;

public final class LinkedStack<T> implements StackInterface<T> {

	private Node topNode; // References the first node in the chain

	public LinkedStack() {
		super();
		this.topNode = topNode;

	}

//default constructor

	private class Node {
		private T data;// Entry in List
		private Node next;// Link to next node

		private Node(T dataPortion) {

			this(dataPortion, null);
		}// end constructor

		private Node(T dataPortion, Node nextNode) {
			data = dataPortion;
			next = nextNode;
		}// end constructor

		private T getData() {
			return data;
		}// end getData

		private void setData(T newData) {
			data = newData;
		}// end setData

		private Node getNextNode() {
			return next;
		}// end getNextNode

		private void setNextNode(Node nextNode) {
			next = nextNode;
		}// end setNextNode

	}// end Node

	@Override
	public void push(T newEntry) {
		Node newNode = new Node(newEntry, topNode);
		topNode = newNode;

	}

	@Override
	public T pop() {
		T top = peek();
		assert topNode != null;
		topNode = topNode.getNextNode();
		return top;

	}

	@Override
	public T peek() {

		if (isEmpty()) {
			throw new EmptyStackException();
		} else
			return topNode.getData();
	}

	@Override
	public boolean isEmpty() {

		return topNode == null;
	}

	@Override
	public void clear() {
		topNode = null;

	}

}// end LinkedStack