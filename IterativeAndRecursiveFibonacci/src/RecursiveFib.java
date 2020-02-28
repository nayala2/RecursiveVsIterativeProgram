
public class RecursiveFib {
	/**
	 * 
	 * @param n the number input to be used in the fibonacci calculation
	 * @return the calculated value of the fibonacci number
	 */
	   public static long fib(long n) {
		      if ((n == 0) || (n == 1))
		         return n;
		      else
		         return fib(n - 1) + fib(n - 2);
		   }
		
	   public static void main(String[] args) {
		   
		   /**
		    * Calls the fib method to calculate
		    * the fibonacci number for a range of positions, from 
		    * 0 to 100. The run time is calculated after each 
		    * fib run, and printed to the screen. 
		    */
		   
			  long startTime = System.nanoTime();

			  for (int i = 0; i < 100; i++) {
				  fib(i);
			      long endTime   = System.nanoTime();
			      long totalTime = endTime - startTime;
			      System.out.println(i + " " + totalTime);
			  }  

		   }
		
}
