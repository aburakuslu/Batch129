package calisma;

import java.util.Scanner;

public class Codesdope02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length and breadth for the rectangle : ");

        int x = input.nextInt();
        int y = input.nextInt();

        System.out.println("The area: " + x * y);


        System.out.println("Please enter your name : ");
        String name = input.nextLine();
        System.out.println("Please enter roll number : ");
        int rollNumber = input.nextInt();
        System.out.println("Enter your field of interests : ");
        input.next();
        String fieldOfInterests = input.nextLine();

        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber +
                ". My field of interests are " + fieldOfInterests);

        System.out.println("Please enter a side : ");
        int side = input.nextInt();
        int area = side * 2;
        int perimeter = side * 4;

        System.out.println("The area is " + area + "\nThe perimeter is: " + perimeter);
    }
}
