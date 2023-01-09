package ssg_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Lists02 {
    public static void main(String[] args) {
        // verilen bir array'den istenen elementi(kac tane varsa) silip, kalanlari
        // yeni bir list  olarak yazdiran bir method olusturun

        int arr[] = {3, 4, 2, 3, 5, 7, 3, 8, 5, 2, 4};

        int istenmeyenEleman = 3;
        istenmeyenElemanSilVeYazdir(arr, istenmeyenEleman); //[4, 2, 5, 7, 8, 5, 2, 4]
    }

    public static void istenmeyenElemanSilVeYazdir(int[] arr, int istenmeyenEleman){
        List<Integer> list = new ArrayList<>();

        for(Integer w : arr){
            if (w!=istenmeyenEleman){
                list.add(w);
            }
        }
        System.out.println(list); //[4, 2, 5, 7, 8, 5, 2, 4]
    }
}
