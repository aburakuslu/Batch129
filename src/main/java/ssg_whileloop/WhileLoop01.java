package ssg_whileloop;

public class WhileLoop01 {

    public static void main(String[] args) {
        // kullanicidan iki tamsayi alip
        // bu sayilari ve aralarindaki tum tamsayilari yazdiran bir kod olusturun

        // 20 -  40
        // 1 .yol for loop
        for (int i = 20; i <=40 ; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        // 2 yol  while loop
        int basla = 20;
        int bitis = 40;

        /*
        while(basla <= bitis){
            System.out.print(basla + " ");
            basla++;
        }
         */
        do {
            System.out.print(basla + " ");
            basla++;
        } while(basla <= bitis);
    }
}
