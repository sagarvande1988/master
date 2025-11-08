package operatorsassignment;

public class SwapingOfTwoNumberWithoutTempVariable {

	public static void main(String[] args) {
	
		int a=10, b=20;
		
		System.out.println("Before swipe value of a "+a);
		System.out.println("Before swipt value of b "+b);
		
		b=a+b; //b=30
		a=b-a; //a=20
		b=b-a; //b =10
		System.out.println("---------------------------------------");

		System.out.println("After swipe value of a "+a);
		System.out.println("After swipt value of b "+b);
	}

}
