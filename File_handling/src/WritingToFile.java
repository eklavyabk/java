import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingToFile {
    public static void main(String[] args) {

//        ------------------------------------------------------------------------------------------------------

        //Method3:

   /*     try {

            //  By writing true as second argument in FileWriter, we have told to append content to file
            //  Due to this, now it will not overwrite instead it will add text.
            FileWriter fileWriter = new FileWriter("firstFile.txt",true);
            System.out.print("Enter your text: ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            fileWriter.write("\n"+str);  // backward slash ie \n will add a new line
            System.out.println("Success");
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("An error occured: "+e.getMessage());
        }

    */

//        -------------------------------------------------------------------------------------------------
//        Method1 and Method2 will overwrite the file content.
//        -------------------------------------------------------------------------------------------------

        //Method2 : user input through scanner object

        /*

        try {
            FileWriter fileWriter = new FileWriter("firstFile.txt");
            System.out.print("Enter your text: ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            fileWriter.write(str);
            System.out.println("Success");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occured "+ e.getMessage());
        }


         */
//        ------------------------------------------------------------------------------------------

        //Method1 : Directly writing

     /*   try {

            // creating an object of FileWriter class
            FileWriter fileWriter = new FileWriter("firstFile.txt");

            // using write() to write into the file
            fileWriter.write("Hii this is bk.");
            System.out.println("Written successfully");
            fileWriter.close();   // closing the file

            } catch (IOException e) {
            e.printStackTrace();
        }
*/
    }
}
