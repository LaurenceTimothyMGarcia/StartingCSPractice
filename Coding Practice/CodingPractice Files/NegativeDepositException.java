public class NegativeDepositException extends Exception
{
   public NegativeDepositException()
   {
      super("Error: Negative deposit amount");
   }
   public NegativeDepositException(double amount)
   {
      super("Error: Negative deposit amount: " + amount);
   }
}
