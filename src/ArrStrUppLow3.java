/**
 * Created by Anukul-PC on 03-03-2018.
 */
public class ArrStrUppLow3 {
    public static void main(String[] args) {
        String a[] = {"mimoh", "anukul", "rahul", "vishal"};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length(); j++) {

                String str = a[i];

                if (j % 2 == 0) {
                    System.out.print(Character.toUpperCase(str.charAt(j)));
                }
                else
                {
                    System.out.print(str.charAt(j));
                }


            }


/*
            String str = a[i];
            String s1 = str.substring(0, 1).toUpperCase()
                    + str.substring(1, 2).toLowerCase()
                    + str.substring(2, 3).toUpperCase()
                    + str.substring(3, 4).toLowerCase()
                    + str.substring(str.length() - 1).toUpperCase();
            System.out.println(s1);
            //System.out.println(str);
*/
        }
    }
}

