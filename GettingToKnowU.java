// New Test
/*Import Scanner*/

import java.util.Scanner;
  
class GettingToKnowU {
    public static void main(String[] args) {
      /* Ask user's name */
      System.out.println("Hello, I'm Java! What's your name?");
      Scanner keyboard = new Scanner(System.in);
      String firstname = keyboard.nextLine();
      
      /* Ask user's phone number */
      System.out.println("Can I have your telephone number?");
      String phonenumber = keyboard.nextLine();
      
      /* Ask user's street address */
      System.out.println("What's your street address?");
      String street = keyboard.nextLine();
      
      /* Ask user's city */
      System.out.println("What city do you live in?");
      String city = keyboard.nextLine();
      
       /* Ask user's DOB */
      System.out.println("I think I live around there. When were you born?");
      String dob = keyboard.nextLine();
      
      /*Ask user's ice cream preference */
      System.out.println("Nice to meet you, " + firstname + "! Do you, by chance, like ice cream? Yes or No?");
      String icecreamquestion = keyboard.nextLine();
      
      /* Ask user's music artist preference */
       if (icecreamquestion.equals("Yes"))
        {
            System.out.println("Awesome. My favorite flavor is vanilla. What's your favorite music artist?");
        }
       if (icecreamquestion.equals("yes"))
        {
            System.out.println("Awesome. My favorite flavor is vanilla. What's your favorite music artist?");
        }
            else if (icecreamquestion.equals("No"))
            {
                System.out.println("Yeah, I don't really like icecream either. What's your favorite music artist?");
            }
            else if (icecreamquestion.equals("no"))
            {
                System.out.println("Yeah, I don't really like icecream either. What's your favorite music artist?");
            }
 String musicartistquestion = keyboard.nextLine();
 System.out.println("I love " + musicartistquestion + "! I was just listening to them earlier today.");
 
 /* Ask user's occupation aspirations */
 System.out.println("What do you want to be when you get older?");
 String occupationquestion = keyboard.nextLine();
 
 /*Ask how much occupation pays yearly */
 System.out.println("Whoa, " + occupationquestion + "? That's pretty cool. What do you think they make annually?");
  int moneyanswer = keyboard.nextInt();
  
  /* Calculate weekly salary */
  int weeklysalary = moneyanswer / 52;

  /* Display weekly salary */
 System.out.println("Hey, that's not too bad. That rounds out to about... $" + weeklysalary + " a week!");
 
 /* Say Goodbye! */
 System.out.println("Well, I've gotta RUN. It's been nice talking to you! I'll be sure to send a " + musicartistquestion + "-themed cake to your house in " + city +" on " + dob + "! But I'll probably call ahead to let you know. Your number is " + phonenumber + " again, right? Great. Oh, and I expect to see you as a famous " + occupationquestion + " in 10 years. See ya later!");
      keyboard.close();
}
}
