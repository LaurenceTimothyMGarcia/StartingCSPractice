public class InvalidMonthNumberException extends Exception
{
   public InvalidMonthNumberException()
   {
      super("Error - Invalid number for month");
   }
   public InvalidMonthNumberException(int number)
   {
      super("Error - Invalid number for month: " + number);
   }
}
