package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {

    public static void main(String[] args) {

        int a = 5;
        System.out.println(a); //5

        //Increment 1
        a = a + 2; //veya a += 2;
        System.out.println(a); //7

        //Example 1: Bir tane int variable olusturun ve onu 2 sekilde 5 artirin.

        int b = 10;
        System.out.println(b); //10
        b = b + 5;
        System.out.println(b); //15
        b += 5;
        System.out.println(b); //20

        //Decrement
        int c = 8;
        System.out.println(c); //8

        c = c - 3;
        System.out.println(c); //5

        c -= 3;
        System.out.println(c); //2

        //Increment 2

        int d = 6;
        System.out.println(d); //6

        d = d * 2;
        System.out.println(d); //12

        d *= 2;
        System.out.println(d); //24

        //Decrement 2

        int e = 24;
        System.out.println(e);

        e = e / 2;
        System.out.println(e);

        e /= 2;
        System.out.println(e);

        // 1 ile Increment

        int f = 12;

        f++;
        System.out.println(f); //13


        // 1 ile Decrement
        int h = 10;
        h--;
        System.out.println(h); //9


        //"post-Increment" ve "pre-Increment"

        int i = 10;
        int k = i++; //post-increment cunku increment, variable'in isminden sonra yazildi.

        System.out.println(k); //10 ==> "i" artirilmadan "k" ya konuldugu icin "k" nin degeri 10 olur.
        System.out.println(i); //11 ==> "i" satir sonunda artirildigi icin  "i" nin degeri 11 olur.

        int m = 15;
        int n = ++m;// pre-increment cunku increment variable'in isminden once yazildi.

        System.out.println(m); //16 ==> "m" satir sonunda artirildigi icin "m" nin degeri 16 olur.
        System.out.println(n); //16 ==> "m" artirildiktan sonra "n" ye konuldugu icin "n"nin degeri 16 olur.


        //"post-decrement" ve "pre-decrement"

        int p = 17;
        int r = p;
        System.out.println(p);//16
        System.out.println(r);//17

        int s = 20;
        int t = --s;
        System.out.println(s);//19
        System.out.println(t);//19

    }
}
