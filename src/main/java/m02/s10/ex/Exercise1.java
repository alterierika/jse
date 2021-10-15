package m02.s10.ex;

import java.util.Arrays;

public class Exercise1 {
	public static void main(String[] args) {
	

		// (1) for loop
		for (int i = 0; i <= 9; i++) {
			System.out.println(i);

		}
		// (2) while loop
		{
			int i = 0;
			while (i <= 9) {
				System.out.println(i++);
			}
		}

		// (3) do-while loop
		{
			int i = 0;
			do {
				System.out.println(i++);
			} while (i <= 9);
		}
	}
}
	
	
	
