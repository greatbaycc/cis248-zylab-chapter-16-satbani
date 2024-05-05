package cp_16_20;
// Reverse a string

import java.util.Scanner;

public class LabProgram {

   /* TODO: Write recursive reverseString() method here. */
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input, result;
      
		input = scnr.nextLine();
		result = reverseString(input);	  
		System.out.printf("Reverse of \"%s\" is \"%s\".", input, result);
   }
}
