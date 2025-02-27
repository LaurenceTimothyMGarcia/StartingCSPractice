public class PasswordVerifier 
{
   private String password;
   private static final int PASSWORD_LENGTH = 6;

   public static boolean passwordCheck(String passwordInput)
   {
      boolean passLength = false;
      boolean uppercase = false;
      boolean lowercase = false;
      boolean digit = false;
      if(passwordInput.length() >= PASSWORD_LENGTH)
      {
         passLength = true;
      }

      for(int i = 0; i < passwordInput.length(); i++)
      {
         char charCheck = passwordInput.charAt(i);
         if(Character.isLowerCase(charCheck))
         {
            lowercase = true;
         }
         if(Character.isUpperCase(charCheck))
         {
            uppercase = true;
         }
         if(Character.isDigit(charCheck))
         {
            digit = true;
         }
      }

      if(!passLength)
      {
         System.out.println("- length must be at least 6");
      }
      if(!uppercase)
      {
         System.out.println("- need at least one uppercase letter");
      }
      if(!lowercase)
      {
         System.out.println("- need at least one lowercase letter");
      }
      if(!digit)
      {
         System.out.println("- need at least one digit");
      }

      return passLength && uppercase && lowercase && digit;
   }
}
