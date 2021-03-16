package quizans03_03;

public class Main2 {
  public static void main(String[] args) {
    int isHungry = 1;
    String food = "おにぎり";
    System.out.println("こんにちは");
    //まとめた場合
      if (isHungry== 0) {
        System.out.println("お腹がいっぱいです");
      } else {
        System.out.println("はらぺこです");
        System.out.println(food + "をいただきます");
      }

      //switch文の場合
      switch(isHungry) {
        case 0:
          System.out.println("お腹がいっぱいです");
    	  break;
        default:
          System.out.println("はらぺこです");
          System.out.println(food + "をいただきます");
    	  break;
      }

      //三項条件演算子
      System.out.println(
    		  isHungry == 0 ? "お腹がいっぱいです":"はらぺこです");
      if (isHungry == 1) {
        System.out.println(food + "をいただきます");
      }

      //三項条件演算子(1行にまとめた版)
      System.out.println(
    		  isHungry == 0 ? "お腹がいっぱいです":
    			  "はらぺこです\n"+ food + "をいただきます");

      System.out.println("ごちそうさまでした");

      //三項条件演算子は別にprintln専用ではない
      boolean x = isHungry == 0 ? false: true;

  }
}
