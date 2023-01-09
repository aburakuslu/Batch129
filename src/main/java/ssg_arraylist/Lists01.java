package ssg_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        //         List<Integer>  list2 = new ArrayList<Integer>();
        //         ArrayList<Integer>  list3 = new ArrayList<>();
        //         Collection<Integer> list4 = new ArrayList<Integer>();

        list.add(15);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);

//        System.out.println(list);

        for (int w : list) {
            System.out.print(w + " ");
        }

        int i;

        List<Integer> myList = List.of(12, 13, 14, 15, 16);
        for (int j = 0; j < myList.size(); j++) {
            System.out.println(myList.get(j));
        }

        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]  bu listi
        //       [1, 3, 5, 6, 7] bu hale donusturun


        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        System.out.println(tekrarsizListOlustur(sayilar));


    }

    public static List<Integer> tekrarsizListOlustur(List<Integer> sayilar) {
        List<Integer> tekrarsizList = new ArrayList<>();

        //for-each loop
        for (int w : sayilar) {
            if (!tekrarsizList.contains(w)) {
                tekrarsizList.add(w);
            }
        }
        System.out.println("------------------------------");

        //for-loop

        for (int i = 0; i < sayilar.size(); i++) {
            if (!tekrarsizList.contains(sayilar.get(i))) {
                tekrarsizList.add(sayilar.get(i));
            }
        }
        return tekrarsizList;
    }
}
