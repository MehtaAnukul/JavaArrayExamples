import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Created by Anukul-PC on 03-03-2018.
 */
public class ArrStrUppLow {
    public static void main(String[] args) {
        String a[] = {"mimoh","anukul","rahul","vishal"};

        for(int i=0;i<a.length;i++){
            String str= a[i];
            String s1 = Character.toUpperCase(str.charAt(0))+ str.substring(1);
            System.out.println(s1);
            //System.out.println(str);
        }
    }
}
