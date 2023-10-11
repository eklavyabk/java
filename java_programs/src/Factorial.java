public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int fact=1;

        // approach1:

//        for(int i=1;i<=num;i++){
//            if(num==0){
//                System.out.println(1);
//                break;
//            }
//            fact=fact*i;
//        }

        //approach2:

        while(num>=1){
            fact=fact*num;
            num=num-1;
        }


        System.out.println("The factorial of given number is "+fact);
    }
}
