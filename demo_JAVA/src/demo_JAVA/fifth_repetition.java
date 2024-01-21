package demo_JAVA;

public class fifth_repetition {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int sum =0;
		for(int i=1; i <=10;i++)
			sum +=i;
		System.out.println(sum);
		
		for ( int i = 1; i <= 9; i ++ ) {
			for ( int j = 1; j <= 9; j ++ ) {
				System.out.print( " " + i * j );
			}
			System.out.println();
		}	
		
//		ピラミッド１
		int i, j, row=5;
		for(i=0; i<row; i++){
			for (j=2*(row-i); j>=0; j--) { 
//				System.out.prin();
			}
			for(j=0; j<=i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
			}
		
//		ピラミッド2
		int ii, jj, rowt=5;
		for(ii=0; ii<row; ii++){
			for (jj=0;jj<5-(ii+1); jj++) { 
				System.out.print(" ");
			}
			for(jj=0; jj<(ii+1)*2-1; jj++ ) {
				System.out.print("*");
			}
			System.out.println();
			}

		}
	}


