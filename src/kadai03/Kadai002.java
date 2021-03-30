package kadai03;

public class Kadai002 {

  //課題2:タイピングゲーム
  //用意しておいた言葉がランダムででてくる。
  //5回クリアしたら終了
  //何秒かかったか
  //1秒あたりに何文字入力できたか
    public static void main(String[] args) {

        Typing t = new Typing();

        System.out.println("タイピングゲームスタート！５回正確に入力したら終了！");
        t.play();
    }
}
