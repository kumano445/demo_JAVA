package demo_JAVA;

public class seven_methodMath {
//	【課題２】
//	2つの整数をユーザーに入力させ、それらの整数の最大公約数（GCD）を求めるプログラムの作成
   	static int gcd(int a, int b) {
   		if((0 >= a)&&(0 >= b))return 0;
   		if(a == b)return a;
   		int min = Math.min(a, b);
   		int ans = 1;
   		
   		for(int i = min;i >= 2; i--) {
   			if(0 == (a % i)) {
   				if(0==(b % i)) {
   					ans = i;
   					break;
   				}
   			}
   		}
   		return ans;
   	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a,b;
		a = 8;
		b = 12;
		System.out.println(a + "と" + b + "の最大公約数は、" + gcd(a,b));
		
		
		//ユーザーに入力させた浮動小数点数の平方根を求めるプログラムの作成
        double number = 1.2345;;
        double squareRoot = Math.sqrt(number);
        System.out.println("平方根の計算結果は " + squareRoot + " です。");
    }

}


