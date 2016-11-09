import javax.swing.*;

/**
 * cs180 lab2 word decoder
 * @auther zheng wu
 * @version 8/31/16.
 */

public class WordFixGUI {
    public static void main(String [] args){
    String s1 = JOptionPane.showInputDialog("Enter the word to be deciphered: ");
        String result = "";
        int len = s1.length();
        result += s1.charAt(len-1);
        int starPosition = s1.indexOf('*');
        String beforeStar = s1.substring(1,starPosition);
        String afterStar = s1.substring(starPosition+1,len-1);
        result += afterStar;
        result += beforeStar;
        result += s1.charAt(0);
    JOptionPane.showMessageDialog(null,result);

    }
}
