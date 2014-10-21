import java.util.Scanner;

public class MagpieRunner4
{
 public static void main(String[] args)
 {
  Magpie4 maggie = new Magpie4();
  
  System.out.println (maggie.getGreeting());
  Scanner in = new Scanner (System.in);
  String statement = in.nextLine();
  
  while (!statement.equalsIgnoreCase("Bye"))
  {
   System.out.println (maggie.getResponse(statement));
   statement = in.nextLine();
  }
  System.out.println("Oh, you're leaving? Okay...bye!");
 }

}
