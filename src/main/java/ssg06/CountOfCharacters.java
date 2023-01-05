package ssg06;

import java.util.Arrays;
import java.util.Scanner;

public class CountOfCharacters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string giriniz..."); //alaca karanlik
        String str = scan.nextLine();

        String arr[] = str.split(""); //her bir karakteri ayirir.

        System.out.println(Arrays.toString(arr)); //[a, l, a, c, a,  , k, a, r, a, n, l, i, k]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[ , a, a, a, a, a, c, i, k, k, l, l, n, r]


        int counter = 0;

        for(int i = 1; i <arr.length; i++){
            if(arr[i-1].equals(arr[i])){
                counter++;
            }else
                System.out.println(arr[i-1] + " sayisi" + (counter + 1));
                counter = 0;

            if(i==arr.length-1){ //en sona geldiginde
                System.out.println(arr[i-1] + " sayisi" + (counter +1));
            }
        }

    }
}
