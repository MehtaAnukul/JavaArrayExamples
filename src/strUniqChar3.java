/**
 * Created by Anukul-PC on 26-02-2018.
 */

import java.lang.String;

public class strUniqChar3 {
    public static void main(String args[]) {

        String a[] = {"Mimoh", "Anukul", "karan", "dhananjay", "Vishal", "Rahul"};
        String temp = "";
        //  int count = 0;
        for (int i = 0; i < a.length; i++) {

            String tempString = a[i];
            for (int j = 0; j < tempString.length(); j++) {
                if (temp.indexOf(tempString.charAt(j)) == -1) {
                    temp = temp + tempString.charAt(j);
                }
            }
        }

        System.out.println(temp);
        System.out.println("Unique character count: " + temp.length());

    }
}