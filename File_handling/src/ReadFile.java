import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {

        File myFile = new File("firstFile.txt");
        try {
            Scanner sc =new Scanner(myFile);
            while(sc.hasNextLine()){               // here we have used while loop to read all lines
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured "+e.getMessage());
        }


//        --------------------------------------------------------------------------------------

       /*
        File myFile = new File("firstFile.txt");
        try {
            Scanner sc =new Scanner(myFile);
            System.out.println(sc.nextLine());   //It will read just first line
        } catch (FileNotFoundException e) {
            System.out.println("An error occured "+e.getMessage());
        }

        */
    }
}
