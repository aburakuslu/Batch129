package studentpractice;

import java.util.Scanner;

public class Exercise {

    //ATM para cekme, yatirma ve tanimlanan bir IBAN'a para transfer etme
    public static void main(String[] args) {

        /*
            Iki tane isim olacak, "Tom Hanks" ve "Ali Can"
            Bakiye goruntulemek icin --1
            Para cekmek icin --2
            Farkli hesaba para yatirmak icin --3
         */
        Scanner input = new Scanner(System.in);
        String islemSecenekleri = "Bakiye goruntulemek icin --1" +
                "Para cekmek icin --2" +
                "Farkli hesaba para yatirmak icin --3";
        double tomBakiye = 2450;
        String tomIban = "TR: 1345 000 767 985 345 6972 76 45";
        String tomKullanici = "tom12";
        String tomSifre = "123";

        double aliBakiye = 1250;
        String aliIban = "TR: 1345 4356 656 985 987 6972 76 45";

        System.out.println("Hos geldiniz!");
        System.out.println("Lutfen bilgilerinizi giriniz");

        System.out.print("Kullanici adinizi giriniz");
        String kullaniciAdi = input.nextLine();

        System.out.print("Sifrenizi giriniz");
        String sifre = input.nextLine();

        if (kullaniciAdi.equals("tom12") && sifre.equals("123")) {
            System.out.println("Tom Hanks hesabina giris yapildi");
            System.out.println(islemSecenekleri);

            System.out.println("Lutfen bir secim yapiniz: ");
            String secim = input.nextLine();

            switch (secim) {
                case "1":
                    System.out.println("Bakiyeniz" + tomBakiye);
                    break;
                case "2":
                    System.out.println("Cekmek istediginiz tutari giriniz");
                    int cekilecekTutar = input.nextInt();
                    if (tomBakiye == cekilecekTutar) {
                        tomBakiye -= cekilecekTutar;
                        System.out.println("Kalan Tutar: " + tomBakiye);
                    } else {
                        System.out.println("Bakiyenizden fazla nakit cekemezsiniz");
                    }
                    break;
                case "3":
                    System.out.println("Ne kadar havale yapmak istiyorsunuz");
                    int yatirilacakTutar = input.nextInt();
                    if (yatirilacakTutar <= tomBakiye) {
                        System.out.println("IBAN giriniz");
                        input.nextLine();
                        String yatirilacakIban = input.nextLine();
                        if (yatirilacakIban.equals(aliIban)) {
                            System.out.println("Para Ali Can'a yatirildi.");
                            tomBakiye -= yatirilacakTutar;
                            aliBakiye += yatirilacakTutar;
                            System.out.println("Tom'un Hesabi: " + tomBakiye);
                            System.out.println("Ali'nin hesabi: " + aliBakiye);
                        }
                    } else {
                        System.out.println("Havale miktari hesaptaki paradan buyuk olamaz");
                    }
            }
        } else
            System.out.println("Kullanici adiniz hatali");
    }
}
