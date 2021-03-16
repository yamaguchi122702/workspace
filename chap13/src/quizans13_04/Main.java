package quizans13_04;

public class Main {
  public static void main(String[] args) {
	  Wizard wz = new Wizard();
	  Wand wnd = new Wand();
	  Hero h = new Hero();
	  h.setName("ミナト");
	  wnd.setName("いかずちの杖");
	  wnd.setPower(50);
//	  wz.setName("菅原");
	  wz.setName("スガワラ");
	  wz.setWand(wnd);
	  wz.heal(h);

  }
}

