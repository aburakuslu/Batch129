package ssg_varargs;

public class Varargs01 {

    public static void main(String[] args) {

        //birden fazla sayiyi toplayan bir method olusturun

        add(3);
        add(3, 4);
        add(5, 6, 7);
        add(5, 6, 7, 8, 9, 10, 19);
    }


    public static void add(int... a) {

        int sum = 0;

        for (int w : a) {
            sum += w; //sum = sum + w;
        }
        System.out.println(sum);

    }
}
