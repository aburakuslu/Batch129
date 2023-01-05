package scanner4;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int num = input.nextInt();

        if(num%2==0){
            System.out.println("Cift");
        }else if(num%2!=0){
            System.out.println("Tek");
        }else
            System.out.println("Tanimli degil");
    }
}
