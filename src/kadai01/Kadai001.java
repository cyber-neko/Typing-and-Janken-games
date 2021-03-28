package kadai01;

public class Kadai001 {

    public static void main(String[] args) {
        int KokugoScore = 40;
        int MathScore = 100;

        int sum = KokugoScore + MathScore;

        if(!(KokugoScore <= 40 || MathScore <= 40)) {
            if(sum >= 160) {
                System.out.println("優");
            } else if (sum >= 140) {
                System.out.println("良");
            } else if (sum >= 100) {
                System.out.println("可");
            } else {
                System.out.println("追試");
            }
        } else {
            System.out.println("追試");
        }
    }

}
