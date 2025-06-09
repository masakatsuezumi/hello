import java.util.Scanner;
import java.util.Random;

public class kazuate {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int answer = rand.nextInt(100) + 1; // 1〜100 のランダムな数
        int guess = 0;
        int attempts = 0;

        System.out.println("数当てゲームへようこそ！");
        System.out.println("1から100までの数を当ててください。");

        while (guess != answer) {
            System.out.print("あなたの予想: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < answer) {
                System.out.println("もっと大きい数です。");
            } else if (guess > answer) {
                System.out.println("もっと小さい数です。");
            } else {
                System.out.println("正解です！ " + attempts + " 回で当てました！");
            }
        }

        scanner.close();
    }
}
