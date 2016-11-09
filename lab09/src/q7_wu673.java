import javax.swing.*;
import java.sql.*;

/**
 * Created by wu673
 * -----compile-------
 *javac q7_wu673.java
 * --------------run--------------
 * java -cp .:ojdbc7.jar q7_wu673 username password
 * for example: java -cp .:ojdbc7.jar q7_wu673 wu673 mypassword
 *
 */
public class q7_wu673 {
    static final String DB_URL = "jdbc:oracle:thin:@claros.cs.purdue.edu:1524:strep";
    //  Database credentials

    public static void main(String[] args) {
        String inputcourse = JOptionPane.showInputDialog(null, "Please input a course number eg. CS240");
        inputcourse=inputcourse.toUpperCase();
        Connection conn = null;
        String alertresult="";
        try{
            // Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            //conn = DriverManager.getConnection(DB_URL, USER, PASS);
            conn = DriverManager.getConnection(DB_URL, args[0], args[1]);
            System.out.println("Connected database successfully...");
            String sql = "select enrollment,email from course inner join course_ta on course.course= course_ta.course where course.course=\'"+inputcourse+"\'";
            Statement statement = conn.createStatement();
            ResultSet result =  statement.executeQuery(sql);
                int c1=0;
                int enrollmentout=0;
            while(result.next()){
                //Retrieve by column name
                int enrollment = result.getInt("enrollment");
                c1++;

                enrollmentout = enrollment;

            }
            int studentperTa = enrollmentout/c1;
            boolean flag = false;
            if(studentperTa>50) {
                flag = true;
            }
            System.out.println("Student per ta: " + studentperTa);
            if(flag) {
                String sql1 = "update course_ta set salary = salary*1.05 where email in (select tas.email email from course inner join course_ta on course.course =course_ta.course inner join tas on course_ta.email = tas.email where  standing in('GOOD','EXCELLENT')) and course_ta.course=\'" + inputcourse + "\'";
                //select sum(salary) sum,course from course_ta where course='CS240' group by course;
                Statement statement1 = conn.createStatement();
                //System.out.println("updated");
                int result1 = statement1.executeUpdate(sql1);
                System.out.println(result1);
                if (result1>0) {

                    System.out.println(result1 +" row updated");
                }
            }
            else{
                System.out.println("No row satisfy the condition. Nobody's salary raised.");
            }
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main
}
