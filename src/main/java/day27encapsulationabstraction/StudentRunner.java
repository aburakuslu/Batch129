package day27encapsulationabstraction;

public class StudentRunner {

    public static void main(String[] args) {

        Student myStd = new Student();

        //Encapsulation faydalarindan biri de tek bir obje olusturup set methodu ile istedigimiz objeye cevirebiliriz

        //Student 1
        System.out.println("myStd.getStdId() = " + myStd.getStdId());
        System.out.println("myStd.getGpa() = " + myStd.getGpa());
        System.out.println("myStd.isPoor() = " + myStd.isPoor());

        //Student 2
        myStd.setStdId("TH123");
        myStd.setGpa(4.0);
        myStd.setPoor(false);
    }
}
