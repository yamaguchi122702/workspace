

public class SuperHero extends Hero {
  String name = "アサカ";
  boolean flying;
  public void setName(String name) {
	  this.name = name;
  }
  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }
  public void oldRun() {
	  super.run();
  }
  public void run() {
    System.out.println(this.name + "は撤退した");
  }
}
