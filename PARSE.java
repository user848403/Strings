import java.util.*;
public class PARSE {
    public static void main(String args[]){
        String no="1411";
        System.out.println(no.getClass().getName());
        int number=Integer.parseInt(no);
        System.out.println(number);
        System.out.println(((Object)number).getClass().getName());
    }
}
/* output
java.lang.String
1411
java.lang.Integer
 */