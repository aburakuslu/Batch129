package scanner4;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutgen ilk isminizi giriniz: ");
        String firstName = input.next();

        System.out.println("Lutfen orta adinizi giriniz: ");
        String middleName = input.next();

        System.out.println("Lutfen soyadinizi giriniz: ");
        String lastName = input.next();

        System.out.println("Lutfen SSN giriniz: ");
        int socialSecurityNumber = input.nextInt();

        System.out.println("Adi Soyadi: " + firstName + middleName+ lastName +"\nSSN: " + socialSecurityNumber);



    }

}
