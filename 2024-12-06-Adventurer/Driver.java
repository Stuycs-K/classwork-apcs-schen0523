public class Driver {

    public static void main(String[] args) {
        Adventurer p1 = new Wizard("Taylor");
        Adventurer p2 = new Wizard("Scooter", 200, 10);

        System.out.println(p1.getName() + " starts with " + p1.getHP() + " HP and " + p1.getSpecial() + " Mana.");
        System.out.println(p2.getName() + " starts with " + p2.getHP() + " HP and " + p1.getSpecial() + " Mana.");

        System.out.println("\nBattle Begins!");
        System.out.println(p1.attack(p2)); 
        System.out.println(p2.attack(p1)); 

        System.out.println("\nHealing Round!");
        System.out.println(p1.support()); 
        System.out.println(p2.support(p1)); 

        System.out.println("\nSpecial Attack!");
        System.out.println(p1.specialAttack(p2)); // Thor tries a special attack

        System.out.println("\nFinal Stats:");
        System.out.println(p1.getName() + " has " + p1.getHP() + " HP and " + p1.getSpecial() + " Mana.");
        System.out.println(p2.getName() + " has " + p2.getHP() + " HP and " + p2.getSpecial() + " Mana.");
    }


}