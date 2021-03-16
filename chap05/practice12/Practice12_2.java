package practice12;

public class Practice12_2 {

	/**
	 * @param args
	 */
	//メインメソッド
	public static void main(String[] args) {
		System.out.println("***　BMIを計算　***");
		double val = getBmi(1.75,70.0);				//BMIを計算
		System.out.print("BMIは"+Math.round(val)+"です\n");
		val =getBmi(1.75);							//適正体重を計算
		System.out.print("適正体重は"+Math.round(val)+"です\n");
		System.out.println("*** END ***");
	}

	//BMIの計算
	public static double getBmi(double height, double weight){
		return weight /Math.pow(height, 2);
	}

	//適正体重の計算
	public static double getBmi(double height){
		return Math.pow(height,2)*22;
	}
}
