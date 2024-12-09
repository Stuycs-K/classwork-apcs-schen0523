import java.util.Random;
public class Wizard extends Adventurer {

    private int mana;
    private int maxMana;

  public Wizard(String name){
    super(name, 100);
    this.mana = 20;
    this.maxMana = 50;
  }

  public Wizard(String name, int hp, int maxMana){
    super(name, hp);
    this.mana = 20;
    this.maxMana = maxMana;

  }


  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */

  public String getSpecialName() {
    return "Mana";
  }

  //accessor methods
  public int getSpecial() {
    return mana;
  }

  public void setSpecial(int n) {
    mana = Math.min(n, maxMana);
  }
  public int getSpecialMax() {
    return maxMana;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other) {
    Random rand = new Random();
    int damage = (rand.nextInt(5) + 1)* 2;
    other.applyDamage(damage);
    return this.getName() + " did " + damage + " damage to "+ other.getName();
  }

  //heal or buff the target adventurer
  public String support(Adventurer other) {
    if(other.getHP() + 10 > other.getmaxHP()) {
        other.setHP(other.getmaxHP());
    }
    else {
        other.setHP(other.getHP() + 10);
    }
    return this.getName() + " healed " + other.getName() + " for 10 HP.";
  }

  //heal or buff self
  public String support() {
    if(getHP() + 10 > getmaxHP()) {
        setHP(getmaxHP());
    }
    else {
        setHP(getHP() + 10);
    }
    return getName() + " healed themselves for 10 HP.";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other) {
    if (mana < 10) {
        return this.getName() + " didn't have enough rage.";
    }
    other.applyDamage(20);
    this.setSpecial(this.getSpecial() - 10);
    return this.getName() + " did 20 damage to " + other.getName() + " by using their special attack.";
  }


}
