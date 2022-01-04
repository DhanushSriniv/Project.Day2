package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		String[] x = {"a","b","c","d","d","c","b","a"};
		int i=0, j= x.length-1;
		while (i<j) {
			if (x[i] != x[j]) {
				System.out.println("Not a Palindrome: "+ x[i]);
			}if(x[i]==x[j]) {
				i++;j--; 
				 System.out.println("Palindrome: "+ x[i]);
			}
			break;
		}
		
		}
}
