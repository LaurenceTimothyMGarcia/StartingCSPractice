//Laurence Timothy Manalo Garcia
//CS 1400, section 03
//Project 5 - Arithmetic Operations with Fractions
//April 3rd, 2021

import java.util.Scanner;
public class Fraction
{
   private int numerator;
   private int denominator;
   private static int created = 0;

   public Fraction()
   {
      numerator = 0;
      denominator = 1;
   }
   public Fraction(int num, int den)
   {
      numerator = num;
      denominator = den;
      this.fractionCheck(numerator, denominator);
      created++;
   }

   private void fractionCheck (int num, int den)
   {
      int commonD;
      if (den == 0)
      {
         System.out.println("denominator cannot be 0");
         System.out.println("the fraction is set to 0/1");
         num = 0;
         den = 1;
      }
      if (num == 0)
      {
         den = 1;
      }
      if (den < 0)
      {
         num = (-1) * num;
         den = (-1) * den;
      }

      if(num > 0)
      {
         commonD = gcd(num,den);
         numerator = num / commonD;
         denominator = den / commonD;
      }
      else if (num == 0)
      {
         numerator = 0;
         denominator = 1;
      }
      else
      {
         num = (-1) * num;
         commonD = gcd(num,den);
         num = (-1) * num;
         numerator = num / commonD;
         denominator = den / commonD;
      }
      
   }

   private int gcd (int num1, int num2)
   {
      while (num1 != num2)
      {
         if (num1 > num2)
         {
            num1 = num1 - num2;
         }
         else
         {
            num2 = num2 - num1;
         }
      }
      return num1;
   }

   public Fraction add(Fraction f2)
   {
      int num1, num2, den;
      int result;

      num1 = this.numerator * f2.denominator;
      num2 = f2.numerator * this.denominator;
      den = this.denominator * f2.denominator;

      result = num1 + num2;
      Fraction frac = new Fraction(result, den);
      return frac;
   }

   public Fraction subtract(Fraction f2)
   {
      int num1, num2, den;
      int result;

      num1 = this.numerator * f2.denominator;
      num2 = f2.numerator * this.denominator;
      den = this.denominator * f2.denominator;

      result = num1 - num2;

      Fraction frac = new Fraction(result, den);
      return frac;
   }

   public Fraction multiply(Fraction f2)
   {
      int totalNum, totalDen;
      
      totalNum = this.numerator * f2.numerator;
      totalDen = this.denominator * f2.denominator;
      Fraction frac = new Fraction(totalNum, totalDen);
      return frac;
   }

   public Fraction divide(Fraction f2)
   {
      int totalNum, totalDen;
      
      totalNum = this.numerator * f2.denominator;
      totalDen = this.denominator * f2.numerator;
      Fraction frac = new Fraction(totalNum, totalDen);
      return frac;
   }

   public String toString()
   {
      String str = this.numerator + "/" + this.denominator;
      return str;
   }

   public float printAsFloat()
   {
      float result;
      result = (float) this.numerator / (float) this.denominator;
      System.out.print(result);
      return result;
   }

   public static int numberOfFractions()
   {
      return created;
   }

   public static Fraction read()
   {
      Scanner kb = new Scanner(System.in);
      int num, den;

      System.out.print("enter an integer numerator: ");
      num = kb.nextInt();
      System.out.print("enter an integer denominator: ");
      den = kb.nextInt();

      Fraction frac = new Fraction(num, den);
      return frac;
   }
}