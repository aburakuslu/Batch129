package day08nestedifternary;

import java.util.Scanner;

public class NestedIf03 {

    public static void main(String[] args) {
        /*
        Password'un ilk harfi buyuk harf ise
        'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin
        Alemci ==> Gecerli

        Passwordun ilk harfi kucuk harf ise
        'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin
        zehirli ==> Gecerli
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String pwd = input.nextLine();

        char firstChar = pwd.charAt(0);

        if(firstChar>= 'A' && firstChar<= 'Z'){
            if(firstChar=='A'){
                System.out.println("Valid password");
            }else{
                System.out.println("Invalid password: It must start with A.");
            }
        }else if(firstChar>='a' && firstChar<='z'){

            if(firstChar=='z'){
                System.out.println("Valid password.");
            }else{
                System.out.println("Invalid Password: It must start with lowercase z.");
            }
        }else{
            System.out.println("First character must be a letter.");
        }




    }
}
