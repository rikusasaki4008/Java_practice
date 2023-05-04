import java.util.Scanner;

/**
 * Question9クラス
 * 
 * @author sasaki
 */

public class Question9 {
    /**
     * メインメソッド
     * 
     * @param コマンドライン引数
     */
    public static void main(String[] args) {
        int[] array = new int[5];
        // try-with-resoouse文
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("5つの整数を入力してください");
            // 配列に値を格納するループ
            for (int i = 0; i < array.length; i++) {
                System.out.print((i + 1) + "個目：");
                int value = Integer.parseInt(scanner.nextLine());
                array[i] = value;
            }
            // 昇順にソートするムーブ
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            //昇順ソート模範解答
            // for (int i = 0; i < array.length - 1; i++) {
            //     for (int j = array.length - 1; j > i; j--) {
            //         if (array[j - 1] > array[j]) {
            //             int tmp = array[j - 1];
            //             array[j - 1] = array[j];
            //             array[j] = tmp;
            //         }
            //      }
            // }
            // 昇順結果を出力
            System.out.print("昇順ソート結果は ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println("です");
            // 配列の中の最大値を出力する
            System.out.println("最大値は " + array[array.length - 1] + " です");
            // 配列の中の最小値を出力する
            System.out.println("最小値は " + array[0] + " です");
        } catch (NumberFormatException e) { // 整数以外の値が入力された時の例外処理
            System.out.println("整数以外の値が入力されました");
        }
    }

}
