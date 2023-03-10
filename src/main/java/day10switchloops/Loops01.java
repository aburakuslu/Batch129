package day10switchloops;

public class Loops01 {

    /*
        Code Standards:
        1) Tekrar(repetition) olmamalidir.
        2) Dynamic olmalidir.
        3) Tamir(fix) ve update kolay yapilabilmelidir.

     */

    public static void main(String[] args) {

        //Example 1: Ekrana 5 kere "hi" yazdiriniz
        //1. Yol: (Tavsiye edilmez)
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");


        //2. Yol:
        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop"lar kullanilir.
        //Dort tane loop var: 1)for-loop 2)while-loop 3)do-while-loop 4)for-each-loop


        //1)for-loop
        // Baslangic degeri      Loop'un calisma sarti        Increment/Decrement
        for(int i=1           ;          i<6              ;          i++         ){
            System.out.println("Hi");
        }


        //Example 2: 11'den 44'e kadar tum tamsayilari ekrana yazdiran kodu yaziniz.
        for(int i =11; i<15; i++){

            System.out.println(i);

        }

        //Example 3: 40'tan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz.

        for (int i=40; i>22; i--){

            if(i%2==0) {
                System.out.println(i);
            }
        }

        //Example 4 : 18'den 56'ya kadar tum tamsayilari ekrana yazdiran kodu yaziniz.

        for(int i=18; i<57; i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }



    }
}
