package demo_JAVA;

public class seven_methodRandom {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//　【課題3】
		int count = 10000;
		int deme_num[] = new int[6];
			for(int i = 1; i <= 6; ++i) deme_num[i-1] = 0;
		for(int i = 1; i<= count ; ++i) {
			int deme = (int)(Math.random() * 6.0)+1;
			++deme_num[deme-1];
		}
		for(int i= 1; i<= 6; ++i) {
			System.out.println("出目" + i + ":" + deme_num[i - 1] + "回" + 
								"確率：" + (double)deme_num[i-1]/(double)count * 100.0 + "%");
		}		
	}

}
