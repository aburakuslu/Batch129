package scanner4;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //  uzunluk, genişlik, yükseklik olan dikdörtgenler prizmasının hacmini hesaplayan bir program yazıniz
        // İpucu: dikdörtgenin hacmi= width*height*length;

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen prizmanin uzunluk, genislik, yukseklik degerlerini giriniz: ");
        int length = input.nextInt();
        int width = input.nextInt();
        int height = input.nextInt();

        System.out.println("Dikdorgen hacmi: " + (width*height*length));
        System.out.println("Dikdortgen Hacmi " + rectangleVolume(width,length,height));

    }

    public static int rectangleVolume(int width, int height, int length){
        return width * height * length;
    }




}
