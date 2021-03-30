package kadai03;

import java.util.Random;

//課題1:じゃんけんゲーム
public class Enemy {

    Random ran = new Random();

    //相手のハンド
    public int hand() {
        int result = ran.nextInt(3);
        switch (result) {
        case 0:
            System.out.println("相手はグーを出した");
            break;
        case 1:
            System.out.println("相手はチョキを出した");
            break;
        case 2:
            System.out.println("相手はパーを出した");
            break;
        }
        return result;
    }
}
