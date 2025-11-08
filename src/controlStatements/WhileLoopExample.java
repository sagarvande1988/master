package controlStatements;

public class WhileLoopExample {

	public static void main(String[] args) {
		
		// Print 1 to 10 using while loop

		int i=1;
		while (i<=10)
		{
			System.out.println(i);
			i++;
		}
	
System.out.println("------------------------------------------------------");
	// Print even numbers from 2 to 20 using while loop
	
	int j=2;
	
	while (j<=20)
	{
		if (j%2==0)
		{
			System.out.println(j);
			}
	j++;	
	}
	

	//Sum of first 10 natural numbers
	System.out.println("------------------------------------------------------");	
	int k=1;
	int sum=0;
	while (k<=10)
	{
		sum=sum+k;
		k++;
	}
System.out.println("Sum of first 10 natural numbers "+sum);
	
	}

	
}
