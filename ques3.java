//ques: Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
//Example :
//email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
//email = “helloWorld123@gmail.com”; username = “helloWorld123”

import java.util.*;
public class ques3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String email=sc.nextLine();
        String username= "";
        for(int i =0; i<email.length();i++){
            if(email.charAt(i)!='@') {
                username+=email.charAt(i);
            }else{
                break;
            }
        }
        System.out.println(username);
    }
}
/*output
helloWorld123@gmail.com
helloWorld123

Process finished with exit code 0

 */