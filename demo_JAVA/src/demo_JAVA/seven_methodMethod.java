package demo_JAVA;

import java.util.Arrays;

public class seven_methodMethod {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		【課題4】
//		文字列を引数として受け取り、その文字列を逆順にして表示するメソッドの作成
		StringBuilder sb = new StringBuilder();

		sb.append("ABCDEFG");
		System.out.println(sb.toString()); 

		sb.reverse();
		System.out.println(sb.toString()); 
	
	//3つの整数を引数として受け取り、それらの整数の平均を返すメソッドを作成
	 int[] nums = {2, 7, 1};
     
     double average = Arrays.stream(nums).average().getAsDouble();
     
     System.out.println(average);
	}
}
