package ssg10_varargs;

public class Varargs02 {

    public static void main(String[] args) {

        int sayi1 = 5;
        int sayi2 = 7;
        int sayi3 = 2;
        int sayi4 = 4;
        int sayi5 = 9;

        sonuc(sayi1, sayi2, sayi3, sayi4, sayi5);
    }

    private static void sonuc(int sayi1, int ...sonuc) {
        int sum = 0;
        for(int w : sonuc){
            sum = sum + w;
        }
        System.out.println(sum * sayi1);
    }
}
