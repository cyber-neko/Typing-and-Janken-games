package kadai03;

import java.util.Random;
import java.util.Scanner;

//課題1:じゃんけんゲーム
public class Kadai001 {

    public static void main(String[] args) {

        //勝利数、負け数を数える
        int win_count = 0;
        int lose_count = 0;

        //おみくじからランダムな結果が出る
        String[] omikuji = {"大吉", "中吉", "吉", "凶"};
        Random random = new Random();
        int shufful = random.nextInt(4);
        String result = omikuji[shufful];

        //じゃんけん処理
        for (int j = 0; j < 100; j++) {
            System.out.print("じゃんけん(0:グー　1:チョキ　2:パー)：");

            //じゃんけん入力
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();

            //相手のハンドを取得
            Enemy cpu = new Enemy();
            int enemyHand = cpu.hand();

            //グーを出した場合
            if(i == 0) {
                System.out.println("グー");
                switch(enemyHand) {
                case 0:
                    System.out.println("あいこ");
                    break;
                case 1:
                    System.out.println("勝ち");
                    win_count += 1;
                    break;
                case 2:
                    System.out.println("負け");
                    lose_count += 1;
                    break;
                }
            }

            //チョキを出した場合
            if(i == 1) {
                System.out.println("チョキ");
                switch(enemyHand) {
                case 0:
                    System.out.println("負け");
                    lose_count += 1;
                    break;
                case 1:
                    System.out.println("あいこ");
                    break;
                case 2:
                    System.out.println("勝ち");
                    win_count += 1;
                    break;
                }
            }

            //パーを出した場合
            if(i == 2) {
                System.out.println("パー");
                switch(enemyHand) {
                case 0:
                    System.out.println("勝ち");
                    win_count += 1;
                    break;
                case 1:
                    System.out.println("負け");
                    lose_count += 1;
                    break;
                case 2:
                    System.out.println("あいこ");
                    break;
                }
            }

                //3回買った場合
                if (win_count == 3) {
                    System.out.println("おみくじチャンス");
                    System.out.println("結果は" + result + "でした");
                    break;
                }

                //3回負けた場合
                if (lose_count == 3) {
                    System.out.println("3回負けたので終了します。");
                    break;
                }

        }

    }

}
