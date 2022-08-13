package week1.days2;

public class FibonacciSeries {

	
	public static void main(String[] args) {
		
		//Print Fibonacci series for first 11 numbers
		
		int n = 11, num1 = 0, num2 =1;
		
		//Iterate from 1 to to the 11
		
		for (int i =1; i<=n; ++i) {
			 
			System.out.println(num1 +" ");
			
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			
		}
	}
}
