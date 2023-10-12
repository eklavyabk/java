public class PrintEvenOddFromArrays {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,0};

        // approach1

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+"-Even ");
            }else{
                System.out.print(arr[i]+"-Odd ");
            }
        }

        //approach2

//        System.out.print("Even Numbers: ");
//        for (int element:arr) {
//            if(arr[element]%2 == 0){
//                System.out.print(arr[element]+" ");
//            }
//        }
//        System.out.println();
//        System.out.print("Odd Numbers: ");
//        for (int element:arr) {
//            if(arr[element]%2 != 0){
//                System.out.print(arr[element]+" ");
//            }
//        }

    }
}
