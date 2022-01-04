package week1.day2.assignments;

public class SecondSmallestElementInAnArray1 {
	public static int getSmallestElement(int[] a) {
		
		int firstSmall=a.length-1;
		int secondSmallest=a.length-1;
		for (int i = 0; i < a.length; i++) {
			if (a[i]<firstSmall) {
				secondSmallest=firstSmall;
				firstSmall=a[i];				
			}
			if (a[i]>firstSmall && a[i]<secondSmallest) {
				secondSmallest=a[i];
			}
		}
		return secondSmallest;
    }

  public static void main(String[] args) {
	  int a[]= {-2,-5,-23,23,25,73};
         int result = getSmallestElement(a);
         System.out.println(" Second smallest number " + result);
	}
}
