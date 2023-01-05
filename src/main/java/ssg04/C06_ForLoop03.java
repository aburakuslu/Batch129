package ssg04;

public class C06_ForLoop03 {

    public static void main(String[] args) {

        String s = "Learn Java earn money";

        for(int i = s.length()-1; i>=0; i--){

            char ch = s.charAt(i);

            System.out.print(ch);
        }
    }
}
