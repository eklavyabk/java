import java.util.Arrays;

public class SumOfElementsInArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3};  //Or new int[no.of elements]

//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;

       // approach1;

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);


        // approach2

//        int sum=0;
//        for (int element:arr) {
//            sum=sum+element;
//        }
//        System.out.println(sum);

        // approach3

//        System.out.println(Arrays.stream(arr).sum());

    }
}
