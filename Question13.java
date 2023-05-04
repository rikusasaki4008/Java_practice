import java.util.Scanner;

/**
 * Question13クラス
 * 
 * @author sasaki
 */
public class Question13 {
    /**
     * メインメソッド
     * 
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {

        // try-with-resouse文
        try (Scanner scanner = new Scanner(System.in)) {
            // 実行時メッセージ
            System.out.println("1：足し算結果⇒引き算結果の順で出力する");
            System.out.println("2：引き算結果⇒足し算結果の順で出力する");
            System.out.print("番号を選択してください（1,2）：");
            int value = Integer.parseInt(scanner.nextLine());
            if (!(value == 1 || value == 2)) {// 1又は2以外の値が入力された時の処理
                System.out.println("1～2の範囲で入力してください");
                return;
            }
            // 選択後メッセージ
            System.out.println("整数を入力してください");
            // 1個目の値を入力
            System.out.print("1個目：");
            int num1 = Integer.parseInt(scanner.nextLine());
            // 2個目の値を入力
            System.out.print("2個目：");
            int num2 = Integer.parseInt(scanner.nextLine());
            // CalculateSuperクラスをインスタンス化
            CalculateSuper calculateSuper = new CalculateSuper(num1, num2);
            // CalculateChildクラスをインスタンス化
            CalculateChild calculateChild = new CalculateChild(num1, num2);
            if (value == 1) {// 1が入力された時の処理
                calculateSuper.flow();
            } else {// 2が入力された時の処理
                calculateChild.flow();
            }
        } catch (NumberFormatException e) {// 整数以外の値が入力された時の例外処理
            System.out.println("整数以外の値が入力されました");
        }

    }
}
