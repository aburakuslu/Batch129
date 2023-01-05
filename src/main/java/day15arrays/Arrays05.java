package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {

    public static void main(String[] args) {

        //Example 1: String Array elemanlarini, karakter sayisina gore kucukten buyuge gore siralayiniz.
        //           ["Michael" ,"Ajda", "Thomas", "Tom"] ==> ["Tom", "Ajda", "Thomas", "Michael"]


        String arr[] = {"Michael" ,"Ajda", "Thomas", "Tom"};
        System.out.println(Arrays.toString(arr)); //[Michael, Ajda, Thomas, Tom]

        Arrays.sort(arr, Comparator.comparingInt(String::length));  // :: ==> Method Reference
        System.out.println(Arrays.toString(arr)); //[Tom, Ajda, Thomas, Michael]


        //Example 2: String Array elemanlarini, karakter sayisina gore buyukten kucuge gore siralayiniz.
        //           ["Michael" ,"Ajda", "Thomas", "Tom"] ==> ["Michael", "Thomas", "Cuneyt", "Ajda", "Tom"]

        String brr[] = {"Michael" ,"Ajda", "Thomas", "Tom", "Cuneyt"};
        System.out.println(Arrays.toString(brr)); //[Michael, Ajda, Thomas, Tom, Cuneyt]

        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr)); //[Michael, Thomas, Cuneyt, Ajda, Tom]



        //Example 2: String Array elemanlarini, karakter sayisina gore buyukten kucuge gore siralayiniz.
        //           Ayni character sayisinda olanlari da alfabetik siraya koyunuz.
        //           ["Michael", "Ajda", "Reyhane", "Gabriel", "Thomas", "Tom", "Ali", "Cin", "Cuneyt", "Cem"]
        //           ["Gabriel", "Michael", "Reyhane", "Thomas", "Cuneyt", "Ajda", "Ali", "Cem", "Cin"}

        String crr[] = {"Michael", "Ajda", "Reyhane", "Gabriel", "Tom", "Ali", "Cin","Cuneyt", "Cem"};
        System.out.println(Arrays.toString(crr)); //[Michael, Ajda, Reyhane, Gabriel, Tom, Ali, Cin, Cuneyt, Cem]

        Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        // Bu tarzin diger adina Functional Programming ya da Lambda denir.
        System.out.println(Arrays.toString(crr)); //[Gabriel, Michael, Reyhane, Cuneyt, Ajda, Ali, Cem, Cin, Tom]

        //fonctional Prpgraming==> java'nin olusturdugu methodlari kullanmak, saglam yol.
        //fonctional programing==lampda
        //reversed==> buyukten kucuge diz
        //thencomparing==> iceri gir iceriyi de duzenle
        //Comparator.naturelorder==> iceride dogal siralama yap; yani alfebetik siralama yap
        // hem buyukler hemde kucukler icin ayri ayri siralama yapti
        }
    }

