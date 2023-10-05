import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        System.out.print("Enter: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //Method1:

//        String rev = "";
//
//        for(int i=str.length()-1; i>=0; i--){
//            rev = rev + str.charAt(i);
//        }

        //Method2:

        StringBuilder sb = new StringBuilder(str);
        StringBuilder rev = sb.reverse();

        System.out.println("The reverse is: "+rev);

    }
}
