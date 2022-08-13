package week1.days2;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		//Declare an Array 1
		int [] arr1 = {3, 2, 11, 4, 6, 7} ;
			
		//Declare an Array 2
		int [] arr2 = {1, 2, 8, 4, 9, 7} ;
			
        //Declare for loop iterator from 0 to array length
		for (int i = 0; i<=arr1.length-1; i++) {
			
		//Declare nested for another array from 0 to array length
		for (int j=0; j<=arr2.length-1; j++) {
			
		//Compare the both the arrays using a condition statement
		if (arr1[i] == arr2[j]) {
		
		//Print the firth array
		System.out.println(arr1[i]);
		
		}
			
		}
			
		}
		}
		
}
