import java.io.*;
import java.util.Scanner;

public class FileIOSubClass extends FileIO
{
   @Override
   public void fileRead(String s) throws IOException
   {
      File myFile = new File(s);
      if(!myFile.exists())
      {
         System.out.printf("Error: input file %s does not exist\n", s);
         System.exit(0);
      }
      Scanner inputFile = new Scanner(myFile);
      while (inputFile.hasNext())
      {
         System.out.println(inputFile.nextLine());
      }
      inputFile.close();
   }

   @Override
   public void fileWrite(String s, String[] a) throws IOException
   {
      PrintWriter outputFile = new PrintWriter(s);
      for (int i = 0; i < a.length; i++)
      {
         outputFile.println(a[i]);
      }
      outputFile.close();
   }

   public void fileRead(File file) throws IOException
   {
      if(!file.exists()) 
      {
         System.out.print("Error: input file name not found\n");
         System.exit(0);
      }
      Scanner inputFile = new Scanner(file);
      while (inputFile.hasNext())
      {
         System.out.println(inputFile.nextLine());
      }
      inputFile.close();
   }
}
