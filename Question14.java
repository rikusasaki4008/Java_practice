import java.util.Scanner;

/*
 * Question14クラス
 * @author sasaki
 */
public class Question14 {
    /**
     * 
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        // Calculate14クラスをインスタンス化
        Calculate14 calculate = new Calculate14();
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
            System.out.println(num1 + " と " + num2 + "の掛け算結果の値は " + calculate.multiplication(num1, num2) + " です");
            // 掛算のメソッドを呼び出し
            System.out.println(num1 + " と " + num2 + "の掛け算結果を2で割った値は " + calculate.division(num1, num2) + " です");
        } catch (NumberFormatException e) {// 整数以外の値が入力された時の例外処理
            System.out.println("整数以外の値が入力されました");
        }
    }
}
