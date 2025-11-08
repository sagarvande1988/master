package controlStatements;

public class ForLoop {

	public static void main(String[] args) {
		// Print numbers from 1 to 10

for(int i=1;i<=10;i++)
{
	
System.out.println(i);
	}

// Print even numbers from 1 to 100
System.out.println("-------------------------------------------------------------");
for (int j=1;j<=100;j++)
{
	if (j%2==0)
	System.out.println(j);
}


//Print multiplication table of a given number (e.g., input = 5 → Output: 5, 10, 15, ..., 50)

System.out.println("-------------------------------------------------------------");
int m=5;

for(int k=1;k<=10;k++)
{
	System.out.println(m*k);
	
}

// Print a square of stars (*)
System.out.println("-------------------------------------------------------------");

int g; int h;

for(g=1;g<=5;g++)
{

	for (h=1;h<=5;h++)
	{
	System.out.print("*");
	}
System.out.print("\n");
}
	
// Print right-angle triangle of numbers
	
	 int rows = 5; // You can change the number of rows here

     // Outer loop for rows
     for (int i = 1; i <= rows; i++) {
         // Inner loop for columns (numbers in each row)
         for (int j = 1; j <= i; j++) {
             System.out.print(j + " "); // Print the number and a space
         }
         System.out.println(); // Move to the next line after each row
     }
}
}