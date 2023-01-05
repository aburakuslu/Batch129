package ssg_whileloop;

import java.util.Random;
import java.util.Scanner;

public class SayiBulmaca {

    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Random rnd = new Random();
        int sayi = rnd.nextInt(100);
        Scanner input = new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int tahmin = 0;
        int counter = 0;

        while (sayi!=tahmin){
            tahmin = input.nextInt();

            if(tahmin>sayi){
                System.out.println("Daha kucuk bir sayi giriniz: ");
            }else if(tahmin<sayi){
                System.out.println("Daha buyuk bir sayi giriniz");
            }
            counter++;
        }
        System.out.println("Tebrikler! Sayiyi " + counter + " tahminde buldunuz.");
    }
}
