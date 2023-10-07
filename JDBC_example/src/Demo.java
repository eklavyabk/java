import java.sql.*;

public class Demo {
    public static void main(String[] args) throws SQLException {

         /*
         First download my sql connector jar file from google
         After that got to project structure -libraries and click on plus symbol .
         Find ur sql connector path and add it .click on ok.
          */

        //Note: Loading and registering the driver is optional from java 6 0r 8.
        // we directly create connection.


        /*
             Connection is an interface. you cant create an object of it.
             Thats when u use another class called DriverManager.
             DriverManager has a method called getConnection which helps u to get connected.

         */
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_directory",
                "root","root");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * from employee");
        while(rs.next()){
            String id = rs.getString(1);
            String first_Name = rs.getString(2);
            String last_Name = rs.getString(3);
            String email = rs.getString(4);

            System.out.println("Id >> "+id);
            System.out.println("Name >> "+first_Name);
            System.out.println("Surname >> "+last_Name);
            System.out.println("email >> "+email);
            System.out.println("-----------------------------------------");


        }
//        String name = rs.getString(1);
//        System.out.println(name);
        con.close();

    }
}
