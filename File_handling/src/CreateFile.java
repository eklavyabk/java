import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        // Creating a object of File class
        File myFile = new File("secondFile.txt");

        // checking if firstFile.txt exists or not. If it doesnt exist we can create this file.
        if(myFile.exists()){         // return true if exists
            System.out.println("File already exists");
        }else{
            try {
                boolean newFile = myFile.createNewFile(); // using createNewFile() to create the File
                if (newFile){      // createNewFile() returns true if file created
                    System.out.println("File created : "+myFile.getName());
                }else{
                    System.out.println("File not created");
                }
            } catch (IOException e) {
                System.out.println("Some error occured");
                e.printStackTrace();
            }
        }





    }
}
