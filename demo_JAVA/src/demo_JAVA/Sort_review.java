package demo_JAVA;
import java.util.Scanner;
public class Sort_review {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("数字の配列を入力");
		int size = scanner.nextInt();
		int[] array = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.println("数字を入力");
			array[i] = scanner.nextInt();
		}
		System.out.println("どちらかを選択");
		System.out.println("1. 昇順");
		System.out.println("2. 降順");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			int[] sortedArray = ascendingSort(array);
            System.out.println("昇順ソート結果:");
            printArray(sortedArray);
        } else if (choice == 2) {
            int[] sortedArray = descendingSort(array);
            System.out.println("降順ソート結果:");
            printArray(sortedArray);
        } else {
            System.out.println("無効な選択です。");
        }
		scanner.close();
    }

		
	// 昇順ソートメソッド
	public static int[] ascendingSort(int[] array) {
	    for (int i = 0; i < array.length - 1; i++) {
	        for (int j = 0; j < array.length - 1 - i; j++) {
	            if (array[j] > array[j + 1]) {
	                int temp = array[j];
	                array[j] = array[j + 1];
	                array[j + 1] = temp;
	            }
	        }
	    }
	    return array;
	}


	// 降順ソートメソッド
	public static int[] descendingSort(int[] array) {
	    for (int i = 0; i < array.length - 1; i++) {
	        for (int j = 0; j < array.length - 1 - i; j++) {
	            if (array[j] < array[j + 1]) {
	                int temp = array[j];
	                array[j] = array[j + 1];
	                array[j + 1] = temp;
	            }
	        }
	    }
	    return array;
	}

    // 配列の要素を出力するメソッド
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}