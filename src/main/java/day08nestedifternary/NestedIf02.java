package day08nestedifternary;

import java.util.Scanner;

public class NestedIf02 {

    public static void main(String[] args) {

        //Kullanicidan bir ucgenin kenar uzunlugunu aliniz
        //Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
        //Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
        //Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 3 tane kenar uzunlugu giriniz:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        boolean ucgenmi = (a+b>c && c>Math.abs(a-b)) && (a+c>b && b>(a-c)) && (b+c>a && a>Math.abs(b-c));

        if(a<=0 || b<=0 || c<=0){
            System.out.println("Gecerli kenar uzunlugu giriniz.");
        }else if(ucgenmi){

            if(a==b && b==c && a==c){
                System.out.println("Eskenar");
            }else if (a==b || b==c || a==c){
                System.out.println("Ikizkenar");
            }else{
                System.out.println("Cesitkenar");
            }

        }else{
            System.out.println("Ucgen degil.");
        }




    }
}
