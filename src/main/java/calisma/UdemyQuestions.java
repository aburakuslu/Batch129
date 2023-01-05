package calisma;

public class UdemyQuestions {

    public static void main(String[] args) {

        add(3.0,4.0); // Output A

        add(5, 6); // Output B

        add(7, 8.0); // Output C

        subtract(9, 10); //Output D
    }

    public static void add(double n1, double n2) {

        System.out.println(n1 + n2);

    }

    public static void add(int n1, int n2) {

        System.out.println(n1 + n2);

    }

    public static void subtract(int n1, int n2) {

        System.out.println(n1 - n2);

    }
}
