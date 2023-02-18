package lambda_exercise;

import java.util.ArrayList;
import java.util.List;

public class Lambda_Exercise {

    public static void main(String[] args) {

        //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);


        ikiyeBolunenElementler(nums);

    }

    public static void elementlerBosluk(List<Integer> nums) {
        nums.stream().
                forEach(t -> System.out.print(t + " "));
    }

    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void ikiyeBolunenElementler(List<Integer> nums) {
        nums.stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));
    }

    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums){
        Integer sum = nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, (t, u)->t+u);
        System.out.println(sum);
    }

    //8)Create a method to calculate the "product" of the "square" of "distinct" "even" elements
    public static void sumOfNonDistinctEvenSquare(List<Integer>nums){
        Integer productEvenSquare =
                nums.stream
                        ().distinct().filter(t->t%2==0).map(t->t*t).reduce(1,(t,u)->t*u);
        System.out.println("productEvenSquare = " + productEvenSquare);
    }

}
