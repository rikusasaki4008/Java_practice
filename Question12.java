import java.util.Scanner;

/**
 * Question12クラス
 * 
 * @author sasaki
 */
public class Question12 {
    /**
     * メインメソッド
     * 
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        // Personクラスのインスタンス化
        Person person = new Person();
        // try-with-resouse文
        try (Scanner scanner = new Scanner(System.in, "Shift-JIS")) {
            // 実行時メッセージ
            System.out.println("1：氏名を入力する");
            System.out.println("2：氏名を入力する");
            System.out.print("番号を入力してください（1,2）:");
            // 値を入力
            int value = Integer.parseInt(scanner.nextLine());
            if (value == 1) {//1が選択された場合の処理
                System.out.println("氏名を入力してください");
                System.out.print("氏名：");
                person.setName(scanner.nextLine());
                System.out.print("私の名前は　" + person.getName() + "　です");
            } else if (value == 2) {//2が選択された場合の処理
                System.out.println("私の名前は　" + person.getName() + "　です");
            } else {//範囲外の値が入力された場合の処理
                System.out.println("1～2の範囲で入力してください");
            }
        } catch (NumberFormatException e) {// 整数以外の値が入力された時の例外処理
            System.out.println("整数以外の値が入力されました");
        }
    }
}