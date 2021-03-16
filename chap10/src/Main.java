

public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    h.run();
    SuperHero sh = new SuperHero();
    sh.run();
    sh.oldRun();
    sh.setName("スガワラ");
    sh.run();
    sh.oldRun();
    System.out.println(sh.getName());
  }
}
