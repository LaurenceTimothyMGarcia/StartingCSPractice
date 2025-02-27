public class Month
{
   private int monthNumber;
   private String[] monthName = {"january", "february", "march", "april", "may", "june", 
                                 "july", "august", "september", "october", "november", "december"};

   public Month(int m) throws InvalidMonthNumberException
   {
      if (m < 1 || m > 12)
      {
         throw new InvalidMonthNumberException(m);
      }
      monthNumber = m;
   }

   public Month(String name) throws InvalidMonthNameException
   {
      name = name.toLowerCase();

      for (int i = 0; i < monthName.length; i++)
      {
         if (monthName[i].equals(name))
         {
            monthNumber = i + 1;
            return;
         }
      }
      throw new InvalidMonthNameException(name);
   }

   public String toString()
   {
      return monthName[monthNumber - 1];
   }
}
