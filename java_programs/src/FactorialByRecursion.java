import java.util.Scanner;

public class FactorialByRecursion {
    public static void main(String[] args) {
        System.out.print("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int facto=factorial(num);

        System.out.println("The factorial of "+num+" is "+facto);
    }

     static int factorial(int num) {
        if(num<=1){
            return 1;
        }
        return num*factorial(num-1);

        //for explanation refer codeitup recursion factorial python
    }
}
