package m01.s09.ex;

import java.util.Arrays;

public class One {
	public static void main(String[] args) {
		String[] one = { "ciao", "buongiorno", "hello", "good morning" };

		System.out.print("First element is: ");
		System.out.println(one[0]);

		// (1) print the last string in the array
		System.out.print("Last element is: ");
		System.out.println(one[one.length - 1]);

		// (2) convert the array to a string and print it
		System.out.println(Arrays.toString(one));

	}
}
