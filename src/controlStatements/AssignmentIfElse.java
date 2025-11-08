package controlStatements;

public class AssignmentIfElse {

	public static void main(String[] args) {
		
		//assignment to find out largest of two numbers using if else
		
		int a=40, b=300;
		if (a>b)
		System.out.println("a is greater than b and value of a is "+a);
		else
			System.out.println("b is greater than a and value of b is "+b);

		//assignment to find out largest of two numbers using ternary operator 
		// condition ? value_if_true : value_if_false;
		
		int r=100, y=300; int largerNumber;
		
		largerNumber=(r>y) ?r:y;
		
		System.out.println("larger value is "+largerNumber);
		
		// assignment to find out smallest of 3 numbers using if else
		
		int q=2, w=20, e=1;
		
		if(q<w && q< e)
			System.out.println("q is having small value "+q);
		else if (w<q && w<e)
			System.out.println("w is having small value "+w);
		else System.out.println("e is having small value "+e);
			
	
	
	
	}

}
