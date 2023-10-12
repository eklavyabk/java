import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {

        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int org_num = num;

        int rev = 0;
        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }

//        StringBuilder sb = new StringBuilder(String.valueOf(num));
//        StringBuilder re = sb.reverse();
//        int rev = Integer.parseInt(String.valueOf(re));

        //or

     /*   StringBuilder sb = new StringBuilder(Integer.toString(num));
        StringBuilder rev = sb.reverse();

        if(num==Integer.parseInt(rev.toString())){
            System.out.println("Its a plaindrome");
        }

      */

        if(org_num==rev){
            System.out.println("Its a palindrome ");
        }else{
            System.out.println("Its not a palindrome");
        }
    }
}
