package ssg04;

public class C07_ForLoop04 {

    public static void main(String[] args) {

        //Example 1: Verilen bir String'de 'a' characteri haric tum characterleri yazdiriniz.
        //          "Madagaskar" ==> Mdgskr

        String s = "Madagaskar";

        String t = s.replace("a", "");
        System.out.println(t);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != 'a') {
                System.out.print(ch);
            }
        }

        System.out.println();


        String st = "Learn";

        for (int j = 0; j < s.length(); j++) {
            char ch1  = s.charAt(j);

            if(ch1 != 'e'){
                System.out.print(ch1);
            }
        }
    }
}
