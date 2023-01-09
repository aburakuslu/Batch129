package day23datetimestringbuilder;

public class StringBuffer01 {

    /*
        String olusturmak icin String Class, StringBuilder Class ve StringBuffer kullanilabilir.
        1)StringBuffer Java'nin String uretmek icin olusturdugu ilk Class'tir. Java 5'te uretilmistir.
        2)StringBuffer "synchronized"dir, StringBuilder "synchronized" degildir.
        3)StringBuffer "thread safe"dir(multi-thread'e uygun), StringBuilder "thread-safe" degildir.
        4)StringBuffer ve StringBuilder ikisi de mutable'dir.

        Note 1: Immutable String lazim oldugunda String Class kullaniriz.
        Note 2: Mutable String lazim oldugunda StringBuilder veya StringBuffer kullaniriz.
        Note 3: StringBuffer "Multi-thread" ve "Synchronization" lazim oldugunda tercih edilir.
                StringBuilder "Multi-thread" ve "Synchronization" gerekmezse tercih edilir.

     */

    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);

        System.out.println(sbf.capacity());//20

    }
}
