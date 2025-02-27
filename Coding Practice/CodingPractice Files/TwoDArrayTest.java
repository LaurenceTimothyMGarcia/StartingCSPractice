public class TwoDArrayTest 
{
   public static void main(String[] args)
   {
      int[][] array = {{2, 1, 9},
                      {7, 3, 4}};

      System.out.println("Processing the int array.");
      System.out.printf("Total: %d\n", TwoDArray.getTotal(array));
      System.out.println("Average: " + TwoDArray.getAverage(array));
      System.out.printf("Total of row 0: %d\n", TwoDArray.getRowTotal(array, 0));
      System.out.printf("Total of row 1: %d\n", TwoDArray.getRowTotal(array, 1));
      System.out.printf("Total of col 0: %d\n", TwoDArray.getColumnTotal(array, 0));
      System.out.printf("Total of col 2: %d\n", TwoDArray.getColumnTotal(array, 2));
      System.out.printf("Highest in row 0: %d\n", TwoDArray.getHighestInRow(array, 0));
      System.out.printf("Highest in row 1: %d\n", TwoDArray.getHighestInRow(array, 1));
      System.out.printf("Lowest in col 0: %d\n", TwoDArray.getLowestInColumn(array, 0));
      System.out.printf("Lowest in col 1: %d\n", TwoDArray.getLowestInColumn(array, 1));
   }
}
