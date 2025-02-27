public class File extends Document
{
   private String pathname;
   public File()
   {
      super();
      pathname = "";
   }
   public File(String body, String pathname)
   {
      super(body);
      this.pathname = pathname;
   }
   public void setPathname(String s)
   {
      pathname = s;
   }
   public String getPathname()
   {
      return pathname;
   }
   @Override
   public String toString()
   {
      return "Pathname: " + pathname
             + "\nBody: " + super.toString();
   }
}
