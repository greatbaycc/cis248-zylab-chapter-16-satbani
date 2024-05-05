package cp_16_19;
// Drawing an upside down triangle

import java.util.Scanner;

public class LabProgram {
   
   /* TODO: Write recursive drawTriangle() method here. */
   public static void drawTriangle(int baseLength) {
        for (int i = 0; i < (19 - baseLength) / 2; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < baseLength; i++) {
            System.out.print("*");
        }
        
        System.out.println();

        if (baseLength > 1) {
            drawTriangle(baseLength - 2);
        }
    }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int baseLength;
      
      baseLength = scnr.nextInt();
      drawTriangle(baseLength);
   }
}
