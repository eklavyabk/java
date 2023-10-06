import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Ignore the case by using toLowerCase() on str and rev

        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("Its a palindrome");
        }else{
            System.out.println("Its not a palindrome");
        }
    }
}


