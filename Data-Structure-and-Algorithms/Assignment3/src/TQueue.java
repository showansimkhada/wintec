public class TQueue {
    QNode head;
	QNode tail;
	// Class constructor for TQueue class
	TQueue() {
		head = null;
		tail = null;
	}
	
    // Function to add element to the list from the tail
	public void addToTail(QNode nd) {
		// if TQueue is empty then QNode is head
		if(isEmpty()) {
			head = nd;
		}
		else {
			tail.next = nd;
		}
		tail = nd;
	}
	
    // Function to delete element from the list starting from the head
	public QNode deleteFromHead() {
		// assuming the temp as the head node
		QNode temp = head;
		if(isEmpty()) {
			return null;
		}
		if(head.next == null) {
			head = null;
			return temp;
		}
		head = head.next;
		return temp;
	}
	
    // Function to get length or size of the list
	public int size() {
		int num = 0;
		QNode current = head;
		while (current != null) {
			num++;
			current = current.next;
		}
		return(num);
	}
	
    // Function to check is it null
	public boolean isEmpty() {
		// checking the queue is empty or not
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
}
