package code11_17;

public abstract class Character2 implements Creature {
  String name;
  int hp;
  public void run() {
    System.out.println(this.name + "は逃げ出した");
  }
  public abstract void attack(Matango m);
}