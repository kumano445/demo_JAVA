package demo_JAVA;
import java.util.Random; // ランダムな数を生成するためのRandomクラスをインポート
import java.util.Scanner; // ユーザーからの入力を受け取るためのScannerクラスをインポート
public class seven_methodRandom {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//　【課題3】
        Scanner scanner = new Scanner(System.in); // ユーザーからの入力を受け取るScannerオブジェクトを作成
        
        System.out.println("サイコロの目を選んでください (1-6):"); // ユーザーに予想を入力するように促す
        int userGuess = scanner.nextInt(); // ユーザーの予想を読み取る
        
        int diceRoll = rollDice(); // サイコロを振って結果を保存する
        System.out.println("サイコロの結果は " + diceRoll + " でした。"); // 結果を表示する
        
        // ユーザーの予想と実際のサイコロの目を比較し、結果を表示する
        if (userGuess == diceRoll) {
            System.out.println("当たりです！"); // 正しい予想をした場合のメッセージ
        } else {
            System.out.println("ハズレです！"); // 予想が外れた場合のメッセージ
        }
    }
    
    // サイコロを振って結果を返すメソッド
    public static int rollDice() {
        Random random = new Random(); // Randomオブジェクトを生成
        return random.nextInt(6) + 1; // 1から6までのランダムな数値を生成して返す
    }
}