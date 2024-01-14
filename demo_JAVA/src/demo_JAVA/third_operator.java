package demo_JAVA;

public class third_operator {

	public static void main(String[] args) {
		// 課題１
		int a = 10;
		int b = 20;
		System.out.println(a + "と" + b);
		
		int sumResult = a + b;
		System.out.println(sumResult);
		
		int differenceResult  = a - b;
		System.out.println(differenceResult);
		
		int productResult = a * b;
		System.out.println(productResult);
		
		int quotientResult = a / b;
		System.out.println(quotientResult);
		
		int remainderResult = a % b;
		System.out.println(remainderResult);
		
		//課題２
		int x = 23;
		int y = 50;
		System.out.println(x + "と" + y);
		
		boolean isEqual;
		isEqual = (x == y);
		System.out.println(isEqual);
		
		boolean isGreater;
		isGreater = ( x > y);
		System.out.println(isGreater);
		
		boolean isLess;
		isLess = ( x < y );
		System.out.println(isLess);
		
	}

}
