import java.util.Scanner;

/**
 * Question7クラス
 * 
 * @author sasaki
 */
public class Question7 {
    /**
     * メインメソッド
     * 
     * @param コマンドライン引数
     */
    public static void main(String[] args) {
        // try-with-resoouse文
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("整数の数を入力してください");
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0) {
                System.out.println("整数の数は0より大きい数を入力してください");
                return;
            }
            int[] array = new int[num];

            // 配列に値を格納するループ
            for (int i = 0; i < num; i++) {
                System.out.print((i + 1) + "個目：");
                int value = Integer.parseInt(scanner.nextLine());
                array[i] = value;
            }
            // 入力された値を出力する
            System.out.print("入力された値は ");
            for (int i = 0; i < num; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("です");
            // 入力された値の平均値を出力する
            System.out.print("入力された整数の合計は ");
            int total = 0;
            for (int i = 0; i < num; i++) {
                total += array[i];
            }
            System.out.print(total / num);
            System.out.println(" です");
        } catch (NumberFormatException e) { // 整数以外の値が入力された時の例外処理
            System.out.println("整数以外の値が入力されました");
        }
    }
}
