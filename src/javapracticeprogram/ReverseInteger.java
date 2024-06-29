package javapracticeprogram;

public class ReverseInteger {

	public static void main(String[] args) {
		
		long num = 12345;
		long rev = 0;
		
		while(num !=0) {
			rev = rev *10 + num % 10;
			num = num/10;
		}
		
		System.out.println(rev);
		System.out.println("-------------------------------");
		
		
		//2 approach
		long num1 =6789;
		String value = String.valueOf(num1);
		StringBuffer bf = new StringBuffer(value);
		System.out.println(bf.reverse());

	}

}
