import java.util.Scanner;

/**
 * Question4クラス
 * 
 * @auther sasaki
 */
public class Question4 {
    /**
     * メインメソッド
     * 
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        // try-with-resoouse文
        try (Scanner scanner = new Scanner(System.in)) {
            // 実行時メッセージ出力
            System.out.println("２つの同じ文字列を入力してください");
            // 1個目の文字入力
            System.out.print("1個目:");
            String str1 = scanner.nextLine();
            // 2個目の文字入力
            System.out.print("2個目:");
            String str2 = scanner.nextLine();
            // ループ開始
            while (str1.isBlank() || str2.isBlank() || str2.equals(str1) == false) {
                if (str1.isBlank() || str2.isBlank()) { // 文字列が空白である時の処理
                    System.out.println("空白が入力されています");
                    System.out.print("1個目:");
                    str1 = scanner.nextLine();
                    System.out.print("2個目:");
                    str2 = scanner.nextLine();
                } else if (str2.equals(str1) == false) { // 異なる文字列が入力されているときの処理
                    System.out.println("違う文字列です");
                    System.out.print("1個目:");
                    str1 = scanner.nextLine();
                    System.out.print("2個目:");
                    str2 = scanner.nextLine();
                } else { // 同じ文字列が入力されたらループを抜ける
                    break;
                }
            }
            // 同じ文字列が出力された時のメッセージ
            System.out.println("同じ文字列です");
        }
    }
}
