package day13whiledowhileloop;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //1) while-loop
        int i = 1;

        while (i < 1) {
            System.out.println("Sen bir while-loop'sun...");   //1. while body hic calismadi.
            i++;                                               //2. while-loop'da Zero execution mumkundur.
        }

        //2) do-while-loop
        int k = 1;

        do {
            System.out.println("Sen bir do-while-loopsun..."); // Sen bir do-while-loopsun...
            k++;                                               // 1) do-while body calisti. 2)do-while kullandiginizda loop body calisir.
                                                               // do-while'da zero execution mumkun degildir.
        } while (k < 1);


    }
}
