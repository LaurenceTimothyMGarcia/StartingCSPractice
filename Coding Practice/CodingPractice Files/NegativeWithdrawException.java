public class NegativeWithdrawException extends Exception
{
   public NegativeWithdrawException()
   {
      super("Error: Negative withdraw amount");
   }
   public NegativeWithdrawException(double amount)
   {
      super("Error: Negative withdraw amount: " + amount);
   }
}