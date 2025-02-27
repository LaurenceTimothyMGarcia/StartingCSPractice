import java.util.Scanner;
import java.io.*;
public class NameSearch 
{
   public static void main(String[] args) throws IOException
   {
      String[] boyNames = new String[200];
      String[] girlNames = new String[200];
      String name;
      Scanner kb = new Scanner(System.in);

      getNamesFromFile(boyNames, "BoyNames.txt");
      getNamesFromFile(girlNames, "GirlNames.txt");
      System.out.println("Popular Name Search");

      do
      {
         System.out.print("Enter a name (blank line to stop): ");
         name = kb.nextLine();
         if (name.compareTo("") == 0)
         {
            System.exit(0);
         }
         displaySearchResult(name, boyNames, girlNames);
      } while (!name.equals(""));
   }

   public static void getNamesFromFile(String[] array, String filename) throws IOException
   {
      File file = new File(filename);
      Scanner addName = new Scanner(file);
      int count = 0;

      while (addName.hasNext() && count < array.length)
      {
         array[count] = addName.nextLine();
         count++;
      }
   }

   public static int sequentialSearch(String[] array, String value)
   {
      for(int i = 0; i < array.length; i++)
      {
         if (array[i].compareTo(value) == 0)
         {
            return i;
         }
      }
      return -1;
   }

   public static void displaySearchResult(String input, String[] array1, String[] array2)
   {
      int searchResult;
      searchResult = sequentialSearch(array1, input);
      if (searchResult >= 0)
      {
         System.out.println(input + " is a popular boy's name.\n");
      }

      if (searchResult == -1)
      {
         searchResult = sequentialSearch(array2, input);
         if (searchResult >= 0)
         {
            System.out.println(input + " is a popular girl's name.\n");
         }
         else
         {
            System.out.println(input + " is not a popular name.\n");
         }
      }
   }
}
