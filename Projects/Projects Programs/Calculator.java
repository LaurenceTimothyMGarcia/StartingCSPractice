//Laurence Timothy Manalo Garcia
//CS 1400, Section 03
//Project 8 - Calculator with Exception Handling
//May 7th, 2021
public class Calculator 
{
   private double result;

   public Calculator()
   {
      result = 0.0;
   }

   public double getResult()
   {
      return result;
   }
   public void doCalculation (String expression) throws UnknownOperatorException, NumberFormatException
   {
      double numInput;

      if (expression.equals(""))
      {
         System.out.println("Must specify operand");
         return;
      }

      expression = expression.trim();
      expression = expression.replace(" ","");

      if(!(expression.startsWith("+") || expression.startsWith("-") || expression.startsWith("*") || expression.startsWith("/")))
      {
         throw new UnknownOperatorException(expression.substring(0, 1));
      }

      expression = expression.substring(0);
      numInput = Double.parseDouble(expression.substring(1));

      if(expression.startsWith("+"))
      {
         result += numInput;
      }
      if(expression.startsWith("-"))
      {
         result -= numInput;
      }
      if(expression.startsWith("*"))
      {
         result *= numInput;
      }
      if(expression.startsWith("/"))
      {
         result /= numInput;
      }
   }
}
