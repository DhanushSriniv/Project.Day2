package week1.day2.assignments;

public class MissingElementsInAnArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,7};
		int sum1=0;
		int sum2=0;
		for (int i = 0; i < a.length; i++) {
			sum1=sum1+a[i];			
		}
		for (int i = 1; i <= 7; i++) {
			sum2=sum2+i;
		}
		System.out.println("Sum of all elements in the array: "+sum1);
		System.out.println("Sum of range of elements: "+sum2);
		System.out.println("Missing element in the array is: "+(sum2-sum1));
	}

}
