//Laurence Timothy Manalo Garcia
//CS1400, section 03
//Project 7 - Employee Inheritance
//May 2nd, 2021

public class Employee
{
   private String employeeName;
   private String employeeNumber;
   private String hireDate;

   public Employee()
   {
      employeeName = "";
      employeeNumber = "";
      hireDate = "";
   }

   public Employee(String name, String number, String date)
   {
      employeeName = name;
      employeeNumber = validateNumber(number);
      hireDate = date;
   }

   private String validateNumber(String number)
   {
      String num = number;
      String invalidNum = "";
      boolean digit = false;
      boolean hyphen = false;
      boolean letter = false;

      if(number.length() != 5)
      {
         return invalidNum;
      }
      for(int i = 0; i < 3; i++)
      {
         if(Character.isDigit(number.charAt(i)))
         {
            digit = true;
         }
         else
         {
            digit = false;
         }
      }
      if(number.charAt(3) == '-')
      {
         hyphen = true;
      }
      if(Character.isLetter(number.charAt(4)))
      {
         letter = true;
      }

      if(digit && hyphen && letter)
      {
         return num;
      }
      else
      {
         return invalidNum;
      }
   }

   public void setName(String name)
   {
      employeeName = name;
   }
   public void setNumber(String number)
   {
      employeeNumber = number;
   }
   public void setDate(String date)
   {
      hireDate = date;
   }

   public String getName()
   {
      return employeeName;
   }
   public String getNumber()
   {
      return employeeNumber;
   }
   public String getDate()
   {
      return hireDate;
   }

   public String toString()
   {
      String str;
      if(employeeNumber == "")
      {
         str = String.format("Name: %s\nEmployee Number: INVALID EMPLOYEE NUMBER\nHire Date: %s\n", 
                             employeeName, hireDate);
         return str;
      }
      else
      {
         str = String.format("Name: %s\nEmployee Number: %s\nHire Date: %s\n", 
                             employeeName, employeeNumber, hireDate);
         return str;
      }
   }
}