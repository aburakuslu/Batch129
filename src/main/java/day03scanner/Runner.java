package day03scanner;

import ssg06.MethodsPractice;

public class Runner {

    public static void main(String[] args) {

        //Object nasil olusturulur?
        //Class Ismi   Object Ismi  Atama Operatoru    "new" keyword     Constructor
             Car          myCar            =                new              Car();
        System.out.println(myCar.fiyat); //20000
        System.out.println(myCar.model); //Corolla
        myCar.hareket(); //Corolla hizli hareket eder.
        myCar.dur(); //Corolla guvenli bir sekilde durur


        Student tomHanks = new Student();
        System.out.println(tomHanks.name); //Tom Hanks
        System.out.println(tomHanks.grade); //8
        System.out.println(tomHanks.address); //Miami

        tomHanks.study(); //Gunu gunune ders calisir...

        tomHanks.feed(); //Saglikli beslenir...

    }
}
