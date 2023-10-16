public class LinearSearch {
    public static void main(String[] args) {

        //Linear Search or sequential search

        int[] arr = {5,6,33,45,98,100,23,55};

        int searchNum=33;

        boolean flag = false;
        int index=-1;

        for (int element :arr) {
            index=index+1;
            if(element==searchNum){
                System.out.println("Element Found at index "+index);
                flag=true;
            }
        }
        if (!flag) {
            System.out.println("Element not found ");
        }


    }
}
