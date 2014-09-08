import java.util.Scanner;

public class diceRoll {
  public static void main(String [] args) {
    /* User Prompt */
    System.out.println("Welcome to the Dice Roll APP (DRA). Would you like to roll the dice? (Y/N)");
    Scanner input = new Scanner(System.in);
    String userprompt = input.next();
    /* User wants to roll the dice */
       if ("y".equalsIgnoreCase(userprompt)) {
         do {
          int die1;
          int die2;
          die1 = (int)(Math.random() * 6) + 1;
          die2 = (int)(Math.random() * 6) + 1;
          double probability = 0.0277777777777778; // 1/6*1/6 = 1/36 (I'm pretty sure this is how we were supposed to do the probability...)
          System.out.println("You rolled a " + die1 + " and a " + die2 + " (which add up to " + (die1+die2) + "). The probability of rolling these numbers together is " + probability + "%.");
         System.out.println("Would you like to roll again? (Y/N)");
         } while("Y".equalsIgnoreCase(input.next()));
       } // Closes roll dice section
       /*Use does not want to roll the dice */
      else if ("n".equalsIgnoreCase(userprompt)) {
          System.out.println("Goodbye!");
          input.close();
      }
  }
}
