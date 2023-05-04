import java.util.Scanner;
import java.util.InputMismatchException;

public class Question3 {
    public static void main(String[] args) {

                // スキャナークラスをインスタンス化
		Scanner scanner = new Scanner(System.in);

        System.out.println("整数を入力してください");

        try {
            // コンソールに入力された数字を受け取るnextメソッド
            int num = scanner.nextInt();

    // ++++++++++++++++++++++++++++++++++++++++++++++
        for(int i = 1; i <= num; i++){

        // ******************************************
      
          for(int j = 1; j <= num; j++){
            if (j == i){System.out.print("*");
        } else { System.out.print("・");                
            }
        }
        // ******************************************
            System.out.println();
        }
    // ++++++++++++++++++++++++++++++++++++++++++++++
            // 受け取った値が数字以外だった時の例外処理
        } catch (InputMismatchException e) {
            System.out.println("整数以外の値が入力されました");
        }
        scanner.close();
    }
}
