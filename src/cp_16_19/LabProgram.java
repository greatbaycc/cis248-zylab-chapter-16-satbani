package cp_16_19;
// Drawing an upside down triangle

import java.util.Scanner;

public class LabProgram {
   
   /* TODO: Write recursive drawTriangle() method here. */
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int baseLength;
      
      baseLength = scnr.nextInt();
      drawTriangle(baseLength);
   }
}
