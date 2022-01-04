package week1.day2.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int primeNo = 10;
		boolean prime = true;
		for (int i = 2; i < primeNo; i++) {
			if ((primeNo%i) == 0 ) {
				prime = false;
				
				}
			System.out.println(prime);
			
		}

	}

}
