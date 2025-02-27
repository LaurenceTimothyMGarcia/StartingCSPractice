public class NegativeStartingBalanceException extends Exception
{
   public NegativeStartingBalanceException()
   {
      super("Error: Negative starting balance");
   }
   public NegativeStartingBalanceException(double amount)
   {
      super("Error: Negative starting balance: " + amount);
   }
}