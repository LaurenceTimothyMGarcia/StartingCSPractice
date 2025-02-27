public class PassTen {
   public static void main(String[] args)
   {
      int i;
      //i = message(16);
      i = test2(18, 5);
      System.out.println(i);
   }

   public static int test2(int x, int y)
   {
      if (x < y)

  {

    return -5;

  }

  else

  {

    return (test2(x - y, y + 5) + 6);

  }
   }
}
