import java.util.Scanner;

/**
 * cs180 lab2 word decoder
 * @auther zheng wu
 * @version 09/06/16.
 */
public class ExpressionEvaluator {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your expression...");
        String expression = scanner.nextLine();
        int n1 = Integer.parseInt( expression.substring(2,expression.indexOf('+')));
        //System.out.println(n1);
        int n2 = Integer.parseInt( expression.substring(expression.indexOf('t')+2,expression.indexOf('*')));
        //System.out.println(n2);
        String expressionM = expression.substring(2,expression.length()-1);
        int n3 = Integer.parseInt( expressionM.substring(expressionM.indexOf('*')+1,expressionM.indexOf('-')));
        //ystem.out.println(n3);
            String expression2 = expressionM.substring(expressionM.indexOf('-'),expressionM.indexOf('/'));
        System.out.println(expression2);
        String expression4 = expression2.substring(expression2.indexOf('-')+1,expression2.indexOf('*'));
        System.out.println(expression4);
        //int n4 = Integer.parseInt( expression4.substring(0,expression4.indexOf('*')));
       // System.out.println(n4);

        String expression3 =expression2.substring(expression2.indexOf('*')+1,expression2.indexOf(')'));

        int n5 = Integer.parseInt( expression3.substring(expression.indexOf('*')+1,expression.indexOf(')')));

        int n6 = Integer.parseInt( expression.substring(expression.indexOf('*')+1,expression.length()-1));
        n1 =n1*-1;
        double result = (n1 +Math.sqrt(n2*n3 - 4*4*n5))/(2*n6);
            System.out.println(result);
    }
}
