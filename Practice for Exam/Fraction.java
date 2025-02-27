

public class Fraction
{
   private int numerator;
   private int denominator;
   private static int created;

   public Fraction()
   {
      numerator = 0;
      denominator = 1;
   }
   public Fraction(int num, int den)
   {
      numerator = num;
      denominator = den;
   }

   private void FracCheck(int num, int den)
   {
      int commonDen;
      if (den == 0)
      {
         System.out.println("Denominator cannot be 0");
         System.out.println("The Fraction is set to 0/1");
         num = 0;
         den = 1;
      }
      if (num == 0)
      {
         num = 0;
         den = 1;
      }
      if (den < 0)
      {
         num *= -1;
         den *= -1;
      }

      if (num > 0)
      {
         commonDen = gcd(num, den);
         numerator = num / commonDen;
         denominator = den / commonDen;
      }
      else if (num == 0)
      {
         numerator = 0;
         denominator = 1;
      }
      else
      {
         num *= -1;
         commonDen = gcd(num, den);
         num *= -1;

         numerator = num / commonDen;
         denominator = den / commonDen;
      }
   }

   private int gcd(int num1, int num2)
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
   }
}