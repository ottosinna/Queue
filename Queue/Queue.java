 import java.util.NoSuchElementException;

class Queue<T> implements QueueInterface<T> {
	
	private Node<T> first;
	private Node<T> last;
	private int size;
	
	public void add(T item) {
		// dec temp Node var and assign it to the "last" Node
		Node<T> prevLast = last;
		// assign last a new Node
		last = new Node<T>(item, null);
		if(isEmpty()) {
			first = last;
		}
		else {
			prevLast.setNext(last);
		}		
		// increase size by 1
		size++;
	}
	
	public T poll() {
		// if queue is empty, throw a NoSuchElementException
		if(isEmpty()) {
			throw new NoSuchElementException("Queue is empty, unable to poll");
		}
		// save item T in a temp. variable using the first item in the queue
		T item = first.getItem();
		// move first to the next item
		first = first.getNext();
		// decrement size by 1
		size--;
		// if the queue is empty, destroy the last pointer by setting it to null
		if(isEmpty()) {
			last = null;
		}
		return item;
	}
	
	public T peek() {
		if(size > 0) {
            return first.getItem();
        } else {
        return null;
        }
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public int size() {
		return size;
	}
	
	public boolean contains(T item) {
		// use a temp. variable and initialize to first
		Node<T> temp = first;
		T tempItem = temp.getItem();
	
		// using the temp. variable, loop until next node is not null (while loop is common for this)
		while(true){
			if((tempItem==item) == true){
				return true;
			}
			else if(tempItem==null){
				return false;
			}
			if(temp == null){
				break; // i break bc it makes me type in terminal
			}
			temp = temp.getNext();
		}
		// and check if a match is found for this item		
		// return true if item found, false otherwise
		return false; 
	}

}