public class WithdrawExceedBalanceException extends Exception
{
   public WithdrawExceedBalanceException()
   {
      super("Error: Withdraw Exceed Balance");
   }
   public WithdrawExceedBalanceException(double amount)
   {
      super("Error: Withdraw Exceed Balance: " + amount);
   }
}