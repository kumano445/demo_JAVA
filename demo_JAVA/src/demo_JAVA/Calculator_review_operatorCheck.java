package demo_JAVA;

public class Calculator_review_operatorCheck {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		   int val1 = 0;
		    int val2 = 0;
		    String ope;  
		    int kekka;   

		    if (args.length != 3){
		      errDisp("引数は3個入力して下さい");
		    }

		    try{
		      val1 = Integer.parseInt(args[0]);
		      val2 = Integer.parseInt(args[2]);
		    }catch(NumberFormatException e){
		      errDisp("数値でない値が入力されています");
		    }

		    ope = args[1];

		    String opeStr[] = {"×", "/", "+", "-"};
		    boolean errFlag = true;

		    for (int i = 0 ; i < 4 ; i++){
		      if (ope.equals(opeStr[i])){
		        errFlag = false;
		      }
		    }

		    if (errFlag == true){
		      errDisp("演算子は × waru tasu hiku の4つです");
		    }

		    if (ope.equals("×")){
		      kekka = val1 * val2;
		    }else if(ope.equals("+")){
		      kekka = val1 + val2;
		    }else if (ope.equals("-")){
		      kekka = val1 - val2;
		    }else{
		      if (val2 == 0){
		        errDisp("0 で割ろうとしました");
		      }

		      kekka = val1 / val2;
		    }

		    System.out.println("入力された式は " + val1 + " " + ope + " " + val2 + " です");
		    System.out.println("計算結果は " + kekka + " です");
		  }

		  private static void errDisp(String errStr){
		    System.out.println("Usage : java dentaku 数値 演算子 数値");
		    System.out.println(errStr);
		    System.exit(0);  /* プログラムを終了する */
		  }
		}
