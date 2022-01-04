package week1.day2.assignments;

import java.util.Arrays;

public class Intersection {

	public static void main(String[] args) {
		int a1[] = {-2,2,3,56,6,8,-72,81};
		int a2[] = {4,6,8,3,22,23};
		Arrays.sort(a1);
		Arrays.sort(a2);
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if(a1[i] == a2[j]) {
					System.out.print(a1[i]+" ");
				}
				
			}
			
		}

	}

}
