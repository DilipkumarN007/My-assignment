package Week3Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestElement {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};

		//Create a empty Set Using TreeSet
		Set<Integer> obj = new TreeSet<Integer>();

		System.out.println("Set:" +obj);

		//Declare for loop iterator from 0 to data.length and add into Set
		for(int i = 0; i <data.length; i++) {

		obj.add(data[i]);
		}

		System.out.println("TreeSet:" +obj);

		//converted Set into List
		List<Integer> list = new ArrayList<Integer>(obj);
		//Print the second last element from List
		int num = list.size();
		System.out.println("Second Largest number:" + list.get(num-2));

		}
		}
