package calisma;

import java.util.Arrays;
import java.util.Scanner;

public class Codesdope05_Arrays02 {

    public static void main(String[] args) {

        // Kullanicin girdigi 5 elemanli bir array'deki en kucuk ve en buyuk elemani bulunuz ve toplamini
        // yazdiran kodu olusturunuz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 tane sayi giriniz");

        int idx = 0;
        int arr[] = new int[5];
        for (int w: arr) {
            arr[idx] = scan.nextInt();
            idx++;
        }
        System.out.println("Girilen Rakamlar: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Girilen rakamlardan en kucugu : " + arr[0] + "\nEn buyugu: " + arr[arr.length-1] +
                "\nIki rakamin toplami: " + arr[0] + " + " + arr[arr.length-1] + " = " +
                (arr[0] + arr[arr.length-1]));
    }
}
