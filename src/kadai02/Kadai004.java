package kadai02;

public class Kadai004 {

    public static void main(String[] args) {
        String a = "□";
        String b = "■";

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if ((i == 2 || i == 8) && j >= 4 && j <= 6) {
                    System.out.print(b);
                } else if ((i == 3 || i == 7) && j >= 3 && j <= 7) {
                    System.out.print(b);
                } else if ((i == 4 || i == 6) && j >= 2 && j <= 8) {
                    System.out.print(b);
                }else if (i == 5 || j == 5){
                    System.out.print(b);
                } else {
                    System.out.print(a);
                }
            }
            System.out.println();
        }
    }

}
