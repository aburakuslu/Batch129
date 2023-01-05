package day08nestedifternary;

import java.util.Scanner;

public class NestedIfTernaryPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); System.out.println("Ürün miktarını sayı olarak giriniz");
        int miktar = scan.nextInt();
        System.out.println("Ürün birim fiyatını giriniz");
        double fiyat = scan.nextDouble();
        double result = miktar>1000 ? fiyat*0.9*miktar : fiyat*miktar; System.out.println(result);


    }
}
