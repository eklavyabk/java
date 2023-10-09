public class FibonacciSeriesRecursion {
    public static void main(String[] args) {
        //       first fibonacci number
        //       ^
        // 0     1       1       2       3       5       8   // These are first 7 fibonnaci numbers
        // ^                                             ^
        // 0th fibonaaci number                          6th fibonacci number


     int ans=fibo(6);
     System.out.println(ans);

    }

     static int fibo(int n) {
        //base condition
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);

    }
}
