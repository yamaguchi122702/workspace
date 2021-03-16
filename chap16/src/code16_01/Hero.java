package code16_01;

public class Hero extends Character {
	int hp = 0;
  public void attack(Monster m) {
    System.out.println(this.name + "の攻撃！");
    System.out.println("敵に10ポイントのダメージをあたえた！");
    m.hp -= 10;
  }
}
