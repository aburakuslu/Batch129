package day13whiledowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {

    public static void main(String[] args) {

        /*
               Gecerli Username="admin" Password="pwd123" tur.
               Kullanicidan username ve password'u alin.
               username ve password dogru ise console'a "Hesabiniza hos geldiniz" desin.
               username ve password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
               Usename ve password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.
         */

        Scanner input = new Scanner(System.in);


        int counter = 0;

        do {
            if (counter == 4) {
                System.out.println("Hesabiniz bloke olmustur!");
                break;
            }
            System.out.println("Username'i giriniz: ");
            String username = input.next();

            System.out.println("password'u giriniz: ");
            String password = input.next();

            if (username.equals("admin") && password.equals("pwd123")) {
                System.out.println("Hesabiniza hos geldiniz!");
                break;
            }
            counter++;

        } while (true);

    }
}
