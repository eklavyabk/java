import java.util.Arrays;

public class CheckArraysEquals {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,8,3,4,5};

        //approach1

//        boolean status = Arrays.equals(arr1,arr2);
//        System.out.println(status);




        //approach2

        //first check length. if equals then only proceed further

        boolean status = true;

        if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length;i++){
                if(arr1[i] != arr2[i]){
                    status=false;
                    break;
                }
            }
        }else{
            status=false;
        }

        if(status){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }

// the break statement is used to terminate the loop or switch statement.
// When a break statement is encountered inside a loop or a switch,
// the control immediately exits the loop or switch,
// and the program continues executing the next statement after the loop or switch.




//        boolean status = true;
//
//        if(arr1.length==arr2.length){
//            for(int i=0;i<arr1.length;i++){
//                if(arr1[i]!=arr2[i]){
//                    System.out.println("Arrays are not equal");
//                    status=false;
//                    break;
//                }
//            }
//            if(status) {
//                System.out.println("Arrays are equal");
//            }
//
//        }else{
//            System.out.println("Arrays are not equal");
//        }


    }
}
