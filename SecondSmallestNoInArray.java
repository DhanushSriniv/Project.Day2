package week1.day2.assignments;

import java.util.Arrays;

public class SecondSmallestNoInArray {

	public static void main(String[] args) {
		int a[] = {10,-320,50,574,363,590};
		for (int i = 0; i < a.length; i++) {
			Arrays.sort(a);
			System.out.print(a[i]+" ");
		}
		System.out.println("Second smallest element in the array:"+a[1]);
	}

}
