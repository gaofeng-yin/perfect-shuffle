package myCollections;

import java.util.Iterator;

public class ArrayDeque<E> implements Deque<E> {
	
	private E[] data;
	private static final int CAPACITY = 6;
	
	private int first = 0;
	private int last = 0;
	
	private int size = 0;
	
	public ArrayDeque() {
		this(CAPACITY);
	}

	public ArrayDeque(int capacity){
		if (capacity <= 0){
			throw new IllegalArgumentException("Invalid Capacity!");
		}
		data = (E[]) new Object[capacity];
	}
	
	//class iterator
	@Override
    public Iterator<E> iterator(){
        return new ArrayIterator();
    }    
    
	private class ArrayIterator implements Iterator<E>{
		private int j;
		public ArrayIterator() {
			if(size == 0) {
				j = -1;
			}else {
				j = first;
			}
		}
	   
		@Override
		public boolean hasNext() {
			return (j != -1);
		}
		@Override
		public E next() {
			if(j == -1) {
				throw new IllegalStateException("No next element!");
			}
			int j_actual = j;
			j=(j+1)%data.length;
			if(j==(first + size)%data.length) {
				j = -1;
			}
			return data[j_actual];
		}
		
	}
	//end of class iterator

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public E first() {
		return isEmpty() ? null : data[first];
	}

	@Override
	public E last() {
		return isEmpty() ? null : data[last];
	}

	@Override
	public void addFirst(E e) {
		if (size == data.length)
			throw new IllegalStateException("ArrayDeque is full!");
		if (isEmpty()){
			data[first] = e;
		}
		else{
			first = (first - 1 + data.length)  % data.length;
			data[first] = e;
		}
		size++;
	}

	@Override
	public void addLast(E e) {
		if (size == data.length)
			throw new IllegalStateException("ArrayDeque is full!");
		
		last = last  % data.length;
		data[last] = e;
	
		size++;
	}

	@Override
	public E removeFirst() {
		if (isEmpty())
			throw new IllegalStateException("ArrayDeque is empty!");
		
		E answer = data[first];
		first = (first + 1) % data.length;
		size--;
		
		return answer;
	}

	@Override
	public E removeLast() {
		if (isEmpty())
			throw new IllegalStateException("ArrayDeque is empty!");
		
		E answer = data[last];
		last = (last - 1 + data.length) % data.length;
		size--;
		
		return answer;
	}

	@Override
	public boolean isFull() {
		return (size == CAPACITY);
	}

}
