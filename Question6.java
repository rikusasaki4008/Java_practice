import java.util.Scanner;

/**
 * Question6クラス
 * 
 * @author sasaki
 */
public class Question6 {
    /**
     * メインメソッド
     * 
     * @param コマンドライン引数
     */
    public static void main(String[] args) {
        // 曜日の配列を作成、格納
        String[] weekday = { "日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日" };
        // 実行時にメッセージを出力
        System.out.println("本日の曜日番号を入力してください");
        // try-with-resouse文
        try (Scanner scanner = new Scanner(System.in)) {
            // キーボードから入力された文字を整数に変換
            int num = Integer.parseInt(scanner.next());
            switch (num) {//入力された整数をもとに曜日を出力
                case 0: //日曜日
                    System.out.println("本日は" + weekday[num] + "です");
                    break;
                case 1: //月曜日
                    System.out.println("本日は" + weekday[num] + "です");
                    break;
                case 2: //火曜日
                    System.out.println("本日は" + weekday[num] + "です");
                    break;
                case 3: //水曜日
                    System.out.println("本日は" + weekday[num] + "です");
                    break;
                case 4: //木曜日
                    System.out.println("本日は" + weekday[num] + "です");
                    break;
                case 5: //金曜日
                    System.out.println("本日は" + weekday[num] + "です");
                    break;
                case 6: //土曜日
                    System.out.println("本日は" + weekday[num] + "です");
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) { //範囲外の整数を入力した際の例外処理
            System.out.println("0～6の範囲で入力してください");
        } catch (NumberFormatException e) { //整数以外の値を入力した際の例外処理
            System.out.println("整数以外の値が入力されました");
        }
    }
}
