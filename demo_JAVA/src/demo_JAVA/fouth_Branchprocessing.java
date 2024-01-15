package demo_JAVA;

public class fouth_Branchprocessing {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		課題１
		int score;
		score = 10;
		
		if(score >= 80) {
			System.out.println("合格");
		}else{
			System.out.println("不合格");
		}
		
//		課題２
	    int dayOfWeek = 7;
	    String dayName;
	    
	    switch (dayOfWeek) {
	    	case 1:
	    		dayName = "月曜日";
	    		break;
	    	case 2:
    			dayName = "火曜日";
    			break;
	    	case 3:
				dayName = "水曜日";
				break;
	    	case 4:
				dayName = "木曜日";
				break;
	    	case 5:
				dayName = "金曜日";
				break;
	    	case 6:
				dayName = "土曜日";
				break;
	    	case 7:
				dayName = "日曜日";
				break;
			default:
				dayName = "不明な曜日";
	    }
	    System.out.println("本日は" + dayName);

//		課題３
	    int num1;
	    num1 = 5;
	    int num2;
	    num2 = 2;
	    String result = num1 > num2 ? "num1が大きい":"num2が大きい";
	    System.out.println(result);
	}

}
