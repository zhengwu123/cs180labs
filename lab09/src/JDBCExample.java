//STEP 1. Import required packages
import java.sql.*;
import javax.swing.*;
public class JDBCExample {
    // JDBC driver name and database URL

    static final String DB_URL = "jdbc:oracle:thin:@claros.cs.purdue.edu:1524:strep";
    //  Database credentials
    static final String USER = "wu673";
    static final String PASS = "wz5332005";

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
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");
                String sql = "select firstname,lastname,course,sum(salary) sum from tas right join course_ta on tas.email=course_ta.email where course=\'"+inputcourse+"\' group by firstname,lastname,course";
                Statement statement = conn.createStatement();
          ResultSet result =  statement.executeQuery(sql);
            while(result.next()){
                //Retrieve by column name
                String firstname = result.getString("firstname");
                String lastname = result.getString("lastname");
                //String course = result.getString("course");
                //int totalSalary = result.getInt("sum");

                //Display values
                System.out.print(", firstname: " + firstname);
                System.out.print(", lastname: " + lastname);
                //System.out.println(", total salary: " + totalSalary);
            }
            String sql1 = "select sum(salary) sum from tas right join course_ta on tas.email=course_ta.email where course=\'"+inputcourse+"\'";
            Statement statement1 = conn.createStatement();
             result =  statement1.executeQuery(sql);
            while(result.next()){
                //Retrieve by column name
                //String firstname = result.getString("firstname");
                //String lastname = result.getString("lastname");
                //String course = result.getString("course");
                int totalSalary = result.getInt("sum");


                System.out.println(", total salary: " + totalSalary);
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
}//end JDBCExample