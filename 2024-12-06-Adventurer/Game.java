import java.util.Scanner;
public class Game {

  public static void main (String[] args) {

    Adventurer p1 = new Wizard("Taylor");
    Adventurer p2 = new CodeWarrior("Scooter", 50);

    Scanner userInput = new Scanner(System.in);

    //print names/HP/SpecialResource(quantity + name)
    System.out.println("The player is " + p1.getName() + ".");
    System.out.println("They have " + p1.getHP() + "/" + p1.getmaxHP() + " HP and " + p1.getSpecial() + "/" + p1.getSpecialMax() + " " + p1.getSpecialName() + ".");

    System.out.println("The enemy is " + p2.getName() + ".");
    System.out.println("They have " + p2.getHP() + "/" + p2.getmaxHP() + " HP and " + p2.getSpecial() + "/" + p2.getSpecialMax() + " " + p2.getSpecialName() + ".");

    //asks player for input
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");

    String move = userInput.nextLine();
    if (move.equals("a") || move.equals("attack")) {
      p1.attack(p2);
    }




  }
}
