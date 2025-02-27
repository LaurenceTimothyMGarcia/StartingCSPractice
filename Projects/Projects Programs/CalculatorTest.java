//Laurence Timothy Manalo Garcia
//CS 1400, Section 03
//Project 8 - Calculator with Exception Handling
//May 7th, 2021

import java.util.Scanner;
public class CalculatorTest 
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      Calculator cal = new Calculator();
      String input;

      System.out.println("Calculator is on.");
      System.out.println("result = " + cal.getResult());
      input = kb.nextLine();

      while(input.compareTo("r") != 0)
      {
         try
         {
            cal.doCalculation(input);
            System.out.println("updated result = " + cal.getResult());
            input = kb.nextLine();
         }
         catch(UnknownOperatorException e)
         {
            System.out.println(e.getMessage());
            input = kb.nextLine();
            continue;
         }
         catch(NumberFormatException e)
         {
            System.out.println("Invalid non-numeric operand.");
            input = kb.nextLine();
            continue;
         }
      }

      System.out.println("final result = " + cal.getResult());
   }
}
