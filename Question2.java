import java.util.Scanner;
import java.util.InputMismatchException;

public class Question2 {

    public static void main(String[] args) {

        // スキャナークラスをインスタンス化
		Scanner scanner = new Scanner(System.in);

        System.out.println("整数を入力してください");

        try {
            // コンソールに入力された数字を受け取るnextメソッド
            int num = scanner.nextInt();


            // 受け取った数字が偶数の場合の処理
            if(num % 2 == 0){
                System.out.println("入力された" + num + "は偶数です");
            
            // 受け取った数字が奇数の場合の処理
            } else if(num % 2 == 1) {
                System.out.println("入力された" + num + "は奇数です");
            } 
        
        // 受け取った値が数字以外だった時の例外処理
        } catch (InputMismatchException e) {
            System.out.println("整数以外の値が入力されました");
        }

        scanner.close();
    }
    
}