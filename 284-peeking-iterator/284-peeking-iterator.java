// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Integer nextElem = null;  //need for peek function
    Iterator<Integer> it = null;  //java wala iterator
    
	public PeekingIterator(Iterator<Integer> iterator) {
	   it = iterator;
	   nextElem = it.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextElem;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int val = nextElem;
        nextElem = it.hasNext()==true?it.next():null;
        return val;
	}
	
	@Override
	public boolean hasNext() {
	    return nextElem!=null;
	}
}