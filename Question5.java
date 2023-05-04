import java.util.Scanner;

/**
 * Question5クラス
 * 
 * @auther sasaki
 */
public class Question5 {
        /**
     * メインメソッド
     * 
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        // 実行時メッセージ出力
        System.out.println("整数100を入力された値で割り算します");
        System.out.println("割り算する整数を入力してください");
        // try-with-resouse文
        try (Scanner scanner = new Scanner(System.in)) {
            // キーボードから入力された文字を整数に変換
            int num = Integer.parseInt(scanner.nextLine());
            // 演算結果を出力
            System.out.println("割り算結果は" + 100 / num + "です");
        } catch (NumberFormatException e) { //整数以外の値が入力された時の例外処理
            System.out.println("整数以外の値が入力されました");
        } catch (ArithmeticException e) { //0が入力された時の例外処理
            System.out.println("0では割り算できません");
        } finally { //結果を出力後に必ず「終了」と記述する
            System.out.println("終了");
        }
    }
}
