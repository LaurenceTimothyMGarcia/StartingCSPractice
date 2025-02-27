import java.util.Scanner;
public class BinarySearch 
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int input, position;
      int[] array = {15, 20, 25, 30, 35, 40};

      System.out.print("enter a number: ");
      input = kb.nextInt();

      position = BinSearch(array, input);
      if (position == -1)
      {
         System.out.println(input + " is not in the array");
      }
      else
      {
         System.out.println(input + " is at position " + position);
      }
   }

   public static int BinSearch(int[] array, int input)
   {
      int first = 0;
      int last = array.length - 1;
      int mid;

      while (first <= last)
      {
         mid = (first + last) / 2;

         if (input == array[mid])
         {
            return mid;
         }
         if (input < array[mid])
         {
            last = mid - 1;
         }
         else
         {
            first = mid + 1;
         }
      }

      return -1;
   }
}
