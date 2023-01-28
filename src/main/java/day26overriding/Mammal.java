package day26overriding;

public abstract class Mammal extends Animal {

    public void feedWithMilk() {
        System.out.println("Mammals feed their babies with milk");
    }

    //Override Annotation: Override kurallarinin Java tarafindan kontrol edilmesini saglar.
    public abstract void eat();
}
