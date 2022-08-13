package week1.days2;

import java.util.Arrays;

public class MissingElementInArray {

	
	public static void main(String[] args) {
		
		//Here is the output
		int [] arr = {1, 2, 3, 4, 7, 6, 8};
		
		//sort the array
		Arrays.sort(arr);
		
		//Loop through the array (start i from arr[0] till the length of the array)
		for(int i=0; i<=arr.length-1; i++) {
		System.out.println(arr[i]);
		
		//check if the iterator variable is not equal to the array values respectively
		if(i+1!= arr[i]) {
		
		//Print the number
		System.out.println(i+1);
		
		//Break the iterator
		break;
		
		}
	}
}
}