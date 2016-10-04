package fibonacci;

public class TestIterativeFibonacci extends TestFibonacciNumbers{

	public int callFibonacciAtPosition(int index){
		return getFibonacci().getFibonacciAtPositionIterative(index);
	}
	
}