package myCollections;

import java.util.Iterator;

public class ArrayDeque<E> implements Deque<E> {
	
	private static final int CAPACITY=6; // default array capacity
    // instance variables
    private E[ ] data; // generic array used for storage
    private int f = 0; // index of the front element
    private int sz = 0; // current number of elements
    // constructors
    public ArrayDeque( ) {this(CAPACITY);} // constructs deque with default capacity
    public ArrayDeque(int capacity) { // constructs deque with given capacity
    data = (E[ ]) new Object[capacity]; // safe cast; compiler may give warning
    }
    // methods
    @Override
    public int size( ) { return sz; }
    /** Tests whether the deque is empty. */
    @Override
    public boolean isEmpty( ) { return (sz == 0); }
    /** Inserts an element at the rear of the deque. */

    @Override
    public void addLast(E e) throws IllegalStateException {
        if (sz == data.length) throw new IllegalStateException("Deque is full");
        int avail = (f + sz) % data.length; // use modular arithmetic
        data[avail] = e;
        sz++;
    }
    
    @Override
    public void addFirst(E e) throws IllegalStateException {
        if (sz == data.length) throw new IllegalStateException("Deque is full");
        f = (f + data.length -1) % data.length; // use modular arithmetic
        data[f] = e;
        sz++;
    }

    /** Returns, but does not remove, the first element of the deque (null if empty). */
    @Override
    public E first( ) {
        if (isEmpty( )) return null;
        return data[f];
    }
    
    /** Returns, but does not remove, the last element of the deque (null if empty). */
    @Override
    public E last( ) {
        if (isEmpty( )) return null;
        return data[(f+sz-1)%data.length];
    }
    /** Removes and returns the first element of the deque (null if empty). */
    @Override
    public E removeFirst( ){
        if (isEmpty( )) return null;
        E answer = data[f];
        data[f] = null; // dereference to help garbage collection
        f = (f + 1) % data.length;
        sz--;
        return answer;
    }   
    
    @Override
    public E removeLast( ){
        if (isEmpty( )) return null;
        int r = (f+sz-1) % data.length;
        E answer = data[r];
        data[r] = null; // dereference to help garbage collection
        sz--;
        return answer;
    }
	
	//class iterator
	@Override
    public Iterator<E> iterator(){
        return new ArrayIterator();
    }    
    
	private class ArrayIterator implements Iterator<E>{
		private int j;
		public ArrayIterator() {
			if(sz == 0) {
				j = -1;
			}else {
				j = f;
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
			if(j==(f + sz)%data.length) {
				j = -1;
			}
			return data[j_actual];
		}
		
	}
	//end of class iterator

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (sz == CAPACITY);
	}

}
