//ques:Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.*;
public class ques1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        String[] array= new String[size];
        int totallength=0;
        for ( int i=0;i<size;i++){
            array[i]=sc.next();
            totallength +=array[i].length();

        }
        System.out.println(totallength);
        System.out.println(Arrays.toString(array));
    }
}
/*output
5
 t o n y m
5
[t, o, n, y, m]

Process finished with exit code 0
 */
