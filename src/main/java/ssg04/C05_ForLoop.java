package ssg04;

public class C05_ForLoop {

    public static void main(String[] args) {

        String str = "I love Java";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'a'){
                break;
            }
            System.out.println(ch);
        }


        String s = "Germany";

        for(int i = str.length()-1; i>=0; i--){
            char ch2 = str.charAt(i);

            if(ch2 == 'a'){
                break;
            }
            System.out.print(ch2);
        }
    }
}
