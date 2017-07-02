
public class LinkedList implements LinkedListInterface {
	int size = 0;
	Node start = null;

	@Override
	public boolean isEmpty() {
		if (size != 0) {
			return false;
		}
		return true;
	}

	@Override
	public int sizeCheck() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public void addFirst(Object data) {
		if (sizeCheck() > 0) {
			size += 1;
			Node n = start;
			Node d = new Node(data, n);
			start = d;
		} else {
			size += 1;
			Node d = new Node(data, null);
			start = d;
		}
	}

	@Override
	public void addLast(Object data) {
		Node currentNode = start;
		if (size == 0) {
			size += 1;
			Node d = new Node(data, null);
			start = d;
		} else {
			size += 1;
			Node b = start.getNext();
			if (b == null) {
				Node f = new Node(data, null);
				start.setNext(f);
			} else {
				while (currentNode.getNext() != null) {
					currentNode = currentNode.getNext();
				}
				Node n = new Node(data, null);
				currentNode.setNext(n);
			}
		}
	}

	public String toString() {
		String s = "";
		Node currentNode = start;
		while (currentNode.getNext() != null) {
			s += currentNode.getData();
			currentNode = currentNode.getNext();
		}
		s += currentNode.getData();
		return s;
	}

	@Override
	public void add(Object data, int index) {
		Node currentNode = start;
		Node saver;
		for (int i = 0; i < index - 1; i++) {
			currentNode = currentNode.getNext();
		}
		saver = currentNode.getNext();
		if (sizeCheck() > index) {
			Node n = new Node(data, saver);
			currentNode.setNext(n);
		} else {
			Node n = new Node(data, null);
			currentNode.setNext(n);
		}
		
	}

	@Override
	public void remove(int index) {
		Node currentNode = start;
		Node saver;

		for (int i = 0; i < index; i++) {
			currentNode = currentNode.getNext();
		}
		saver = currentNode.getNext();
		currentNode = start;
		for (int i = 0; i < index - 1; i++) {
			currentNode = currentNode.getNext();
		}
		if (sizeCheck() > index) {
			currentNode.setNext(saver);
		} else {
			currentNode.setNext(null);
		}
	}

}
