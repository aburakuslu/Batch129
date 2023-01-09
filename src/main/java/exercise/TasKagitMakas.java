package exercise;

import java.util.Scanner;

public class TasKagitMakas {

    /* TASK:
            tas >makas
            makas >kagit
            kagit >tas
        Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
        Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
        While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
        Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
        Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
        Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
        En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
        dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int kullanici_puan = 0;
        int bilgisayar_puan = 0;
        System.out.println("Tas-Kagit-Makas oyununa hos geldiniz :) ");
        System.out.println("1)Tas 2)Kagit 3)Makas");
        System.out.println("Oyunu bitirmek icin 0'a basiniz.");

        while (true) {
            System.out.println("Seciminiz: ");
            int secim = scan.nextInt();
            int bilgisayar_secim = (int) (Math.random() * 3);

            if (secim == 0) {
                break;
            } else if (secim == 1) {
                if (bilgisayar_secim == 1) {
                    System.out.println("Bilgisayarin secimi: Tas ==> Sonuc: Berabere.");
                    System.out.println("Puaniniz: " + kullanici_puan + " Bilgisayarin puani:" + bilgisayar_puan);
                } else if (bilgisayar_secim == 2) {
                    System.out.println("Bilgisayarin secimi: Kagit ==> Sonuc: Kaybettiniz!");
                    bilgisayar_puan++;
                    System.out.println("Puaniniz: " + kullanici_puan + " Bilgisayarin puani:" + bilgisayar_puan);
                } else {
                    System.out.println("Bilgisayarin secimi: Makas ==> Sonuc: Kazandiniz!");
                    kullanici_puan++;
                    System.out.println("Puaniniz: " + kullanici_puan + " Bilgisayarin puani:" + bilgisayar_puan);
                }
            } else if (secim == 2) {
                if (bilgisayar_secim == 1) {
                    System.out.println("Bilgisayarin secimi: Tas ==> Sonuc: Kazandiniz!");
                    kullanici_puan++;
                    System.out.println("Puaniniz: " + kullanici_puan + " Bilgisayarin puani:" + bilgisayar_puan);
                } else if (bilgisayar_secim == 2) {
                    System.out.println("Bilgisayarın secimi: Kagit ==> Sonuç: Berabere");
                    System.out.println("Puanınız: " + kullanici_puan + " Bilgisayarın puanı:" + bilgisayar_puan);
                } else {
                    System.out.println("Bilgisayarin seçimi: Makas ==> Sonuç: Kaybettiniz!");
                    bilgisayar_puan++;
                    System.out.println("Puaniniz: " + kullanici_puan + " Bilgisayarin puani:" + bilgisayar_puan);
                }
            } else if (secim == 3) {
                if (bilgisayar_secim == 1) {
                    System.out.println("Bilgisayarin secimi: Tas ==> Sonuc: Kaybettiniz!");
                    bilgisayar_puan++;
                    System.out.println("Puaniniz: " + kullanici_puan + " Bilgisayarin puani:" + bilgisayar_puan);
                } else if (bilgisayar_secim == 2) {
                    System.out.println("Bilgisayarin secimi: Kagit ==> Sonuç: Kazandiniz");
                    kullanici_puan++;
                    System.out.println("Puanınız: " + kullanici_puan + " Bilgisayarın puanı:" + bilgisayar_puan);
                } else
                    System.out.println("Bilgisayarın seçimi: Makas ==> Sonuç: Berabere");
                System.out.println("Puanınız: " + kullanici_puan + " Bilgisayarın puanı:" + bilgisayar_puan);
            } else {
                System.out.println("Hatali giris! Lutfen tekrar deneyin." + "\n1)Tas 2)Kagit 3)Makas");
                continue;
            }
            if (kullanici_puan == 3) {
                System.out.println("Oyunu " + kullanici_puan + "-" + bilgisayar_puan + " kazandiniz");
                break;
            } else if (bilgisayar_puan == 3) {
                System.out.println("Oyunu " + bilgisayar_puan + "-" + kullanici_puan + " kaybettiniz");
                break;
            }
            System.out.println("Devam etmek icin lutfen seciminizi yapiniz." + "\n1)Tas 2)Kagit 3)Makas");
        }

    }
}
