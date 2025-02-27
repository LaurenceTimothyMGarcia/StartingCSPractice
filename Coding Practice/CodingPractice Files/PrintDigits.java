import java.util.Scanner;
public class PrintDigits 
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);

      System.out.print("enter a positive integer: ");
      int n = kb.nextInt();
      System.out.println("print n right to left...");
      printRightToLeft(n);
   }

   public static void printRightToLeft(int n)
   {
      if (n < 10)
      {
         System.out.println(n);
      }
      else
      {
         System.out.println(n % 10);
         printRightToLeft(n/10);
      }
   }
}
