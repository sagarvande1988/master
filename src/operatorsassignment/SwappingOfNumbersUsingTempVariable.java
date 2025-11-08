package operatorsassignment;

public class SwappingOfNumbersUsingTempVariable {

	
	public static void main(String[] args) {

	//Swapping of two numbers using third variable
		
		int a=10, b=20;
		
		System.out.println("Value of a before swaping is "+a);
		System.out.println("Value of b before swaping is "+b);
				
		int c=a; //storing value of a into c
		a=b; //storing value of b into a
		b=c; //storing value of c in to b
		System.out.println("------------------------------------------------------- ");
		
		System.out.println("Value of a after swaping is "+a);
		System.out.println("Value of b after swaping is "+b);
		
		

	}

}
