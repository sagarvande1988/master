package controlStatements;

public class SwitchStatment {

	public static void main(String[] args) {
		/* switch (expression) {
    case value1:
        // code to be executed if expression matches value1
        break; // optional, but recommended to prevent fall-through
    case value2:
        // code to be executed if expression matches value2
        break; // optional
    // ... more cases
    default:
        // code to be executed if no case matches the expression
}*/

		//Assignment to find out week number based on week name
		
		int weekName=8;
		
		switch (weekName)
		{
		case 1: System.out.println("weekname is sunday"); break; 
		case 2: System.out.println("weekname is Monda"); break; 
		case 3: System.out.println("weekname is Tue"); break; 
		case 4: System.out.println("weekname is Wed"); break; 
		case 5: System.out.println("weekname is Thursday"); break; 
		case 6: System.out.println("weekname is Friday"); break; 
		case 7: System.out.println("weekname is saturday"); break;
		default: System.out.println("incorrect week number"); 
		
		}
		
	}

}
