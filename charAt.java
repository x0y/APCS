import java.util.Scanner;

class charAt {
  public static void main(String [] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Please input a word you would like to splice.");
       String word = keyboard.nextLine();
       for (int i = 0; i < word.length(); i++) {
         System.out.println(word.charAt(i));
       
     }
  }
}
