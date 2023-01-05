package ssg10_varargs;

public class Varargs01 {

    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 4;
        int n3 = 9;
        int n4 = 8;
        int n5 = 10;

        nums(n1, n2, n3, n4, n5);

        String str1 = "Safran";
        String str2 = "bolu";
        String str3 = "evleri";
        String str4 = "cok";
        String str5 = "guzel";

        sehir(str1, str2, str3, str4, str5);

    }

    private static void sehir(String ... str) {
        String sum = "";
        for(String w : str){
            sum = sum + w;
        }
        System.out.println(sum);
    }

    private static void nums(int... newNums) {
        int sum = 0;
        for (int w : newNums) {
            sum = sum + w;
        }
        System.out.println("Toplam = " + sum);
    }





}
