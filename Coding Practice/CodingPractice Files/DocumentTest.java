public class DocumentTest 
{
   public static void main(String[] args)
   {
      Email email1= new Email("Body about programming in Java", "Larry", "David", "Programming");
      Email email2 = new Email("Body about running marathons", "Mary", "Emily", "races");
      File file1 = new File("Contents about some Java file", "/user/file.txt");
      File file2 = new File("Contents about marathon races", "run.txt");
      System.out.println("Email1 --\n" + email1);
      System.out.println("Email2 --\n" + email2);
      System.out.println("File1 --\n" + file1);
      System.out.println("File2 --\n" + file2);
      System.out.println("Which contains Java?");
      if (ContainsKeyword(email1,"Java"))
      System.out.println(" Email1");
      if (ContainsKeyword(email2,"Java"))
      System.out.println(" Email2");
      if (ContainsKeyword(file1,"Java"))
      System.out.println(" File1");
      if (ContainsKeyword(file2,"Java"))
      System.out.println(" File2");
   }
   public static boolean ContainsKeyword(Document docObject, String keyword)
   {
      if (docObject.toString().indexOf(keyword) >= 0)
      return true;
      return false;
   }
}
