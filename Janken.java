import java.util.Random;
import java.util.Scanner;

public class Janken {
    public static void main(String[] args) {
        String[] choices = {"グー", "チョキ", "パー"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("じゃんけんゲームへようこそ！");
        System.out.println("0: グー, 1: チョキ, 2: パー");
        System.out.print("あなたの手を選んでください: ");

        if (scanner.hasNextInt()) {
            int player = scanner.nextInt();
            if (player < 0 || player > 2) {
                System.out.println("0, 1, 2のどれかを入力してください。");
                return;
            }

            int computer = random.nextInt(3);
            System.out.println("あなた: " + choices[player]);
            System.out.println("コンピュータ: " + choices[computer]);

            if (player == computer) {
                System.out.println("あいこです！");
            } else if ((player == 0 && computer == 1) ||
                       (player == 1 && computer == 2) ||
                       (player == 2 && computer == 0)) {
                System.out.println("あなたの勝ちです！");
            } else {
                System.out.println("あなたの負けです。");
            }
        } else {
            System.out.println("数値を入力してください。");
        }

        scanner.close();
    }
}
