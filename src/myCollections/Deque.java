package myCollections;

import java.util.Iterator;

public interface Deque<E> {
	
	int size();
	
	boolean isEmpty();
	
	E first();
	
	E last();
	
	void addFirst(E e);
	
	void addLast(E e);
	
	E removeFirst();
	
	E removeLast();
	
	boolean isFull();

	Iterator<E> iterator();
}
