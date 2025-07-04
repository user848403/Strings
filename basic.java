import java.util.*;
public class basic {
    public static void main(String args[]) {
        //declaration
        String name = "user";

        //taking input
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //concatination
        String together = name + " " + input; //method 1 with space
        String tog = name.concat(input);  //method 2 no space
        System.out.println(together);
        System.out.println(tog);

        //length
        System.out.println(tog.length());
        System.out.println(together.length());

        //access characters of a string

        for (int i=0;i<together.length();i++){
            System.out.println(together.charAt(i));
        }

        //comparison of two strings
         if(tog.equals(together)){
             System.out.println("yes they are equal");
         }else{
             System.out.println("no they are not equal");
         }

         //substring ( doesnt include last index)
        System.out.println(tog.substring(0,6));
    }
}
/*OUTPUT
thor
user thor
userthor
8
9
u
s
e
r

t
h
o
r
no they are not equal
userth

Process finished with exit code 0
 */
