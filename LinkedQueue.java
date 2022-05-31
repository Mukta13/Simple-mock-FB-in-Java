/*
 * Mukta Jaiswal
 * A code to show the implementation of linked queues.
 */
public final class LinkedQueue<T> implements QueueInterface<T> {

	private Node firstNode;
	private Node lastNode;

	public LinkedQueue() {
		firstNode = null;
		lastNode = null;
	}

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
	public void enqueue(T newEntry) {
		Node newNode = new Node(newEntry, null);
		if (isEmpty())
			firstNode = newNode;
		else
			lastNode.setNextNode(newNode);
		lastNode = newNode;

	}

	@Override
	public T dequeue() {
		T front = getFront();
		assert firstNode != null;
		firstNode.setData(null);
		firstNode = firstNode.getNextNode();
		if (firstNode == null)
			lastNode = null;
		return front;

	}

	@Override
	public T getFront() {
		if (isEmpty())
			throw new EmptyQueueException();
		else
			return firstNode.getData();
	}

	@Override
	public boolean isEmpty() {

		return (firstNode == null) && (lastNode == null);
	}

	@Override
	public void clear() {
		firstNode = null;
		lastNode = null;

	} // end Node
} // end Linkedqueue
