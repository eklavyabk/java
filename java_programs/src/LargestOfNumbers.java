public class LargestOfNumbers {
    public static void main(String[] args) {

        int a = 3;
        int b = 7;
        int c = 4;

        //approach1

//        if(num1>num2 && num1>num3){
//            System.out.println(num1);
//        } else if (num2>num1 && num2>num3) {
//            System.out.println(num2);
//        }else{
//            System.out.println(num3);
//        }

        //approach2 using ternary operator

        int largestNum = a>b?a:b;
        int largestNum2 = largestNum>c?largestNum:c;
        System.out.println("The largest Number is: "+largestNum2);
    }
}
