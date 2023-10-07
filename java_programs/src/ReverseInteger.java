import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {

        System.out.print("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // method1 :

//        int rev = 0;
//        while(num != 0){
//            int remainder = num%10;
//            rev = rev*10 + remainder;
//            num = num/10;
//    }


          /*
             num%10 -- anything divide by 10 always gives last number as remainder

             rev*10 -- it shifts the digit of reverse one place to the left.
             num=112.suppose current rev is 2. so 2*10=20. now u got remainder as 1.
             so 20+1=21.
             21*10 = 210 . u got remainder 1. so 210+1 = 211. the number reversed.

             num/10 -- It is used to remove the last digit of the num to continue the process
             for remaining digits.
          */


        // method2 :

        StringBuilder sb = new StringBuilder(String.valueOf(num));
        StringBuilder strNum = sb.reverse();
        int rev = Integer.parseInt(strNum.toString());



        System.out.println("The reverse of the given number  is : "+rev);
    }
}
