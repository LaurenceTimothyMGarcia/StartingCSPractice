public class AccountTest 
{
   public static void main(String [] args)
   {
      for (int i=-100; i<500; i+=200)
      {
         try
         {
            System.out.println();
            
            BankAccount account = new BankAccount(i);
            System.out.println("account created with " + account);

            account.deposit(100);
            System.out.println("after deposit $100, " + account);

            account.withdraw(300);
            System.out.println("after withdraw $300, " + account);

            if (i == 300)
            {
               account.deposit(-10);
            }

            if (i == 500)
            {
               account.withdraw(-20);
            }
         }
         catch (NegativeStartingBalanceException e)
         {
            System.out.println(e.getMessage());
         }
         catch (NegativeDepositException e)
         {
            System.out.println(e.getMessage());
         }
         catch (NegativeWithdrawException e)
         {
            System.out.println(e.getMessage());
         }
         catch (WithdrawExceedBalanceException e)
         {
            System.out.println(e.getMessage());
         }
      }
   }
}
