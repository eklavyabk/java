import java.util.HashSet;

public class DuplicateElementsInArray {
    public static void main(String[] args) {

        //Approach1

//        int[] arr = {1,4,3,2,7,3};

//        boolean flag = false;
//
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    System.out.println("Duplicate element found: "+arr[i]);
//                    flag=true;
//                    break;
//                }
//            }
//        }
//        if(!flag){
//            System.out.println("No duplicate elements");
//        }

        //Approach2: HashSet

        int[] arr = {1,4,3,2,2,7};

        HashSet<Integer> ha = new HashSet<>();

        //Note: if element gets added succesfully,it returns true if u sout

        boolean flag = false;

       for(int i=0;i<arr.length;i++){
           if(!ha.add(arr[i])){
               System.out.println("Duplicate element found: "+arr[i]);
               flag=true;
               break;
           }
       }
       if(!flag){
           System.out.println("No duplicate elements");
       }

    }
}
