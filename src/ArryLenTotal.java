/**
 * Created by Anukul-PC on 17-02-2018.
 */
public class ArryLenTotal {

    public static void main(String[] args) {

        String a[] = {"Mimoh", "Anukul", "Kodee", "Sagar", "Naresh", "Vishal", "Rahul"};
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length(); j++) {
                count++;
            }
        }
        System.out.println(count);

    }

}



