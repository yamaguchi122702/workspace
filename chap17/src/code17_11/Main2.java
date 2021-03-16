package code17_11;

public class Main2 {
  public static void main(String[] args){
	boolean check = false;
    Person p = new Person();
    do {
    	check = false;
    	try {
    		System.out.println("年齢を入力してください。(0以上)");
    		int i = new java.util.Scanner(System.in).nextInt();
    		p.setAge(i);
    	}catch (Exception e) {
    		System.out.println(e.getMessage());
        	check = true;
    	}
    }while(check);
    System.out.println("年齢"+p.age+"で登録されました。");
  }
}
