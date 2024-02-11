package demo_JAVA;
import java.util.Scanner;
public class Calculator_review_operatorCheck {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		// TODO 自動生成されたメソッド・スタブ
        do {
            // 最初の数字の入力
            System.out.print("最初の数字を入力してください: ");
            int num1 = scanner.nextInt();

            // 演算子の入力
            System.out.print("四則演算を入力してください (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // 次の数字の入力
            System.out.print("次の数字を入力してください: ");
            int num2 = scanner.nextInt();

            int result = 0;
            switch(operator) {
                // 各演算子に応じた計算
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("0で割ることはできません。");
                        continue; // ゼロで割る場合はループを継続
                    }
                    break;
                default:
                    System.out.println("無効な演算子です。");
                    continue; // 無効な演算子の場合はループを継続
            }
            // 結果の表示
            System.out.println("結果: " + result);
            
            // 続行するかどうかを尋ねる
            System.out.print("続行しますか？ (続行: 1, 終了: 0): ");
        } while (scanner.nextInt() != 0); // 0を入力するまで続行

        scanner.close(); // スキャナーを閉じる
        System.out.println("プログラムを終了します。");
    }
}