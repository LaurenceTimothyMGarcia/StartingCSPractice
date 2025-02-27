import java.util.Scanner;
public class WordReplacement 
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      String phrase;
      String rephrasedFirst;
      String rephrasedSecond;
      int hateStart;

      System.out.println("enter a line of text (blank line to stop):");

      do
      {
         phrase = kb.nextLine();

         if(phrase.equals(""))
            break;

         if(phrase.indexOf("hate") == -1)
         {
            System.out.println("hate is not found\n");
            System.out.println("enter another line (blank line to stop):");
            continue;
         }

         hateStart = phrase.indexOf("hate") - 1;

         rephrasedFirst = phrase.substring(0, hateStart);
         rephrasedSecond = phrase.substring(hateStart + "hate".length() + 1);

         System.out.println("I have rephrased that line to read: ");
         System.out.printf("%s love%s\n\n", rephrasedFirst, rephrasedSecond);
         System.out.println("enter another line (blank line to stop):");
      }while (!(phrase.equals("")));
   }
}
