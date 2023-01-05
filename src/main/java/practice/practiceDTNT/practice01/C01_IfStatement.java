package practice.practiceDTNT.practice01;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        /*
            Kullanicidan bir gun alin,
            Eger gun cuma ise, "Muslumanlar icin kutsal gun" ;
            Eger gun cumartesi ise " Iseviler icin kutsal gun";
            Eger gun pazar ise "Hristiyanlar icin kutsal gun" yazdiran gunu olusturunuz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz: ");
        String day = input.next().toLowerCase(); //kucuk harfe cevirme

        if(day.equals("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }else if(day.equals("cumartesi")){
            System.out.println("Museviler icin kutsal gun");
        }else if(day.equals("pazar")){
            System.out.println("Hristiyanlar icin kutsal gun");
        }else
            System.out.println("Kutsal gun degil");


    }
}
