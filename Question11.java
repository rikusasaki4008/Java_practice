import java.util.Scanner;

/*
 * Question11クラス
 * @author sasaki
 */
public class Question11 {
    /**
     * 
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        // try-with-resouce文
        try (Scanner scanner = new Scanner(System.in)) {
            // 実行時メッセージ
            System.out.println("整数を入力してください");
            // 1個目の値を入力
            System.out.print("1個目：");
            // 2個目の値を入力
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("2個目：");
            int num2 = Integer.parseInt(scanner.nextLine());
            // 掛算のメソッドを呼び出し
            System.out.println(num1 + " と " + num2 + "の掛け算結果の値は " + multiplication(num1, num2) + " です");
            // 掛算のメソッドを呼び出し
            System.out.println(num1 + " と " + num2 + "の掛け算結果を2で割った値は " + division(num1, num2) + " です");
        } catch (NumberFormatException e) {// 整数以外の値が入力された時の例外処理
            System.out.println("整数以外の値が入力されました");
        }
    }

    /**
     * 
     * @param multiNum1 掛けられる数
     * @param multiNum2 掛ける数
     */
    private static int multiplication(int multiNum1, int multiNum2) {
        int multiResult = multiNum1 * multiNum2;
        return multiResult;
    }

    /**
     * 
     * @param divNum1 掛けられる数
     * @param divNum2 掛ける数
     */
    private static int division(int divNum1, int divNum2) {
        int divResult = divNum1 * divNum2 / 2;
        return divResult;
    }
}
