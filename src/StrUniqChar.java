/**
 * Created by Anukul-PC on 18-02-2018.
 */

import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.String;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrUniqChar {
    public static void main(String[] args) {
        String wordsArray[] = {"karan", "mimoh", "dhananjay", "rahul", "vishal", "anukul"};
        Character rem[] = {};
        int count = 0;

        List<Character> characters = new ArrayList<>();

        for (int i = 0; i < wordsArray.length; i++) {
            String eachword = wordsArray[i];
            for (int j = 0; j < eachword.length(); j++) {

//                boolean status = ;
//                System.out.println(status);
                if (!characters.contains(eachword.charAt(j))) {
                    //  System.out.println(eachword.charAt(j) + "" + Arrays.asList(rem).contains(eachword.charAt(j)));
                    characters.add(eachword.charAt(j));
                }
            }
        }
        System.out.println(characters.size());
        System.out.println(characters);

    }
}


