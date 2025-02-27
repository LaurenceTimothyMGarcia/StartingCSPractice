import java.util.ArrayList;
import java.util.Scanner;
public class PhoneBookTest 
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      ArrayList<String> phoneList = new ArrayList<String>();
      String phoneName;
      String phoneNumber;

      System.out.println("I'm going to ask you to enter 5 names and phone numbers");
      System.out.print("Enter a person's name: ");
      phoneName = kb.nextLine();
      System.out.print("Enter that person's phone number: ");
      phoneNumber = kb.next();
      PhoneBookEntry person1 = new PhoneBookEntry(phoneName, phoneNumber);
      phoneList.add(person1.toString());
      kb.nextLine();

      System.out.print("Enter a person's name: ");
      phoneName = kb.nextLine();
      System.out.print("Enter that person's phone number: ");
      phoneNumber = kb.next();
      PhoneBookEntry person2 = new PhoneBookEntry(phoneName, phoneNumber);
      phoneList.add(person2.toString());
      kb.nextLine();

      System.out.print("Enter a person's name: ");
      phoneName = kb.nextLine();
      System.out.print("Enter that person's phone number: ");
      phoneNumber = kb.next();
      PhoneBookEntry person3 = new PhoneBookEntry(phoneName, phoneNumber);
      phoneList.add(person3.toString());
      kb.nextLine();

      System.out.print("Enter a person's name: ");
      phoneName = kb.nextLine();
      System.out.print("Enter that person's phone number: ");
      phoneNumber = kb.next();
      PhoneBookEntry person4 = new PhoneBookEntry(phoneName, phoneNumber);
      phoneList.add(person4.toString());
      kb.nextLine();

      System.out.print("Enter a person's name: ");
      phoneName = kb.nextLine();
      System.out.print("Enter that person's phone number: ");
      phoneNumber = kb.next();
      PhoneBookEntry person5 = new PhoneBookEntry(phoneName, phoneNumber);
      phoneList.add(person5.toString());
      kb.nextLine();
      System.out.println();

      System.out.println("Here's the data you entered: ");
      for(int i = 0; i < phoneList.size(); i++)
      {
         System.out.println(phoneList.get(i));
      }
      System.out.println();

      System.out.println("Insert my name to the beginning of the phone book:");
      PhoneBookEntry myInfo = new PhoneBookEntry("L Garcia", "310-7225");
      phoneList.add(0, myInfo.toString());
      System.out.println(phoneList.toString());
      System.out.println();

      System.out.println("Remove the last entry: ");
      phoneList.remove(phoneList.size() - 1);
      System.out.println(phoneList.toString());
   }
}
