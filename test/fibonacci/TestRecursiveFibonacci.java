package fibonacci;

public class TestRecursiveFibonacci extends TestFibonacciNumbers{

	public int callFibonacciAtPosition(int index){
		return getFibonacci().getFibonacciAtPositionRecursive(index);
	}
	
}