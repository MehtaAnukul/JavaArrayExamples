/**
 * Created by Anukul-PC on 03-03-2018.
 */

//this Programne for String
//    Input 'mimoh'
//    Output 'MimoH'
public class ArrStrUppLow2 {

    public static void main(String[] args) {


        String a[] = {"mimoh", "anukul", "rahul", "vishal"};

        for (int i = 0; i < a.length; i++) {
            String str = a[i];
            String s1 = str.substring(0, 1).toUpperCase()
                    + str.substring(1, str.length() - 1)
                    + str.substring(0, 1).toUpperCase();
            System.out.println(s1);
        }

    }
}
