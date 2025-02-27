import java.util.Scanner;
public class PalindromeTest 
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);

      System.out.print("enter a string: ");
      String pal = kb.nextLine().toLowerCase();

      System.out.printf("\"%s\" %s a palindrome\n", 
                        pal, palindrome(pal, 0, pal.length()-1) ? "is": "is not");
   }

   public static boolean palindrome(String s, int i, int j)
   {
      if (i < j)
      {
         if (s.charAt(i) == s.charAt(j))
         {
            return (s.charAt(i) == s.charAt(j) && palindrome(s, i + 1, j - 1));
         }
      }
      return true;
   }
}
