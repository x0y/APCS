import java.util.Scanner;

class NameEcho2 {
public static void main(String [] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What is your name?"); //Ask's user's name
    String Userinput = keyboard.nextLine();
    int spacelocation = Userinput.indexOf( ' ' ); //Finds location of space in name input
    String firstname = Userinput.substring(0, spacelocation); //Finds first name
    String lastname = Userinput.substring(spacelocation); //Finds last name
    lastname = lastname.toUpperCase(); //Changes last name to all caps
    String fullname = firstname.concat(" "+lastname); // Joins first name with last name
    System.out.println(fullname.trim() ); //Outputs full name with no extra spaces
  }
}
