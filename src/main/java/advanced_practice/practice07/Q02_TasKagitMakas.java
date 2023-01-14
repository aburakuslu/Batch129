package advanced_practice.practice07;

import java.util.Scanner;

public class Q02_TasKagitMakas {

    public static void main(String[] args) {
/*
        Taş-Kağıt-Makas oyunu yazınız.
        -Oyuncudan tahmin alınız.
        -Bilgisayarın tahmini ile karşılaştırınız.
                -3'e ilk ulaşan kazanır
                -3 farkla kazanan Altın Skor, 2 farkla kazanan Gümüş Skor,
                1 farkla kazanan Bronz Skor ile kazanır.
 */

        Scanner input = new Scanner(System.in);
        int oyuncununKazanmaSayisi = 0;
        int bilgisayarinKazanmaSayisi = 0;
        int sayac = 0;

        while (oyuncununKazanmaSayisi < 3 && bilgisayarinKazanmaSayisi < 3) {
            sayac++;
            System.out.println(sayac + ". secimi giriniz: \nTas \nKagit \nMakas");
            String oyuncuTahmini = input.next().toLowerCase().trim();

            if (!(oyuncuTahmini.equals("tas") || oyuncuTahmini.equals("makas") || oyuncuTahmini.equals("kagit"))) {
                System.out.println("Gecerli bir tahmin giriniz");
                sayac--;
                continue;
            }

            //Bilgisayarin tahmini
            String arrtasKagitMakas[] = {"tas", "kagit", "makas"};
            int randomIdx = (int) (Math.random() * 3); //0,1,2
            String bilgisayarTahmini = arrtasKagitMakas[randomIdx];
            System.out.println("bilgisayarTahmini = " + bilgisayarTahmini);

            if (oyuncuTahmini.equals(bilgisayarTahmini)) {
                System.out.println("\nBerabere! Skor: " + oyuncununKazanmaSayisi + " - " + bilgisayarinKazanmaSayisi);
            } else if (oyuncuTahmini.equals("tas") && bilgisayarTahmini.equals("makas") ||
                    oyuncuTahmini.equals("kagit") && bilgisayarTahmini.equals("tas") ||
                    oyuncuTahmini.equals("makas") && bilgisayarTahmini.equals("kagit")) {
                oyuncununKazanmaSayisi++;
                System.out.println("\nKazandiniz! Skor: " + oyuncununKazanmaSayisi + " - " + bilgisayarinKazanmaSayisi);
            } else {
                bilgisayarinKazanmaSayisi++;
                System.out.println("\nBilgisayar kazandi! Skor: " + oyuncununKazanmaSayisi + " - " + bilgisayarinKazanmaSayisi);
            }
        }
        System.out.println("===Oyun Bitti===");
        String skor;

        if (oyuncununKazanmaSayisi == 3) {
            if (bilgisayarinKazanmaSayisi == 0) {
                skor = "Altin";
            }else if (bilgisayarinKazanmaSayisi == 1){
                skor = "Gumus";
            }else{
                skor = "Bronz";
            }
            System.out.println(skor + " skorla kazandiniz! TEBRIKLER!!!");
        } else {
            if (bilgisayarinKazanmaSayisi == 0) {
                skor = "Altin";
            }else if (bilgisayarinKazanmaSayisi == 1){
                skor = "Gumus";
            }else{
                skor = "Bronz";
            }
            System.out.println("Bilgisayar " + skor + " skorla kazandi!");
        }
    }
}

