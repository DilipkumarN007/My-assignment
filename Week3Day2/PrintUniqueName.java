package Week3Day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueName {

	
	public static void main(String[] args) {

		String text = "DilipkumarN";

		//Convert String to Character array
		for(int i=0; i < text.length(); i++) {
		char c = text.charAt(i);
		System.out.println(c);

		}
		//Create a new Set -> HashSet
		Set<Character> name = new HashSet<Character>();

		//Add each character to the Set and if it is already there, remove it
		name.add('D');
		name.add('i');
		name.add('l');
		name.add('i');
		name.add('p');
		name.add('k');
		name.add('u');
		name.add('m');
		name.add('a');
		name.add('r');		
		name.add('N');
		
		
		//print the set
		System.out.println("Unique characters are:" +name);


		{
		}

		}

}
