/*Danny Varitek's APCS Shape Runner Bonus Assignment*/
import java.util.Scanner;

public class ShapeRunner 
{
  public static void main(String [] args) 
  {
    System.out.println("Welcome to Shape Runner!");
    System.out.println("What would you like to do?");
    System.out.println("[0] Receive information on this program.");
    System.out.println("[1] Compute Area or Perimeter for a Circle.");
    System.out.println("[2] Compute Area or Perimeter for a Triangle.");
    System.out.println("[3] Compute Area or Perimeter for a Rectangle/Square.");
    System.out.println("[4] Compute Area or Perimeter for a Trapezoid.");
    
    Scanner userinput = new Scanner(System.in);
    String userPrompt1 = userinput.next();
    while (!userPrompt1.equals("0") && !userPrompt1.equals("1") && !userPrompt1.equals("2") && !userPrompt1.equals("3") && !userPrompt1.equals("4"))
    {
      System.err.println("Oops, That's not a valid choice.");
      System.out.println("What would you like to do?");
      System.out.println("[0] Receive information on this program.");
      System.out.println("[1] Compute Area or Perimeter for a Circle.");
      System.out.println("[2] Compute Area or Perimeter for a Triangle.");
      System.out.println("[3] Compute Area or Perimeter for a Rectangle/Square.");
      System.out.println("[4] Compute Area or Perimeter for a Trapezoid.");
      userPrompt1 = userinput.next();
    }
    if (userPrompt1.equals("0"))
    {
       System.out.println("Shape Runner was programmed by Danny Varitek as an AP Computer Science bonus assignment.");
    }   
    else if (userPrompt1.equals("1"))
    {
       Scanner circleinput = new Scanner(System.in);
       System.out.println("What is the radius of the circle? (1, 4.2, 0.1, etc.)");
       double circlePrompt1 = circleinput.nextDouble();
       System.out.println("What would you like to compute for your circle? (perimeter, area, both)");
       String circlePrompt2 = circleinput.next();
            if ("perimeter".equalsIgnoreCase(circlePrompt2))
            {
              Circle c1 = new Circle(circlePrompt1);
              double circleperimeter = c1.computePerimeter();
              System.out.println("Your circle's perimeter is " + circleperimeter + ".");
            }
            else if ("area".equalsIgnoreCase(circlePrompt2))
            {
              Circle c2 = new Circle(circlePrompt1);
              double circlearea = c2.computeArea();
              System.out.println("Your circle's area is " + circlearea + ".");
            }
            else if ("both".equalsIgnoreCase(circlePrompt2))
            {
              Circle c3 = new Circle(circlePrompt1);
              double circleperimeter = c3.computePerimeter();
              double circlearea = c3.computeArea();
              System.out.println("Your circle's perimeter is " + circleperimeter + " and your circle's area is " + circlearea + ".");
            }
     }   
     else if (userPrompt1.equals("2"))
     {
       Scanner triangleinput = new Scanner(System.in);
       System.out.println("What would you like to compute for your triangle? (perimeter, area, both)");
       String trianglePrompt1 = triangleinput.nextLine();
            if (trianglePrompt1.equalsIgnoreCase("perimeter"))
            {
              System.out.println("What are the three sides of your triangle? (input as \"side1 side2 side3\")");
              String trianglePrompt2 = triangleinput.nextLine();
              String[] splitInput = trianglePrompt2.split(" ");
       
              String triangleside1 = splitInput[0];
              String triangleside2 = splitInput[1];
              String triangleside3 = splitInput[2];
              
              double side1 = Double.parseDouble(triangleside1);
              double side2 = Double.parseDouble(triangleside2);
              double side3 = Double.parseDouble(triangleside3);
              
              double triangleperimeter = side1 + side2 + side3;
              
              System.out.println("Your triangle's perimeter is " + triangleperimeter + ".");
            }
            else if (trianglePrompt1.equalsIgnoreCase("area"))
            {
              System.out.println("What is the base and height of your triangle? (input as \"base height\").");
              String trianglePrompt3 = triangleinput.nextLine();
              int space = trianglePrompt3.indexOf(' ');
              String trianglebase = trianglePrompt3.substring(0, space);
              String triangleheight = trianglePrompt3.substring(space);
              
              double base = Double.parseDouble(trianglebase);
              double height = Double.parseDouble(triangleheight);
              
              Triangle t1 = new Triangle(base, height);
              double trianglearea = t1.computeArea();
              System.out.println("Your triangle's area is " + trianglearea + ".");
            }
            else if (trianglePrompt1.equalsIgnoreCase("both"))
            {
              System.out.println("What is the base and height of your triangle? (input as \"base height\").");
              String trianglePrompt4 = triangleinput.nextLine();
              System.out.println("What are the three sides of your triangle? (input as \"side1 side2 side3\")");
              String trianglePrompt5 = triangleinput.nextLine();
              
              int space = trianglePrompt4.indexOf(' ');
              String trianglebase = trianglePrompt4.substring(0, space);
              String triangleheight = trianglePrompt4.substring(space);
              
              double base = Double.parseDouble(trianglebase);
              double height = Double.parseDouble(triangleheight);
              
              Triangle t2 = new Triangle(base, height);
              double trianglearea = t2.computeArea();
              
              String[] splitInput = trianglePrompt5.split(" ");
       
              String triangleside1 = splitInput[0];
              String triangleside2 = splitInput[1];
              String triangleside3 = splitInput[2];
              
              double side1 = Double.parseDouble(triangleside1);
              double side2 = Double.parseDouble(triangleside2);
              double side3 = Double.parseDouble(triangleside3);
              
              double triangleperimeter = side1 + side2 + side3;
              
              System.out.println("Your triangle's area is " + trianglearea + " and your triangle's perimeter is " + triangleperimeter + ".");
            }
      }
     else if (userPrompt1.equals("3")) 
     {
       Scanner rectangleinput = new Scanner(System.in);
       System.out.println("What is the length and width of your rectangle/square? (input as \"length width\").");
       String rectanglePrompt1 = rectangleinput.nextLine();
       
       int space = rectanglePrompt1.indexOf(' ');
       String rectanglelength = rectanglePrompt1.substring(0, space);
       String rectanglewidth = rectanglePrompt1.substring(space);
       
       double length = Double.parseDouble(rectanglelength);
       double width = Double.parseDouble(rectanglewidth);
       
       System.out.println("What would you like to compute for? (perimeter, area, both)");
       String rectanglePrompt2 = rectangleinput.next();
          if ("perimeter".equalsIgnoreCase(rectanglePrompt2))
          {
           Rectangle r1 = new Rectangle(length, width);
           double rectangleperimeter = r1.computePerimeter();
           System.out.println("Your rectangle/square's perimeter is " + rectangleperimeter + ".");  
          }
          else if ("area".equalsIgnoreCase(rectanglePrompt2))
          {
            Rectangle r2 = new Rectangle(length, width);
            double rectanglearea = r2.computeArea();
            System.out.println("Your rectangle/square's area is " + rectanglearea +".");                                           
          }
          else if ("both".equalsIgnoreCase(rectanglePrompt2))
          {
            Rectangle r3 = new Rectangle(length, width);
            double rectanglearea = r3.computeArea();
            double rectangleperimeter = r3.computePerimeter();
            System.out.println("Your rectangle/square's area is " + rectanglearea + " and your rectangle/square's perimeter is " + rectangleperimeter + ".");
          }
       }
     else if (userPrompt1.equals("4")) 
     {
       Scanner trapezoidinput = new Scanner(System.in);
       System.out.println("What would you like to compute for your trapezoid? (perimeter, area, both)");
       String trapezoidPrompt1 = trapezoidinput.nextLine();
       if (trapezoidPrompt1.equalsIgnoreCase("area"))
       {
         System.out.println("What are the height and two bases of your trapezoid? (input as \"base1 base2 height\").");
         String trapezoidPrompt2 = trapezoidinput.nextLine();
         String[] splitInput = trapezoidPrompt2.split(" ");
       
         String trapezoidbase1 = splitInput[0];
         String trapezoidbase2 = splitInput[1];
         String trapezoidheight = splitInput[2];
       
         double base1 = Double.parseDouble(trapezoidbase1);
         double base2 = Double.parseDouble(trapezoidbase2);
         double height = Double.parseDouble(trapezoidheight);
       
         Trapezoid t1 = new Trapezoid(base1, base2, height);
         double trapezoidarea = t1.computeArea();
         System.out.println("Your trapezoid's area is " + trapezoidarea + ".");
       }
       else if (trapezoidPrompt1.equalsIgnoreCase("perimeter"))
       {
         System.out.println("What are the four sides of your trapezoid?");
         String trapezoidPrompt3 = trapezoidinput.nextLine();
         String[] splitInput = trapezoidPrompt3.split(" ");
       
         String trapezoidside1 = splitInput[0];
         String trapezoidside2 = splitInput[1];
         String trapezoidside3 = splitInput[2];
         String trapezoidside4 = splitInput[3];
       
         double side1 = Double.parseDouble(trapezoidside1);
         double side2 = Double.parseDouble(trapezoidside2);
         double side3 = Double.parseDouble(trapezoidside3);
         double side4 = Double.parseDouble(trapezoidside4);
         
         double trapezoidperimeter = side1 + side2 + side3 + side4;
         System.out.println("Your trapezoid's perimeter is " + trapezoidperimeter + ".");
       }
       else if (trapezoidPrompt1.equalsIgnoreCase("both"))
       {
         System.out.println("What are the height and two bases of your trapezoid? (input as \"base1 base2 height\").");
         String trapezoidPrompt4 = trapezoidinput.nextLine();
         System.out.println("What are the remaining two sides of your trapezoid? (input as \"side1 side2\")");
         String trapezoidPrompt5 = trapezoidinput.nextLine();
         
         String[] splitInput = trapezoidPrompt4.split(" ");
       
         String trapezoidbase1 = splitInput[0];
         String trapezoidbase2 = splitInput[1];
         String trapezoidheight = splitInput[2];
       
         double base1 = Double.parseDouble(trapezoidbase1);
         double base2 = Double.parseDouble(trapezoidbase2);
         double height = Double.parseDouble(trapezoidheight);
       
         Trapezoid t2 = new Trapezoid(base1, base2, height);
         double trapezoidarea = t2.computeArea();
         
         String[] splitInput2 = trapezoidPrompt5.split(" ");
         
         String trapezoidside1 = splitInput2[0];
         String trapezoidside2 = splitInput2[1];
         
         double side1 = Double.parseDouble(trapezoidside1);
         double side2 = Double.parseDouble(trapezoidside2);
         
         double trapezoidperimeter = base1 + base2 + side1 + side2;
         System.out.println("Your trapezoid's area is " + trapezoidarea + " and your trapezoid's perimeter is " + trapezoidperimeter + ".");
         
       }
       
      }
  }
  
}
  
