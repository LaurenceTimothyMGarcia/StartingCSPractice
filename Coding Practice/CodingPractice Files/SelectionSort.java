import java.io.*;
import java.util.Scanner;
public class SelectionSort 
{
   public static void main(String[] args) throws IOException
   {
      File dataFile = new File("data.txt");
      int[] dataArray = new int[100];
      int counter = 0;

      if (!dataFile.exists())
      {
         System.out.println("data.txt is not found");
         System.exit(0);
      }

      Scanner readFile = new Scanner(dataFile);

      while (counter < dataArray.length)
      {
         if (readFile.hasNext())
         {
            dataArray[counter] = readFile.nextInt();
            counter++;
         }
         else
         {
            break;
         }
      }

      selectionSort(dataArray, counter);
      outputData(dataArray, counter);
   }

   public static void selectionSort(int[] array, int counter)
   {
      int minIndex, tempHold;
      for (int i = 0; i < (counter - 1); i++)
      {
         minIndex = i;
         for (int j = i+1; j < counter; j++)
         {
            if (array[j] < array[minIndex])
            {
               minIndex = j;
            }
         }
         tempHold = array[minIndex];
         array[minIndex] = array[i];
         array[i] = tempHold;
      }
   }

   public static void outputData(int[] array, int counter) throws IOException
   {
      PrintWriter outFile = new PrintWriter("data.out");
      int eachLine = 0;

      for (int i = 0; i < counter; i++)
      {
         if (eachLine == 10)
         {
            outFile.println();
            eachLine = 0;
         }
         outFile.printf("%-8d", array[i]);
         eachLine++;
      }
      outFile.close();
   }
}
