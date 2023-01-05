package day03scanner;

import java.util.Scanner;

public class ScannerPractice02 {

    public static void main(String[] args) {

       /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
       */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen mesafeyi km cinsinden giriniz: ");

        double distance = input.nextDouble();

        System.out.println("Lutfen hizi km/h olcusunde giriniz");

        double maxSpeed = input.nextDouble();

        double estTimeArrival = distance / maxSpeed;

        System.out.println("Yolculuk suresi: " + estTimeArrival + " saattir.");



    }
}
