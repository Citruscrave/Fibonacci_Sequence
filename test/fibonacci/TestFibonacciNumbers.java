package fibonacci;

import static org.junit.Assert.assertEquals;
import fibonacci.FibonacciNumbers;

import org.junit.Before;
import org.junit.Test;

public abstract class TestFibonacciNumbers { 

	private FibonacciNumbers fibonacciNumbers;
	
	public FibonacciNumbers getFibonacci(){
		return fibonacciNumbers;
	}
	
	@Before
	public void initialize(){
		fibonacciNumbers = new FibonacciNumbers();
	}
	
	public abstract int callFibonacciAtPosition(int index);
	
	@Test
	public void testGetFirstInSequence(){
		int expected = 1;
		assertEquals(expected, callFibonacciAtPosition(0));
	}
	
	@Test
	public void testGetSecondInSequence(){
		int expected = 1;
		assertEquals(expected, callFibonacciAtPosition(1));
	}
	
	@Test
	public void testGetThirdInSequence(){
		int expected = 2;
		assertEquals(expected, callFibonacciAtPosition(2));
	}
	
	@Test
	public void testGetFifthInSequence(){
		int expected = 5;
		assertEquals(expected, callFibonacciAtPosition(4));
	}
	
	@Test
	public void testGetSeventhInSequence(){
		int expected = 13;
		assertEquals(expected, callFibonacciAtPosition(6));
	}
	
}
