import java.util.Scanner;
public class PasswordTest 
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      String password;

      System.out.print("Enter a password: ");
      password = kb.nextLine();

      if(PasswordVerifier.passwordCheck(password))
      {
         System.out.println("Valid password");
      }
      else
      {
         System.out.println("Invalid password");
      }
      
   }
}
