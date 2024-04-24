package week1.day3;

import java.util.Arrays;

public class FindMissingElementArrays {

	public static void main(String[] args) {
		int[] a = { 1, 4, 3, 2, 8, 6, 7 };

		// sort the array
		Arrays.sort(a);
		int j = 0;
		for (int i = 0; i < a.length - 1; i++) {

			if ((i + 1) != a[i]) {//iterator variable+1 (value in an array starts with >0) is compared with array values
				j = i + 1; //assigning iterator value to a local variable j when i+1 is not equal to array value
				break;
			}
			
		}
		System.out.println("missing value = " + j);
	}

}
