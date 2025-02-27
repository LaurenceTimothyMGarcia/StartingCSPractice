public class PhoneBookEntry 
{
   private String phoneName;
   private String phoneNumber;

   public PhoneBookEntry(String name, String number)
   {
      phoneName = name;
      phoneNumber = number;
   }

   public void setName(String name)
   {
      phoneName = name;
   }
   public void setNumber(String number)
   {
      phoneNumber = number;
   }

   public String phoneName()
   {
      return phoneName;
   }
   public String phoneNumber()
   {
      return phoneNumber;
   }

   public String toString()
   {
      String str = String.format("(%s, %s)", phoneName, phoneNumber);
      return str;
   }
}
