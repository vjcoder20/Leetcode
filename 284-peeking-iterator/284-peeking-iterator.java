// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    ArrayList<Integer> al;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	  al = new ArrayList<>();
    while(iterator.hasNext()){
        al.add(iterator.next());
    }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return al.get(0);
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        Integer get = al.get(0);
        al.remove(0);
	     return get;
	}
	
	@Override
	public boolean hasNext() {
	  return al.size()>0;
	}
}