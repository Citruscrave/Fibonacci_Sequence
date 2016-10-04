package fibonacci;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

public class TestMemoizedFibonacci extends TestFibonacciNumbers{

	public int callFibonacciAtPosition(int index) {
		return getFibonacci().getFibonacciAtPositionMemoized(index);
	}
	
	private long computeTime(Runnable code){
		Instant startTime = Instant.now();
		code.run();
		Instant endTime = Instant.now();

		return Duration.between(startTime, endTime).toNanos();
	}
	
	@Test
	public void testMemoizedIsFasterThanRecursive(){
		long recursiveDuration = computeTime(() -> getFibonacci().getFibonacciAtPositionRecursive(45));
		long memoizedDuration = computeTime(() -> getFibonacci().getFibonacciAtPositionMemoized(45));
		
		assertTrue(memoizedDuration * 10 < recursiveDuration);
	}

}