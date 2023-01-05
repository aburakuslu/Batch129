package practice.nighttime.nighttime02;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        /*
            Techpro spor salonu icin isim, soyisim, yas,
            kilo ve boy salona devam edecegi ay suresi bilgilerini alip aylik
            $20 olarak toplam ucreti yazdiriniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Techpro Spor Salonuna hosgeldiniz :)");

        System.out.println("Lutfen adinizi ve soyadinizi giriniz: ");
        String fullName = input.nextLine();

        System.out.println("Lutfen yasinizi giriniz: ");
        byte age = input.nextByte();

        System.out.println("Lutfen kilonuzu giriniz: ");
        double weight = input.nextDouble();

        System.out.println("Lutfen boyunuzu giriniz: ");
        double height = input.nextDouble();

        int monthlyFee = 20;
        System.out.println("Aylik ucret: " + monthlyFee + "$");

        System.out.println("Lutfen uyelik suresini giriniz: ");
        int month = input.nextInt();

        int total_price = monthlyFee * month;
        System.out.println("total_price +\"$\" = " + total_price);

        System.out.println("Ad Soyad: " + fullName +"\nYasiniz: " + age + "\nKilonuz: "+ weight + "\nBoyunuz: " +
                height + "\nOdemeniz gereken tutar: " + total_price + "$");





    }
}
