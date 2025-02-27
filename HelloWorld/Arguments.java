public class Arguments 
{
   public static void main(String[] args)
   {
      for (int i = 0; i < args.length; i++)
      {
         System.out.printf("Argument %d: %s%n", i + 1, args[i]);
      }
      if (args.length == 0)
      {
         System.out.println("No arguments were given!");
      }
   }
}
