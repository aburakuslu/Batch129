package day12forloopwhileloop;

public class ForLoop05 {

    public static void main(String[] args) {

        //Example 1: Hic sayi kullanmadan 1'den 100'e kadar olan sayilari console'a yazdiriniz.

        // 'd' ASCII degeri = 100

        for (int i = 'd' / 'd'; i <= 'd'; i++) {
            System.out.println(i + " ");
        }

        //Note 1: Bazi loop'lar hic calismayabilir.

//        for(int i = 1; i <0; i--){
//            System.out.println("Hi"); //Zero execution
//        }

        //Note 2: Bazi loop'lar sonsuz defa calisabilir.
        //        Bu tarz loop'lara Infinite(sonsuz) loop denir.
        //        "Infinite(sonsuz) Loop" genellikle "increment/decrement" kisminda yapilan hatadan kaynaklanir.
//        for(int i = 1; i < 10; i--){
//            System.out.println("Java is money");
//        }

        //Note 3: Baska bir "Infinite(sonsuz) Loop"
        //        Loop olusturdugunuzda "ikinci kismi" yazmazsaniz, "Infinite(sonsuz) Loop" olur.

//        for(int i = 1;    ;     ){
//            System.out.println("Hi!");
//        }
    }
}
