package ssg_varargs;

public class NoVarargs01 {

    // Iki sayiyi toplayan bir method olusturunuz

    public static void main(String[] args) {

        ucSayiyiToplayanMethod(4, 7, 8);
        ikiSayiyiToplayanMethod(5, 7);
        display();


    }

    public static void ikiSayiyiToplayanMethod(int a, int b) { // 2 parametreli
        System.out.println(a + b);
    }

    public static void ucSayiyiToplayanMethod(int a, int b, int c) { // 3 parametreli
        System.out.println(a + b + c);
    }

    public static void display() { // zero parametreli

    }
}
