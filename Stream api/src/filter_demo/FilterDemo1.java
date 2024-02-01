package filter_demo;

/*

         Collection: To represent group of data/objects as single entity.
         Stream: To process the data from collection we use Streams concepts.

         filter() will filter the data based on condition.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterDemo1 {
    public static void main(String[] args) {
/*
        ArrayList<Integer> numList = new ArrayList<>();
        num.add(12);
        num.add(22);
        num.add(34);
        num.add(41);
        num.add(55);

 */

//        The same above thing can be written as:
        List<Integer> numList = Arrays.asList(12,22,34,41,55);

//        Empty collection for now
        List<Integer> evenNumList = new ArrayList<>();

//        filtering data without stream concept
        /*
        for (int n:numList) {
            if(n%2==0)
                evenNumList.add(n);
        }
        System.out.println(evenNumList);
         */

//        filtering data with stream concept
//        step1: add collection to stream()
//        step2: use filter() which takes predicate as a parameter
//               predicate is a functional interface that takes an argument and returns boolean value as output.
//        step3: once the data is filtered, it is collected using collect().
//        step4: and then it is added to another collection using Collectors.toList().
        /*
        evenNumList = numList.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumList);
         */

//        suppose after filtering, i dont want to store the data in another collection,
//        I just want to print it.
//        numList.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));

//        same above thing can also be written as
        numList.stream().filter(n->n%2==0).forEach(System.out::println);

    }
}
