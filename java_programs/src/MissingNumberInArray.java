import java.util.Arrays;
import java.util.OptionalInt;

public class MissingNumberInArray {
    public static void main(String[] args) {

        /*
           Note: Array should not have duplicates
                 It can be unsorted
         */

        int[] arr = {55,54,51,53,59,56,52,61,57,58};

        //1.Find the sum of elements given in the array

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of elements in Array: "+sum);

        //2.Find the min value.

//        int min = Arrays.stream(arr).min().orElse(Integer.MAX_VALUE); // 1st way

    /*

  .orElse(Integer.MAX_VALUE): This part of the code is used to handle the case where
  the array might be empty. If the array is empty, min() would return an empty OptionalInt.
  The orElse(Integer.MAX_VALUE) part specifies
  a default value (in this case, the maximum possible integer value) to be used if
  the stream is empty. It ensures that the code
  doesn't throw a NoSuchElementException if the array is empty.

     */
        // 2nd way

        int min = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min=arr[i];
            }
        }
        System.out.println("The minimum value is: "+min);

        //3.Find max value

//        int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);

        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        System.out.println("The maximum value is: "+max);

        //4.add elements from min to max

        int totalSum=0;

        for(int i=min;i<=max;i++){
            totalSum=totalSum+i;
        }
        System.out.println("The total sum: "+totalSum);

        //5.subtract sum from toalSum to find missing element

        int missingElement = totalSum-sum;
        System.out.println("The missing element is: "+missingElement);







    }
}
