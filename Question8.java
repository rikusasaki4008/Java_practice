import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Question8クラス
 * 
 * @author sasaki
 */
public class Question8 {
    /**
     * メインメソッド
     * 
     * @param コマンドライン引数
     */
    public static void main(String[] args) {
        // try-with-resoouse文
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("整数の数を入力してください");
            int inputNum = Integer.parseInt(scanner.nextLine());
            if (inputNum <= 0) {
                System.out.println("整数の数は0より大きい数を入力してください");
                return;
            }
            List<Integer> list = new ArrayList<>();
            System.out.println("整数の各値を入力してください");
            // 配列に値を格納するループ
            for (int i = 0; i < inputNum; i++) {
                System.out.print((i + 1) + "個目:");
                int value = Integer.parseInt(scanner.nextLine());
                list.add(value);
            }
            // 入力された値を出力する&入力された値の合計を作成
            System.out.print("入力された値は ");
            int total = 0;
            for (int num : list) {
                System.out.print(num + " ");
                total += num;
            }
            System.out.println("です");
            // 入力された値の平均値を出力する
            System.out.print("入力された整数の平均は ");
            System.out.print(total / list.size());
            System.out.println(" です");
        } catch (NumberFormatException e) { // 整数以外の値が入力された時の例外処理
            System.out.println("整数以外の値が入力されました");
        }

    }

}
