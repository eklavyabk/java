import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
//        System.out.print("Enter your number: ");
//        Scanner sc = new Scanner(System.in);
        int num = 50;
        if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " not a prime number");
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
