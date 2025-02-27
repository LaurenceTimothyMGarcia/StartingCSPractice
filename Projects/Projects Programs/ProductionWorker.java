//Laurence Timothy Manalo Garcia
//CS1400, section 03
//Project 7 - Employee Inheritance
//May 2nd, 2021

public class ProductionWorker extends Employee
{
   private int shift;
   private double payRate;

   public ProductionWorker()
   {
      shift = 1;
      payRate = 0.0;
   }
   public ProductionWorker(String name, String number, String date, int shift, double payRate)
   {
      super(name, number, date);
      this.shift = shift;
      this.payRate = payRate;
   }

   public void setShift(int shift)
   {
      this.shift = shift;
   }
   public void setPayRate(double payRate)
   {
      this.payRate = payRate;
   }

   public int getShift()
   {
      return shift;
   }
   public double getPayRate()
   {
      return payRate;
   }

   public String toString()
   {
      String str;
      if(shift == 1)
      {
         str = String.format("Shift: Day\nHourly Pay Rate: $%.2f\n", payRate);
      }
      else if(shift == 2)
      {
         str = String.format("Shift: Night\nHourly Pay Rate: $%.2f\n", payRate);
      }
      else
      {
         str = String.format("Shift: INVALID SHIFT NUMBER\nHourly Pay Rate: $%.2f\n", payRate);
      }
      return super.toString() + str;
   }
}
