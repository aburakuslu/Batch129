package day20passbyvaluemethodoverloading;

public class PassByValue01 {

    /*
        1) Java "pass-by-value" sayesinde variable'larin orijinal degerlerini koruma altina alir.
     */


    public static void main(String[] args) {

        double shirt = 100;

        double studentShirtPrice = discount("student", shirt);
        double veteranShirtPrice = discount("veteran", shirt);
        double seniorShirtPrice = discount("senior", shirt);




        System.out.println("shirt = " + shirt); //100.0
        System.out.println("studentShirtPrice = " + studentShirtPrice); // 90.0
        System.out.println("veteranShirtPrice = " + veteranShirtPrice); //80.0
        System.out.println("seniorShirtPrice = " + seniorShirtPrice); //95.0

        shirt = discount("veteran", shirt);
        System.out.println("shirt = " + shirt); //80

    }

    public static double discount(String state, double price){
        switch(state){
            case "student":
                price = price * 0.90;
                break;
            case "veteran":
                price = price * 0.80;
                break;
            case "senior":
                price = price * 0.95;
                break;
            default:
                price = price;
        }
        return price;
    }
}
