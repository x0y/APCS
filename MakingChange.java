// Danny Varitek's "Cents" Lab
import java.util.Scanner;

  class MakingChange {
  public static void main (String args[]) {
    // Ask for user's change 
    System.out.println("Welcome to the Automatic Change Calculator. What change are you left with? Please input your answer in cents");
    Scanner keyboard = new Scanner(System.in);
    int userinput = keyboard.nextInt();
    int dollaramount = userinput / 100; // Yields 1 dollar
    int dollaramountremainder = userinput % 100; //Yields 63 cents left over
    int quarteramount = dollaramountremainder / 25; // Yields 63/25 = 2
    int quarteramountremainder = dollaramountremainder % 25; // Yields 13 cents left over
    int dimeamount = quarteramountremainder / 10; // Yields 1 dime
    int dimeamountremainder = quarteramountremainder % 10; // Yields 3 cents
    
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
