package kadai01;

public class Kadai002 {

    public static void main(String[] args) {

        //課題2-1
        int num = 2;

        if(num % 2 == 0) {
            System.out.println(num + "は偶数");
        } else {
            System.out.println(num + "は奇数");
        }

        //課題2-2
        if(num < 0) {

            if (num % 2 == 0) {
                System.out.println(num + "は負の偶数");
            } else {
                System.out.println(num + "は負の奇数");
            }

        } else {
            if(num % 2 == 0) {
                System.out.println(num + "は正の偶数");
            } else {
                System.out.println(num + "は正の奇数");
            }
        }

    }

}
