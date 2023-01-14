package day25inheritance;

public class Honda extends Car {
    /*
    super(); ne ise yarar ?
    Note: "super ();" parent'teki constructor'i calistirmaya yarar.
    2)super(); ne ise yarar ?
  Note: "super()" parent'teki constractor'i calistirmaya yarar.
        "super()" keyword'unu parent'taki parametresi belli olan
        constractor'lar icin kesinlikle kullanılmalıdır.
     */

    public int price = 10000;

    public void engine() {
        System.out.println("Honda Engine");
    }

    public Honda() {
        System.out.println("Honda 1");
    }

    public Honda(String model, int year) {
        System.out.println("Honda 2: " + model + " - " + year);
    }

}