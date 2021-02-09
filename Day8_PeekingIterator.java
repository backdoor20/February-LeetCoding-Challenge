// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr=null;
    Integer nextElement=null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.itr=iterator;
        this.nextElement=itr.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextElement;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	   Integer nextele=nextElement;
        if(itr.hasNext()){
            this.nextElement=itr.next();
        }else{
            this.nextElement=null;
        }
        return nextele;
    }
	
	@Override
	public boolean hasNext() {
        return nextElement!=null;
	}
}