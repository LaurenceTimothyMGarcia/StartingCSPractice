public class APCalendar 
{
   public static int numberOfLeapYears(int year1, int year2)
   {
      int leapYears = 0;
      while(year1 <= year2)
      {
         if (isLeapYear(year1))
         {
            leapYears++;
         }
         year1++;
      }

      return leapYears;
   }   

   public static int dayOfWeek(int month, int day, int year)
   {
      int firstDay = firstDayOfYear(year);
      int dateInYear = dayOfYear(month, day, year);
      int returnDay = (dateInYear + firstDay - 1) % 7;
      return returnDay;
   }
}
