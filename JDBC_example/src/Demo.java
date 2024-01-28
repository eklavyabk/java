import java.sql.*;

public class Demo {
    public static void main(String[] args) throws SQLException {

         /*
         prerequsite
         First download my sql connector jar file from google, click java2s link - .jar.zip file, extract it
         or https://dev.mysql.com/downloads/connector/j/
         After that in intellij go to project structure -libraries and click on plus symbol .
         Find ur sql connector path and add it .click on ok.
          */

//------------------------------------------------------------------------------------------------------------


        //Note: Loading and registering the driver is optional from java 6 0r 8.
        // we directly create connection.




//------------------------------------------------------------------------------------------------------------


        /*
        insert, update, delete -- DML(Data Manipulation Language) commands

        step1:- Create a connection
        step2:- Create a statement/Query
        step3:- Execute a statement/Query   Note. here we use st.execute()
        step4:- Close connection

         */

//------------------------------------------------------------------------------------------------------------


        /*
        select -- Data Retrieval/Data Query Language

        step1:- Create a connection
        step2:- Create a Statement/Query
        step3:- Execute statement/Query   Note. here we use st.executeQuery() --used to retrieve data
        step4:- store the results in result set
        step5:- Close connection
         */

//------------------------------------------------------------------------------------------------------------


         /*
             Connection is an interface. you cant create an object of it.
             Thats when u use another class called DriverManager.
             DriverManager has a method called getConnection which helps u to get connected.

         */

//------------------------------------------------------------------------------------------------------------
/*
        JDBC DriverManager is a class in JDBC API that loads a database-specific driver
        in Java application and establishes a connection with a database.

//------------------------------------------------------------------------------------------------------------

        Connection: interface

        java.sql.Connection represents a connection to a database.
        It is used to create Statement, PreparedStatement objects

//------------------------------------------------------------------------------------------------------------
        java.sql.Statement is an interface for executing SQL statements
//------------------------------------------------------------------------------------------------------------

         ResultSet is an interface in the Java Database Connectivity (JDBC) API.
        It is used to represent the result set of a database query

 */

//------------------------------------------------------------------------------------------------------------


        //Step1: Create a connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_directory",
                "root","root");

        //Step2: Create a statement
        Statement st = con.createStatement();

        //step3 & 4: Execute Statement and store data in result set
        ResultSet rs = st.executeQuery("Select * from employee");
        while(rs.next()){  // when we dont know the exact range we can direclty go to
                             // while loop and use rs.next()
            String id = rs.getString(1); // rs.getString("id");
            String first_Name = rs.getString(2);
            String last_Name = rs.getString(3);
            String email = rs.getString(4);

            System.out.println("Id >> "+id);
            System.out.println("Name >> "+first_Name);
            System.out.println("Surname >> "+last_Name);
            System.out.println("email >> "+email);
            System.out.println("-----------------------------------------");


        }
        // step5: close connection
        con.close();

    }
}

//------------------------------------------------------------------------------------------------------------


/*

Difference between Statement and PreparedStatement

Statement: -  It is used when SQL query is to be executed only once.
           -  Statement interface cannot accept parameters and useful when
              you are using static SQL statements at runtime.
           -  It is used for DDL statements.


PreparedStatement:  - It is used when SQL query is to be executed multiple times.
                    - The PreparedStatement interface accepts input parameters at runtime.
                    - It is used for any SQL query

                    example:

//Creating the PreparedStatement object
PreparedStatement prep_statement = con.prepareStatement("update STUDENT set NAME = ? where ID = ?");

//Setting values to place holders
//Assigns "RAM" to first place holder
prep_statement.setString(1, "RAM");

//Assigns "512" to second place holder
prep_statement.setInt(2, 512);

//Executing PreparedStatement
prep_statement.executeUpdate();     --executeUpdate() used for DDL statements--(Create,ALter,drop,Truncate)
                                    --Data Definition Language

 */


//------------------------------------------------------------------------------------------------------------

/*

Difference between executeQuery and executeUpdate

executeQuery() : This method is used to retrieve data from database using SELECT query.

executeUpdate() : This method is used for execution of DML statement(INSERT, UPDATE and DELETE) which
return int value, count of the affected rows.

 */

//------------------------------------------------------------------------------------------------------------

/*
  what is connection pooling?

Connection pooling is a technique used in software development to efficiently manage and reuse
database connections. Instead of opening and closing a new connection for each database operation,
a pool of pre-established connections is maintained, allowing applications to reuse and share connections.
This improves performance.

 */
//------------------------------------------------------------------------------------------------------------


/*

why to close a connection?


When you establish a connection to a database, it involves creating a
socket connection between your application and the database server.
If you don't close the connection, the socket connection may remain open,
consuming system resources.

Socket Connection:

The database connection often involves creating a socket connection between your application and
the database server. If you don't close the connection, the socket connection may remain open,
consuming system resources.
Resource Allocation:

Connection Pooling:

If your application uses connection pooling (a common practice for performance reasons),
closing the connection returns it to the pool, making it available for reuse.
Failing to close connections can lead to connection pool exhaustion.


 */