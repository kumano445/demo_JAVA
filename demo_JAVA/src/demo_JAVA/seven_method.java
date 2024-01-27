package demo_JAVA;

import java.util.Scanner;

public class seven_method {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		【課題1】
//		ユーザーに2つの整数を入力させ、これらの整数の和を計算するプログラムの作成
		Scanner scanner = new Scanner(System.in);
				 int num1 = scanner.nextInt();
				 int num2 = scanner.nextInt();
				 int sum = num1 + num2;
				 				 
			 System.out.println(num1 + "+" + num2 + "=" + sum);
			 
		 
//	円の半径をユーザーに入力させ、円の面積を計算するプログラムの作成
			 double r;
			 double area;
			 
			 Scanner scan = new Scanner(System.in);
			 
			 System.out.print("半径:");
			 r = scanner.nextDouble();
			 
			 area = r * r * Math.PI;
			 
			 System.out.println("円の面積："+ area);
			 
		
	}

}
