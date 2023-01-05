package day10switchloops;

public class Loops02 {

    public static void main(String[] args) {

        //Example 1: 21'den 180'e kadar hem 4 hem de 6 ile bolunebilen tamsayilari ekrana yazdiran kodu yaziniz

        for(int i = 21; i<181; i++){
            if(i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Example 2: Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan karakterlerini buyuk harf
        //              yapiniz.
        //              ankara ==> AnKaRa
        // Yazdiginiz kod belirli senaryolar calisiyor, tum senaryolar icin calismiyorsa; bu koda "hard-code" denir.
        // "hard-code" yanlis yazilmis code'dur, mutlaka duzeltilmelidir.

        //Bir String'de son index = length() - 1

        String s = "ankara";

        String t = " ";

        for(int i = 0; i<s.length(); i++){

            String ch = s.substring(i, i+1);
            t = t + ch;

            if(i%2==0){
                System.out.println(ch.toUpperCase());
            }

        }


    }
}
