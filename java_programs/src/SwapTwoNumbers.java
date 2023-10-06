public class SwapTwoNumbers {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;

        System.out.println("Before Swapping a: "+a +",b: "+b);

        // method1: using third variable


//        int temp = a;
//        a = b;
//        b = temp ;
//

        // method2: without using third variable

//        a = a + b;   // Total : a+b which is assigned to a
//        b = a - b;  // b : Total-value of b will give us value of a which is assigned to b
//        a = a - b;  // a : Total-value of b ie (a)bcoz b contain a value. will give us value of b assign to a

        System.out.println("After Swapping a: "+a +",b: "+b);


    }
}
