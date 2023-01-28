package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMaps03 {

    public static void main(String[] args) {

        //Example 1: Size verilen bir cumlede kullanilan harflerin gorunum sayisini gosteren kodu yaziniz.
        //           "Java is Java" ==> J=2, a=4, v=1, s=1

        HashMap<String, Integer> lettersMap = new HashMap<>();

        String sentence = "Java is Java.";

        sentence = sentence.replaceAll("[^a-zA-Z]", "");
        System.out.println(sentence);

        String[] lettersArray = sentence.split("");
        System.out.println(Arrays.toString(lettersArray));

        for (String w : lettersArray) {
            Integer numOfOccurence = lettersMap.get(w);
            if (numOfOccurence == null) {
                lettersMap.put(w, 1);
            } else {
                lettersMap.replace(w, numOfOccurence + 1);
            }
        }
        System.out.println(lettersMap);
    }
}
