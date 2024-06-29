package javapracticeprogram;

public class LargestAndSmallest {

	public static void main(String[] args) {
	
        int numbers [] = {-10, 24, 50, -88, 6789};
        
        int largest = numbers[0];
        int smallest = numbers[0];
        
        for(int i=1 ; i<numbers.length ; i++) {
        	
        	if(numbers[i]>largest) {
        		
        		largest= numbers[i];
        	}
        	else if(numbers[i]<smallest) {
        		
        		smallest= numbers[i];
        	}
        }
		
		System.out.println("The smallest number is " + smallest);
		System.out.println("The largest number is " + largest);
		
	}

}
