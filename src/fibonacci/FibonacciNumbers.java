package fibonacci;

import java.util.stream.IntStream;

import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumbers {
	
	private Map<Integer,Integer> memoize = new HashMap<>();
	
	public int getFibonacciAtPositionIterative(int position) {
	    Pair<Integer, Integer> initial = Pair.of(1, 1);
	    return IntStream.rangeClosed(2, position)
	                    .mapToObj(i -> Pair.of(i, 0))
	                    .reduce(initial, (prev, ignore) -> Pair.of(prev.getRight(), prev.getLeft() + prev.getRight()))
	                    .getRight();    
	}
		
	public int getFibonacciAtPositionRecursive(int position){
		if(position < 2) return 1;
		return getFibonacciAtPositionRecursive(position - 1) + getFibonacciAtPositionRecursive(position - 2);
	}
	
	public int getFibonacciAtPositionMemoized(int position){
		if(position < 2) return 1;
		return memoize.computeIfAbsent(position, n -> getFibonacciAtPositionMemoized(n-1) + getFibonacciAtPositionMemoized(n-2)); 
	}
	
}