import java.util.Scanner;
import java.util.Random;
/**
 * cs180 lab2 word decoder
 * @auther zheng wu
 * @version 8/31/16.
 */

public class StarGenerator {
    public static void main(String [] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name? For example \"John Doe\"\n");
        String name = scanner.nextLine();
        System.out.println("What's your college name? For example \"Science\"\n");
        String college = scanner.nextLine();
        scanner.close();
        String email = name.charAt(0)+ name.substring(name.indexOf(" ")+1,name.length())+"@purdue.edu";
        String group = college.substring(0,4).toUpperCase() + random.nextInt(5);
        System.out.format("Your name is: %s\n",name );
        System.out.format("Your email is: %s\n",email );
        System.out.format("Your STAR group is: %s\n",group );



    }
}
