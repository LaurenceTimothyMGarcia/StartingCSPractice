import java.util.Scanner;
public class WordReplacementWithMethod 
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      String blankLine;
      String replacedWord, newSubstring;

      System.out.println("enter a line of text (blank line to stop):");

      do
      {
         blankLine = kb.nextLine();
         if(blankLine.equals(""))
         {
            break;
         }
         System.out.print("enter a substring to be replaced: ");
         replacedWord = kb.nextLine();
         System.out.print("enter the new substring: ");
         newSubstring = kb.nextLine();
         System.out.println(replaceSubstring(blankLine, replacedWord, newSubstring));
         System.out.println();
         System.out.println("enter another line (blank line to stop)");
      } while(!(blankLine.equals("")));
   }

   public static String replaceSubstring(String string1, String string2, String string3)
   {
      int position = string1.indexOf(string2);
      int positionEnd = position + string2.length();
      String fixedString, fixedString2;
      String finalString;

      if(position == -1)
      {
         String str = string2 + " is not found";
         return str;
      }

      fixedString = string1.substring(0, position);
      fixedString2 = string1.substring(positionEnd);

      finalString = fixedString + string3 + fixedString2;

      return finalString;
   }
}
