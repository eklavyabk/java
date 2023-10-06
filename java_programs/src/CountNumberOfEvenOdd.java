import java.util.Scanner;

public class CountNumberOfEvenOdd {
    public static void main(String[] args) {

        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        while(num!=0){
            int rem = num%10;
            if(rem%2 == 0){
                evenCount = evenCount+1;
            }else{
                oddCount=oddCount+1;
            }
            num=num/10;
        }

        System.out.println("The count of even numbers : "+evenCount);
        System.out.println("The count of odd numbers: "+oddCount);

    }
}
