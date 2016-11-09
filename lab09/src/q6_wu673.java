import javax.swing.*;
import java.sql.*;

/**
 * Created by wu673
 * -----compile-------
 *javac q6_wu673.java
 * --------------run--------------
 * java -cp .:ojdbc7.jar q6_wu673 username password
 * for example: java -cp .:ojdbc7.jar q6_wu673 wu673 mypassword
 *
 */
public class q6_wu673 {
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
            conn = DriverManager.getConnection(DB_URL,args[0], args[1]);
            System.out.println("Connected database successfully...");
            String sql = "select firstname,lastname from tas right join course_ta on tas.email=course_ta.email where course=\'"+inputcourse+"\'";
            Statement statement = conn.createStatement();
            ResultSet result =  statement.executeQuery(sql);
            System.out.println("TAs in class: "+ inputcourse);
            alertresult+="TAs in class: "+ inputcourse +"\n";
            alertresult+="\n";
            while(result.next()){
                //Retrieve by column name
                String firstname = result.getString("firstname");
                String lastname = result.getString("lastname");
                //String course = result.getString("course");
                //int totalSalary = result.getInt("sum");
                //Display values
                alertresult+= "Firstname: " + firstname+", Lastname: " + lastname +"\n";
                System.out.println("Firstname: " + firstname+", lastname: " + lastname);
                //System.out.println(", total salary: " + totalSalary);
            }
            String sql1 = "select sum(salary) sum,course from course_ta where course=\'"+inputcourse+"\' group by course";
            //select sum(salary) sum,course from course_ta where course='CS240' group by course;
            Statement statement1 = conn.createStatement();
            ResultSet result1 =  statement1.executeQuery(sql1);
            alertresult+="\n";
            while(result1.next()){
                //Retrieve by column name
                //String firstname = result.getString("firstname");
                //String lastname = result.getString("lastname");
                //String course = result.getString("course");
                String totalSalary = result1.getString("sum");

                alertresult+="Total salary: " + totalSalary +"\n";
                System.out.println("Total salary: " + totalSalary);
            }
            JOptionPane.showMessageDialog(null,alertresult);
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
