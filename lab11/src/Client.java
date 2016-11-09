import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by wu673 on 11/9/16.
 */
public class Client {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 1265);
                new BufferedReader(new InputStreamReader(s.getInputStream()));

        PrintWriter out =
                new PrintWriter(s.getOutputStream(), true);
        BufferedReader in =
                new BufferedReader(new InputStreamReader(s.getInputStream()));

        //String answer = input.readLine();
        //System.out.println(answer);
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter filename:");
        String filename =scanner.nextLine();
        System.out.println("please enter username:");
        String username =scanner.nextLine();
        String msg ="Filename:" +filename;
        String msg2 ="Username:"+username;
        out.println(msg);
        out.println(msg2);
        scanner.close();
        String sCurrentLine;
        while ((sCurrentLine = in.readLine()) != null) {
            System.out.println(sCurrentLine);
            String[] s1 = sCurrentLine.split(";");
            try{
                PrintWriter writer = new PrintWriter("info.txt", "UTF-8");
                writer.println("First name:"+s1[2]);
                writer.println("Last name:"+s1[3]);
                writer.println("Score: "+s1[4]);
                writer.close();
            } catch (Exception e) {
                // do something
            }

        }
    }

}
