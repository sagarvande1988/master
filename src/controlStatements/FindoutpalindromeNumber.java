package controlStatements;

public class FindoutpalindromeNumber {

	public static void main(String[] args) {
	
		 int num = 233, reversed = 0;
		    
		 int temp=num;
		    System.out.println("Original Number: " + num);

		    // run loop until num becomes 0
		    while(num != 0) {
		    
		      // get last digit from num
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;

		      // remove the last digit from num
		      num /= 10;
		    }
		    System.out.println("current value of Number: " + num);
		    System.out.println("Reversed Number: " + reversed);
		 
			
			 if (temp==reversed)
			 {
			System.out.println("Number is palindrome number");}
			else 
				System.out.println("Number is not palindrome number");
		  }
	


	}


