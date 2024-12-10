import java.util.Scanner;
import java.util.Random;
public class Game {

  public static void main (String[] args) {

    Adventurer p1 = new Wizard("Serena 1");
    Adventurer p2 = new CodeWarrior("Serena 2", 100);

    Scanner userInput = new Scanner(System.in);
    String move = "";

    while(p1.getHP() > 0 && p2.getHP() > 0) {

      //print names/HP/SpecialResource(quantity + name)
      System.out.println(p1.getName() + " has " + p1.getHP() + "/" + p1.getmaxHP() + " HP and " + p1.getSpecial() + "/" + p1.getSpecialMax() + " " + p1.getSpecialName() + ".");

      System.out.println(p2.getName() + " has " + p2.getHP() + "/" + p2.getmaxHP() + " HP and " + p2.getSpecial() + "/" + p2.getSpecialMax() + " " + p2.getSpecialName() + ".");

      //asks player for input
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");

      move = userInput.nextLine();

      if (move.equals("a") || move.equals("attack")) {
        System.out.println(p1.attack(p2));
        randomMove(p2, p1);
      }
      else if (move.equals("sp") || move.equals("special")) {
        System.out.println(p1.specialAttack(p2));
        randomMove(p2, p1);
      }
      else if (move.equals("su") || move.equals("support")) {
        System.out.println(p1.support());
        randomMove(p2, p1);
      }
      else if (move.equals("quit")) {
        break;
      }
      else {
        System.out.println("Invalid response, please type a new response.");
      }

      

    }
    if (!move.equals("quit")) {

      System.out.println("The battle has ended.");
      System.out.println(p1.getName() + " has " + p1.getHP() + "/" + p1.getmaxHP() + " HP and " + p1.getSpecial() + "/" + p1.getSpecialMax() + " " + p1.getSpecialName() + ".");
      System.out.println(p2.getName() + " has " + p2.getHP() + "/" + p2.getmaxHP() + " HP and " + p2.getSpecial() + "/" + p2.getSpecialMax() + " " + p2.getSpecialName() + ".");


    }
    

    

    
    

    

    


  }

  public static void randomMove(Adventurer player, Adventurer enemy) {
    //make computer choose random move
    if (player.getHP() > 0) {
      String[] moves = new String[]{"attack", "special", "support"};
      Random rand = new Random();
      int moveInt = rand.nextInt(3);
      String move1 = moves[moveInt];
      if (move1.equals("attack")) {
        System.out.println(player.attack(enemy));
      }
      else if (move1.equals("special")) {
        System.out.println(player.specialAttack(enemy));
      }
      else if (move1.equals("support")) {
        System.out.println(player.support());
      }
    }
    else {
      player.setHP(0);
    }
  }
}
