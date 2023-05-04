import java.util.Scanner;

/**
 * Question10
 * @author sasaki
 */
public class Question10 {
    /**
     * メインメソッド
     * @param args コマンドライン引数
     */
    public static void main(String[]args){ 
        //try-with-resouse文
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("整数を入力してください");
            int value = Integer.parseInt(scanner.nextLine());
            // 入力された整数を2倍にする
            printCalculateDouble(value);
            // 入力された整数を2乗する
            printCalculateSquare(value);
        } catch(NumberFormatException e){// 整数以外の値が入力された時の例外処理
            System.out.println("整数以外の値が入力されました");
        }
    }
    /**
     * printCalculateDoublメソッド
     * @param num キーボードから入力された整数
     */
    private static void printCalculateDouble(int num){
        System.out.println("入力された " + num + " を2倍した値は " + num * 2 + " です");
    }
    /**
     * printCalculateSquareメソッド
     * @param num キーボードから入力された整数
     */
    private static void printCalculateSquare(int num){
        System.out.println("入力された " + num + " を2乗した値は " + num * num + " です");
    }
}
