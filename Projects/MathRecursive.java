public class MathRecursive
{
   public static void main (String [] args)

   {
      int mainNum1 = 1;
      int mainNum2 = 2;
      int ctr = 0;
      myMathFunction(mainNum1, mainNum2, ctr);
   }
   public static void myMathFunction(int a, int r, int counter)

   {
      int val;
      val = a*r;
      System.out.print(val+" ");
      if (counter > 4)
         System.out.print("End");
      else
         myMathFunction(val, r, counter + 1);
   }

}