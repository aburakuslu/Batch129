package day03scanner;

import java.util.Scanner;

public class Scanner01 {

    //Kullanicidan data alip kodlarimizda kullanacagiz.
    Scanner s = new Scanner(System.in); //system.in sistemin icine koy demek.

    //object'in ismi "input" yapildi cunku bu object kullanicidan alinan data'yi halihazirda olan
    //kodlarin icine koyacak.

    public static void main(String[] args) {

        //1, adim: Scanner Class'dan obejct olustur.
        Scanner input = new Scanner(System.in);

        //2. adim: Kullaniciya ve istediginize dair mesaj veriniz
        System.out.println("lutfen yasinizi giriniz...");

        //3, adim: Uygun method'u kullanarak kullanicinin verdigi data'yi memory'e yerlestiriniz.
        byte age = input.nextByte();

        System.out.println(age);



    }


}
