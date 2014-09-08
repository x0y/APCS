// Danny Varitek's "Cents" Lab
import java.util.Scanner;

  class MakingChange {
  public static void main (String args[]) {
    // Ask for user's change 
    System.out.println("Welcome to the Automatic Change Calculator. What change are you left with? Please input your answer in cents");
    Scanner keyboard = new Scanner(System.in);
    int userinput = keyboard.nextInt();
    int dollaramount = userinput / 100;
    int dollaramountremainder = userinput % 100;
    int quarteramount = dollaramountremainder / 25;
    int quarteramountremainder = dollaramountremainder % 25;
    int dimeamount = quarteramountremainder / 10;
    int dimeamountremainder = quarteramountremainder % 10;
    
    if (dimeamountremainder <= 4) 
        {
            int simplepenny = dimeamountremainder;
            System.out.println("You have " + dollaramount + " dollar(s), " + quarteramount + " quarter(s), " + dimeamount + " dime(s), and " + simplepenny + " pennies.");
        }
            else if (dimeamountremainder >= 4) 
            {
                int nickelamount = dimeamountremainder / 5; // Will always yield 1
                int nickelamountremainder = dimeamountremainder % 5; // Will yield what is left of the problem
                int pennyamount = nickelamountremainder / 1; // Will yield remainder cents
                System.out.println("You have " + dollaramount + " dollar(s), " + quarteramount + " quarter(s), " + dimeamount + " dime(s), " + nickelamount + " nickel(s), and " + pennyamount + " pennies.");
            }
    
    

    keyboard.close();
  }
  }
