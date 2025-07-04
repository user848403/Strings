import java.util.*;
public class changetostring {
    public static void main(String args[]){
        int number=1411;
        System.out.println(((Object)number).getClass().getName());
        String no= Integer.toString(number);
        System.out.println(no);
        System.out.println(no.getClass().getName());
    }
}
/* output
java.lang.Integer
1411
java.lang.String
 */