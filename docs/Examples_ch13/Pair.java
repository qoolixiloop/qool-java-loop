package ch13;

public class Pair <T, U> {
	
	private T first;
	private U second;
	
    public Pair(T fst, U snd) {
    	first = fst;
    	second = snd;
    }
    
    public T getFirst() {
    	return first;
    }
    
    public U getSecond() {
    	return second;
    }
    
}

