//import java.util.Scanner;

/**
 * Created by Anukul-PC on 26-02-2018.
 */

import java.lang.String;

public class ArrStrPalindrome {
    public static void main(String arg[]) {
        String a[] = {"naman", "madam", "rahul", "121", "karan"};
        String rev = "";

        //length = a.length;

        for (int i = 0; i < a.length; i++) {

            String tempString = a[i];
            String reversString = "";
            for (int j = tempString.length() - 1; j >= 0; j--) {
                reversString = reversString + tempString.charAt(j);
            }

//
//            System.out.println(tempString + " >>>>> " + reversString);
//
//            System.out.println(tempString.equals(reversString));
            if (tempString.equals(reversString)) {
                System.out.println("PALIMDROM " + tempString);
            } else {
                System.out.println("NOT PALIMDROM " + tempString);
            }
        }
    }
}
