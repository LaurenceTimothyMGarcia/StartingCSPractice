public class TwoDArray 
{
   public static int getTotal(int[][] a)
   {
      int totalCounter = 0;
      for(int row = 0; row < a.length; row++)
      {
         for(int col = 0; col < a[row].length; col++)
         {
            totalCounter += a[row][col];
         }
      }
      return totalCounter;
   }

   public static double getAverage(int[][] a)
   {
      double average = 0;
      double counter = 0;
      for(int row = 0; row < a.length; row++)
      {
         for(int col = 0; col < a[row].length; col++)
         {
            average += a[row][col];
            counter++;
         }
      }
      average = average / counter;
      return average;
   }

   public static int getRowTotal(int[][] a, int row)
   {
      int rowTotal = 0;

      for(int i = 0; i < a[row].length; i++)
      {
         rowTotal += a[row][i];
      }
      return rowTotal;
   }

   public static int getColumnTotal(int[][] a, int col)
   {
      int colTotal = 0;

      for(int i = 0; i < a[0].length - 1; i++)
      {
         colTotal += a[i][col];
      }
      return colTotal;
   }

   public static int getHighestInRow(int[][] a, int row)
   {
      int highestRow = a[row][0];
      for(int i = 0; i < a[row].length; i++)
      {
         if(highestRow < a[row][i])
         {
            highestRow = a[row][i];
         }
      }
      return highestRow;
   }

   public static int getLowestInColumn(int[][] a, int col)
   {
      int lowestCol = a[0][col];
      for(int i = 0; i < a[0].length - 1; i++)
      {
         if(lowestCol > a[i][col])
         {
            lowestCol = a[i][col];
         }
      }
      return lowestCol;
   }
}
