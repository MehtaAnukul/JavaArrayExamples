/**
 * Created by Anukul-PC on 17-02-2018.
 */
import java.lang.String;
public class ArrayDemo {
    public static void main(String[] args) {

        String a[] = {"Mimoh", "Anukul", "Kodee", "Sagar", "Naresh", "Vishal", "Rahul"};

        for (int i = 0; i < a.length; i++) {
            {
                String sub = a[i];

                for (int j = 0; j < 3; j++) {
                    System.out.print(sub.charAt(j));
                    //System.out.println(" ");
                }
                System.out.println();
                // System.out.println(a.length);
            }
        }
    }
}
