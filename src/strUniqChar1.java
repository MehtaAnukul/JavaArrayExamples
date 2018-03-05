/**
 * Created by Anukul-PC on 26-02-2018.
 */

import java.util.Arrays;
import java.util.Scanner;

public class strUniqChar1 {
    public static void main(String[] args) {

        String stringArray[] = {"mimoh", "Anukul", "Hello", "Darshan"};

        char alpha[] = {'z', 's', 'd', 'a', 'f', 'r', 'a'};
//        Arrays.sort(alpha);

        System.out.println(Arrays.binarySearch(alpha,'f'));



//        Scanner kb = new Scanner(System.in);
//        String word = "";
//        System.out.println("Enter a word: ");
//        for (int i = 0; i < 5; i++) {
//            word = kb.nextLine();
//            uniqueCharacters(word);
//        }
//    }
//
//    public static void uniqueCharacters(String test) {
//        String temp = "";
//        for (int i = 0; i < test.length(); i++) {
//            if (temp.indexOf(test.charAt(i)) == -1) {
//                temp = temp + test.charAt(i);
//            }
//        }
//
//        System.out.println(temp + " ");
//
    }
}
