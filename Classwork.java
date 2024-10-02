import java.util.Scanner;

public class Classwork
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);  // a brand new scanner reading the keyboard
    
    //System.out.println("Hello, little child, what is your name?");
    //String name;
    //name = sc.nextLine();
    //System.out.println("Hello, " + name + ", how are you");

    //if you nextInt() or nextDouble before a nextLine(), you will need an extra NextLine(); 
  
    System.out.println("What type of item are you buying?");
    String item;
    item = sc.nextLine();


    System.out.println("How many are you buying?");
    int amount;
    amount = sc.nextInt();

    System.out.println("How much does each one weigh?");
    double weight;
    weight = sc.nextDouble();

    System.out.println( amount + " " + item + " at " + weight + " pounds each with weigh " + (weight*amount) + " each");

    System.out.println("\"That Brain of mine is something more than merely mortal; as time will show.\"\nAda Lovelace\nThe first computer programmer");

    System.out.print("(\\(\\\n( - -) \n(') (')");

  }
}
