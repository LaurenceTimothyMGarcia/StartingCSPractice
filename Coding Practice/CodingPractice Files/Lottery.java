import java.util.Scanner;
import java.util.Random;
public class Lottery
{
   public static void main(String[] args)
   {
      int[] userLottery;
      int[] lotteryNumber = generateLotteryNumber();
      int choice;
      Scanner kb = new Scanner(System.in);

      System.out.println("welcome to play Lottery ...");
      System.out.println("1. enter your own lottery number");
      System.out.println("2. get a computer-generated lottery number");
      System.out.print("your choice: ");
      choice = kb.nextInt();

      if (choice == 2)
      {
         System.out.println();
         System.out.println("The Lottery Number is: ");
         userLottery = generateLotteryNumber();
      }
      else
      {
         userLottery = new int[5];
         System.out.println();
         System.out.print("enter 5 single-digit numbers, separated by space: ");

         for (int i = 0; i < userLottery.length; i++)
         {
            userLottery[i] = kb.nextInt();
         }
      }

      System.out.println("The Lottery Number is: ");
      System.out.print("\t");
      for (int val: lotteryNumber)
      {
         System.out.print(val + " ");
      }
      System.out.println();

      System.out.println("Your Number is: ");
      System.out.print("\t");
      for (int val: userLottery)
      {
         System.out.print(val + " ");
      }
      System.out.println();
      System.out.printf("There are %d matching digits",
                        compareNumbers(lotteryNumber, userLottery));
   }

   public static int[] generateLotteryNumber()
   {
      Random rand = new Random();
      int[] lotteryNumber = new int [5];

      for (int i = 0; i < 5; i++)
      {
         lotteryNumber[i] = rand.nextInt(10);
      }
      return lotteryNumber;
   }

   public static int compareNumbers (int[] lottery, int[] picks)
   {
      int count = 0;
      for (int i = 0; i < lottery.length; i++)
      {
         if(lottery[i] == picks[i])
         {
            count++;
         }
      }
      return count;
   }
}