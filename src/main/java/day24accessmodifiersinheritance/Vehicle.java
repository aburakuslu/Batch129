package day24accessmodifiersinheritance;

public class Vehicle {
    /*
        1)Child Class'tan bir object olusturdugumuzda Constructor'lar en ustteki parent class'tan baslatilarak
        alta dogru calistirilir.
     */

    public Vehicle() {
        System.out.println("Vehicle 1");
    }
}
