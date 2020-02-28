import java.math.BigInteger;

/**
 * This program implements the Fibonacci function in a recursive fashion to 
 * determine its runtime efficiency. The program prints the input and runtime
 * in nanoseconds. 
 * 
 * @author Natalie Ayala
 * @version 1.0
 */
public class IterativeFib {

	/**
	 * Calculates the fibonacci number based on input. 
	 * 
	 * @param number an integer that will be used to calculate the fibonacci number
	 * @return the calculated fibonacci number 
	 */
	public static BigInteger fibonacciIterative(int number) {
		if (number == 1 || number == 2) {
			return BigInteger.ONE;
		}
		BigInteger fibo1 = BigInteger.ONE;
		BigInteger fibo2 = BigInteger.ONE;
		BigInteger fibonacci = BigInteger.ZERO;
		for (int i = 3; i <= number; i++) {
			fibonacci = fibo1.add(fibo2);
			fibo1 = fibo2;
			fibo2 = fibonacci;
		}
		return fibonacci;
	}
	
   public static void main(String[] args) {
	   /**
	    * Calls the fibonacciIterative method to calculate
	    * the fibonacci number for a range of positions, from 
	    * 0 to 100. The run time is calculated after each 
	    * fibonacciIterative run, and printed to the screen. 
	    */
		  long startTime = System.nanoTime();

		  for (int i = 0; i < 100; i++) {
			  fibonacciIterative(i);
		      long endTime   = System.nanoTime();
		      long totalTime = endTime - startTime;
		      System.out.println(i + " " + totalTime);
		  }  
   }

}
