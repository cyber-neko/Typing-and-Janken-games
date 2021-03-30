package kadai03;

import java.util.Random;
import java.util.Scanner;

//課題2:タイピングゲーム
public class Typing {

    String display; //表示される文字
    String input; //入力される文字
    int word_count = 0; //入力文字のカウント
    long start_point = 0; //時間計測の開始時間
    long end_point = 0; //時間計測の終了時間
    static int success_count; //成功回数のカウント

    String[] words = {"あいうえお", "かきくけこ", "さしすせそ", "たちつてと", "なにぬねの"};

    Scanner sc = new Scanner(System.in);
    Random rm = new Random();

    //問題提示
    public String question() {

        int num = rm.nextInt(words.length);
        this.display = words[num];
        System.out.println(display);
        return this.display;
    }

    //入力の受け付け
    public String answer() {
        this.input = sc.nextLine();
        this.word_count += input.length();
        return this.input;
    }

    //入力のチェック
    public void judge() {

            if(input.equals(display)) {
                System.out.println("ok");
                success_count++;
            } else {
                System.out.println("no");
            }
    }

    //ゲームの実行
    public void play() {
        for (int i = 0; i < 50; i++) {
            question();
            if (i == 0) {
                start_point = System.currentTimeMillis();
            }
            answer();
            judge();
            if(Typing.success_count == 5) {
                end_point = System.currentTimeMillis();
                long time = (end_point - start_point) / 1000;
                System.out.println(time + "秒かかりました");
                System.out.println("入力された文字数は" + this.word_count + "です");
                System.out.println("1秒あたりの入力文字数は" + (Math.floor((this.word_count / (double)time) * 10) / 10) + "文字です");
                break;
            }
        }
    }


}
