package kadai01;

public class Kadai003 {

    public static void main(String[] args) {
        double weight = 50.5; //単位kg
        double height = 1.7; //単位メートル

        double bmi = weight / height / height;

        System.out.println("BMIは" + (Math.floor(bmi * 10)) / 10 + "です");

        if (bmi >= 25.0) {
            System.out.println("肥満です");
        } else if (bmi >= 18.5) {
            System.out.println("標準です");
        } else {
            System.out.println("痩せ型です");
        }
    }

}
