package filter_demo;

/*
     In previous example, we had just one condition i.e n%2==0
     what if we have multiple condition, lets see
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {

        List<String> name = Arrays.asList("Brijesh","Amit","Sujit","Aryan","Yash","Chutki","Ramchandra");

        List<String> ls = new ArrayList<>();

//        ls = name.stream().filter(str->(str.length()>3 && str.length()<6)).collect(Collectors.toList());
//        System.out.println(ls);

        name.stream().filter(str->(str.length()>3 && str.length()<6)).forEach(System.out::println);

    }
}
