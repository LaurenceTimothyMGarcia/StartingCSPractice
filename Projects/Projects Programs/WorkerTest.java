//Laurence Timothy Manalo Garcia
//CS1400, section 03
//Project 7 - Employee Inheritance
//May 2nd, 2021

public class WorkerTest 
{
   public static void main(String[] args)
   {
      ProductionWorker worker1 = new ProductionWorker("John Smith", "123-A", "11-15-2005", 1, 23.50);
      ProductionWorker worker2 = new ProductionWorker();
      ProductionWorker worker3 = new ProductionWorker("Tony Gaddis", "5AF-A", "1-23-2006", 7, 19.50);

      System.out.println("Here's the first production worker.");
      System.out.println(worker1);

      System.out.println("Here's the second production worker.");
      worker2.setName("Joan Jones");
      worker2.setNumber("222-L");
      worker2.setDate("12-12-2018");
      worker2.setShift(2);
      worker2.setPayRate(18.50);
      System.out.println(worker2);

      System.out.println("Here's the third production worker.");
      System.out.println(worker3);
   }
}
