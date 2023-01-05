package calisma;

import java.util.Arrays;
import java.util.Scanner;

public class Codesdope05_Arrays01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 10 tane tam sayi giriniz: ");

        int arr[] = new int[10];
        int idx = 0;

        for(int w : arr){
            arr[idx] = scan.nextInt();
            idx++;
        }
        System.out.println("Girdiginiz rakamlar: " + Arrays.toString(arr));

        int brr[] = new int[arr.length];

        int j = 0;
        for(int i = brr.length-1;i>=0;i--){
            brr[i] = arr[j];
            j++;
        }
        System.out.println("Girdiginiz rakamlarin tersi: " + Arrays.toString(brr));
    }
}
