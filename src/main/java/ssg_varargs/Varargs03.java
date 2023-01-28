package ssg_varargs;

public class Varargs03 {

    public static void main(String[] args) {

        // Kac tane ill ismi verilirse verilsin
        // iclerinden en Uzun olani yazdiran bir method olusturun
        String il1 = "Adana";//5
        String il2 = "ankara";//6
        String il3 = "Istanbul";
        String il4 = "Bursa";
        String il5 = "Van";

        enUzunillIsmi(il1, il2, il3, il4, il5);
        enUzunillIsmi("van", "sanliurfa", "inegol", "karadeniz", "eskisehir");

        System.out.println(iller(il1, il2, il3, il4, il5));
    }

    public static void enUzunillIsmi(String... str) {

        String enUzunIlIsim = "";//0

        for (String w : str) {
            if (w.length() > enUzunIlIsim.length()) {
                enUzunIlIsim = w;
            }
        }
        System.out.println("enUzunIsimi : " + enUzunIlIsim);
    }

    // 2 . yol
    public static String iller(String... sehirler) {
        String sehirismi = "";
        for (String city : sehirler) {
            if (city.length() > sehirismi.length()) {
                sehirismi = city;
            }
        }
        return sehirismi; // istanbul
    }
}
