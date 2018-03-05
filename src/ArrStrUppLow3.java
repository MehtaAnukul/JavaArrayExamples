/**
 * Created by Anukul-PC on 03-03-2018.
 */
public class ArrStrUppLow3 {
    public static void main(String[] args) {
        String a[] = {"mimoh","anukul","rahul","vishal"};

        for(int i=0;i<a.length;i++){
            String str= a[i];
            String s1 = str.substring(0,1).toUpperCase()+str.substring(0,1).toLowerCase()+str.substring(str.length()-1).toUpperCase();
            System.out.println(s1);
            //System.out.println(str);
        }
    }
}
