package week1.day2.assignments;

public class PrimeNUmber1 {
	public static void main(String[] args) {
		    int n=24;
			boolean prime=true;
			int m=0;
			m=n/2;
			if (n==0||n==1) {
				System.out.println(n+" is not a Prime Number");
			}else {
				for (int i = 2; i < n; i++) {
					if (n%i==0) {
						System.out.println(n+" is not a Prime Number");
						prime=false;
						break;
					}
				}
				if (prime=true) {
					System.out.println(n+ " is a Prime Number");
				}
			}
		}
		
	}

	


