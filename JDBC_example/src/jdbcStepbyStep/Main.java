package jdbcStepbyStep;

import java.sql.*;
import java.util.Scanner;

//Note: youtube-code step by step channel #70

//note: Here i have just used Statement

//note: use executeQuery with 'resultset rs'  for select command  ie for retrieval
//note: use executeUpdate with 'int result' for insert update delete command.

//note: we have not close the connection here but thats wrong.

public class Main {
    public static void main(String[] args) {

//        getConnection();
//        getData();
//        insertData();
//        deleteRecord();
//        updateRecord();
//        getRecordfrominput();
        updateRecordUsingPs();
    }


    //1.
    public static Connection getConnection(){
        //Its a good practice to use try-catch block while dealing with database
        try {
            String url = "jdbc:mysql://localhost:3306/bk";
            String username = "root";
            String pswd = "root";

            Connection con = DriverManager.getConnection(url,username,pswd);
            System.out.println("Connection Successfull");
            return con;

        }catch (Exception e){
            System.out.println("Some error: "+e);
        }
        return null;
    }


    //2.
    public static void getData(){
        try {
             Statement st = getConnection().createStatement();
             ResultSet rs = st.executeQuery("select * from personaldetails");
             while(rs.next()){
                 int id = rs.getInt(1);
                 String name = rs.getString(2);
                 String email = rs.getString(3);

                 System.out.println("id: "+id+"\nname: "+name+"\nemail: "+email);
                 System.out.println("-----------------------------------");
             }

        }catch (Exception e){
            System.out.println("error: "+e );
        }
    }


    //3.
    public static void insertData(){
        try {

            Statement st = getConnection().createStatement();
            String query = "Insert into personaldetails(id,name,email) values(3,'Amit','ak@gmail.com')";
            int result = st.executeUpdate(query);    // it will return 1 if data is inserted
            if(result==1){
                System.out.println("Data Inserted");
            }else {
                System.out.println("Data not inserted");
            }

        }catch (Exception e){
            System.out.println("error: "+e);
        }
    }

    //4.
     public static void deleteRecord(){
        try {

            Statement st = getConnection().createStatement();
            String query = "delete from personaldetails where id=1";
            int result = st.executeUpdate(query);
            if(result==1){
                System.out.println("record deleted successfully");
            }


        }catch(Exception e){
            System.out.println("error: "+e);
        }
     }

     //5.
    public static void updateRecord(){
        try {

            Statement st = getConnection().createStatement();
            String query = "update personaldetails set name='sujit',email='sk@Yahoo' where id=2";
            int result = st.executeUpdate(query);
            if(result==1){
                System.out.println("record updated");
            }

        }catch(Exception e){
            System.out.println("error: "+e);
        }
    }


    //6.
    public static void getRecordfrominput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id: ");
        int n = sc.nextInt();

        try {
            Statement st = getConnection().createStatement();
            String query = "select * from personaldetails where id="+n;
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }
        }catch(Exception e){
            System.out.println("error: "+e);
        }

    }


    //6.PreparedStatement
    public static void updateRecordUsingPs(){
        try {
            String query = "update personaldetails set name=?,email=? where id=?";
            PreparedStatement ps = getConnection().prepareStatement(query);

//         here we have put data directly
//            ps.setString(1,"Ram");
//            ps.setString(2,"Ram@Ayodhya");
//            ps.setInt(3,2);

            Scanner sc  = new Scanner(System.in);
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter email: ");
            String email = sc.nextLine();
            System.out.print("Enter id: ");
            int id = sc.nextInt();

            ps.setString(1,name);
            ps.setString(2,email);
            ps.setInt(3,id);

            int result = ps.executeUpdate();
            if(result==1){
                System.out.println("record updated");
            }

        }catch (Exception e){
            System.out.println("error :"+e);
        }
    }


}
