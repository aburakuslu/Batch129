package practice.practiceDTNT.practice01;

import java.util.Scanner;

public class C02_IfStatement {

    public static void main(String[] args) {

        /*
         Kullanicidan alacaginiz 2 sayiyi, yine kullaniciya
         sectireceginiz dort islemden biri ile isleme koyup yaptiriniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen\n Toplama yapmak icin 1,\n Cikarma icin 2,\n " +
                "Carpma icin 3,\n Bolme yapmak icin 4 giriniz:");
        int islem = input.nextInt();
        System.out.println("Lutfen iki tamsayi giriniz:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        if(islem==1){
            System.out.println("Toplama isleminin sonucu: " + num1 + "+" + num2 + "="+ (num1 + num2));
        }else if(islem==2){
            System.out.println("Cikarma isleminin sonucu: " + num1 + "-" + num2 + "="+ (num1 - num2));
        }else if(islem==3){
            System.out.println("Carpma isleminin sonucu: " + num1 + "x" + num2 + "="+ (num1 * num2));
        }else if(islem==4){
            System.out.println("Bolme isleminin sonucu: " + num1 + "/" + num2 + "="+ (num1 / num2));
        }else
            System.out.println("Hatali secim! Lutfen tekrar deneyiniz.");
    }
}
