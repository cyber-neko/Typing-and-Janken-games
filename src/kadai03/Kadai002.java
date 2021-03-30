package kadai03;

public class Kadai002 {

    public static void main(String[] args) {
        System.out.println("タイピングゲームスタート");

        Typing t = new Typing();
        String que = t.question();
        System.out.println(que);
        String ans = t.answer();

        if(ans.equals(que)) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
    }
}

//課題2:タイピングゲーム
//用意しておいた言葉がランダムででてくる。
//5回クリアしたら終了
//何秒かかったか
//1秒あたりに何文字入力できたか