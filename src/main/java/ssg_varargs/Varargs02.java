package ssg_varargs;

public class Varargs02 {

    public static void main(String[] args) {
        ogrenciBilgileri("Murat", "Biyik", "AA", 23);
        ogrenciBilgileriniYazdir(23, "Bilal", "Guney", "BB");
    }

    public static void ogrenciBilgileriniYazdir(int yas, String... str) {
        for(String w : str) {
            System.out.print(w + " ");
        }
        System.out.println("ogrencinin yasi: " + yas);
    }

    public static void ogrenciBilgileri(String isim, String soyIsim, String sinif, int yas) {
        System.out.println(isim + " " + soyIsim + " " + sinif + " " + yas);
    }
}
