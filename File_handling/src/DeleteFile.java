import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {

        File myFile = new File("secondFile.txt");
        if(myFile.exists()){
            boolean delete = myFile.delete();
            if(delete){
                System.out.println("File deleted: "+myFile.getName());
            }else{
                System.out.println("File not deleted");
            }
        }else{
            System.out.println("File doesn't exist in the given path");
        }

    }
}
