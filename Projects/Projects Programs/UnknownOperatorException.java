//Laurence Timothy Manalo Garcia
//CS 1400, Section 03
//Project 8 - Calculator with Exception Handling
//May 7th, 2021

public class UnknownOperatorException extends Exception
{
   public UnknownOperatorException()
   {
      super(" is an unknown operation.");
   }

   public UnknownOperatorException(String operation)
   {
      super(operation + " is an unknown operation.");
   }
}