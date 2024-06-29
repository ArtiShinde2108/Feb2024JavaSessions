package javapracticeprogram;

public class SwapInterger {

	public static void main(String[] args) {
		
		//using third variable
		int x = 5;
		int y = 10;
		
	/*	int t;
		t=x;
		x=y;
		y=t;
		
		System.out.println(x);
		System.out.println(y); */
		
		//using arithmatic operation
		
	/*	x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(x);
		System.out.println(y); */
		
		//Using XOR operator
		
		x= x^y;
		y= x^y;
		x= x^y;
		
		System.out.println(x);
		System.out.println(y);
		

	}

}
