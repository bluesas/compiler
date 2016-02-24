/**
 * exapmle 2.13
 */

import java.util.Scanner;

public class Example_2_13{
    
    public static void main(String[] args) {
	
	    Scanner in = new Scanner(System.in);
		System.out.println("Example 2.13");
		System.out.print("Please input an expresition: ");
		String s = "9-2+5"; 
		
		Analyser analyser = new Analyser(s);

		System.out.println();	
		analyser.expr();
    }
}

