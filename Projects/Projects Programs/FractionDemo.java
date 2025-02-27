//Laurence Timothy Manalo Garcia
//CS1400, section 03
//Project 5 - Arithmetic Operations with Fractions
//April 3rd, 2021

import java.util.Scanner;
public class FractionDemo 
{
   public static void main(String[] args)
   {
      boolean askToContinue;
      do
      {
         Scanner kb = new Scanner(System.in);
         Fraction frac1 = new Fraction();
         Fraction frac2 = new Fraction();

         System.out.println("Please enter 2 fractions --");
         System.out.println("Fraction 1:");
         frac1 = Fraction.read();
         System.out.println("Fraction 2:");
         frac2 = Fraction.read();

         Fraction resultAdd = new Fraction();
         resultAdd = frac1.add(frac2);
         System.out.printf("%s + %s = %s = ", frac1, frac2, resultAdd);
         resultAdd.printAsFloat();
         System.out.println();

         Fraction resultSubtract = new Fraction();
         resultSubtract = frac1.subtract(frac2);
         System.out.printf("%s - %s = %s = ", frac1, frac2, resultSubtract);
         resultSubtract.printAsFloat();
         System.out.println();

         Fraction resultMultiply = new Fraction();
         resultMultiply = frac1.multiply(frac2);
         System.out.printf("%s * %s = %s = ", frac1, frac2, resultMultiply);
         resultMultiply.printAsFloat();
         System.out.println();

         Fraction resultDivide = new Fraction();
         resultDivide = frac1.divide(frac2);
         System.out.printf("%s / %s = %s = ", frac1, frac2, resultDivide);
         resultDivide.printAsFloat();
         System.out.println();

         System.out.print("Do you want to continue? ('Y' or 'y' for yes, 'N' or 'n' for no) ");
         String bool = kb.nextLine();
         char boolCheck = bool.charAt(0);
         if (boolCheck == 'Y' || boolCheck == 'y')
         {
            askToContinue = true;
         }
         else
         {
            askToContinue = false;
         }
      }while(askToContinue);

      System.out.printf("%d fractions have been created.\n", Fraction.numberOfFractions());
   }
}
