package kadai03;

import java.util.Random;
import java.util.Scanner;

public class Typing {

    String q;
    String ans;

    String[] words = {"あいうえお", "かきくけこ", "さしすせそ", "たちつてと", "なにぬねの"};

    Scanner sc = new Scanner(System.in);
    Random rm = new Random();

    public String question() {

        int num = rm.nextInt(words.length);
        this.q = words[num];
        return this.q;
    }

    public String answer() {
        this.ans = sc.nextLine();
        return this.ans;
    }


}
