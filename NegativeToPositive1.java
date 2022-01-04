package week1.day2.assignments;

public class NegativeToPositive1 {

	public static void main(String[] args) {
		int[] x= {-12,-13,16,-25,5,7,8};
		int  j=x.length-1;
		for (int i = 0; i < x.length; i++) {
			while (x[i]<0) {
				x[i]=x[i]*(-1);
		}
			System.out.print(x[i]+" ");
			
		}
	}

}
