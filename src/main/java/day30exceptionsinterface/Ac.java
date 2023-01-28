package day30exceptionsinterface;

public interface Ac {

    //interface'lerin icine "concrete method" konulamaz, cunku "concrete" method'larda
    //body vardir ve body o method'un isi nasil yapacagini belirtir. Isin nasil yapilacagi
    //bircok detay icerir ve bu Child Class'larda kafa karisikligina sebep olur.
    //Halbuki sadece yapilmasi gereken isi soyleyip nasil yapilacagini Child'a birakirsaniz
    //Child Class'in kafa karisikligini engellemis olursunuz.

    //interface'ler "concrete" method iceremezler, dolayisiyla interface'in icindeki hicbir sey istege
    //bagli degildir, her sey Child Class'lar icin mecburidir. Bu yuzden interface'lere
    //"to-do list" de denir.

    //interface'lerdeki tum method'lar otomatik olarak "public"tir, "abstract"tir, "static" degildir

    //interface'leri variable'lar otomatik olarak "public"tir, "static"tir, "final"dir.
    void cool();
    void run();

    int price = 2000;
    String model = "Mitsubishi";
}
