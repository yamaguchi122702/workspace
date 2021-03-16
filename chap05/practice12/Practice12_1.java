package practice12;

public class Practice12_1 {

	/**
	 * @param args
	 */
	//メインメソッド
	public static void main(String[] args) {
		int[] uriage = {360000,240000,455000,298000};
		double[] kinmu = {62.3,70.5,66.0,58.8};
		double seisan;
		String hantei;
		for (int i=0;i<uriage.length;i++){
			seisan = seisan(uriage[i],kinmu[i]);
			hantei = hantei(seisan);
			System.out.println("売上="+uriage[i]+", 生産性="+seisan+", 判定="+hantei);

//			短縮して書くと
//			System.out.println("売上="+uriage[i]+", 生産性="+seisan(uriage[i],kinmu[i])+", 判定="+hantei(seisan));
		}
	}

	//生産性の計算
	public static double seisan(int uriage,double kinmu){
		return uriage/ kinmu;
	}

	//生産性の判定
	public static String hantei(double sei){
		if(sei>=3000 && sei<6000){
			return "OK";
		}else{
			return "BAD";
		}
	}

}
