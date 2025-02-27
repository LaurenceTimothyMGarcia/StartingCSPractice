public class InvalidMonthNameException extends Exception
{
   public InvalidMonthNameException()
   {
      super("Error - Invalid name for month");
   }
   public InvalidMonthNameException(String name)
   {
      super("Error - Invalid name for month: " + name);
   }
}
