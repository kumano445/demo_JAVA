package demo_JAVA;

public class six_array {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		課題１
//		10個の整数を要素とする新しい1次元配列を宣言して初期化し、任意の値を代入する。
		int[] evenNumber = new int[10];
			evenNumber[0] = 10;
			evenNumber[1] = 12;
			evenNumber[2] = 14;
			evenNumber[3] = 16;
			evenNumber[4] = 18;
			evenNumber[5] = 20;
			evenNumber[6] = 22;
			evenNumber[7] = 24;
			evenNumber[8] = 26;
			evenNumber[9] = 28;
		System.out.println(evenNumber[5]);
//		配列の要素を for ループを使用して順番に表示するプログラム
		int[] array = {11,12,13,14,15};
			for(int order: array) {
				System.out.println(order);
			}
//		配列の要素を合計してその結果を表示するプログラム
			int[] arraySecond = {55,60,70,82};
			int sum = 0;
			for(int i = 0; i < arraySecond.length ; i++) {
				sum += arraySecond[i];
			}
			System.out.println(sum);
			
//			配列の要素を for ループを使用して表示し、その中で偶数の場合は「偶数」と、奇数の場合は「奇数」と表示するプログラム
			int[] numbers = {5, 8, -1, 2};
			for(int i = 0; i < numbers.length; i++){
				if(numbers[i]% 2 == 0) {
					System.err.println(numbers[i] + "偶数");
				}else {
					System.out.println(numbers[i] + "奇数");
				}
			}
//			配列の要素の合計が特定の閾値を超える場合に「閾値を超えました」と表示するプログラム
			int[] threshold = {60,50,40,30};
				int sumT = 0;
					for(int t = 0; t<threshold.length; t++) {
						sumT += threshold[t];
						
						if(sumT<100) {
							System.out.println("閾値を超えました");
						}
					}
//			【課題2】
			int kuku[][] = new int[9][9];
			for(int k=0; k<9 ; k++) {
				for(int j=0;j<9;j++) {
					kuku[k][j] = (k+1)*(j+1);
				}
			}
			for(int k=0 ; k<9; k++) {
				for(int j=0;j<9;j++) {
					System.out.print(kuku[k][j]+" ");
				}
				System.out.println();
			}
			
	}

}
