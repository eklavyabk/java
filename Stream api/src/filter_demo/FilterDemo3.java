package filter_demo;

/*
    suppose in my collection I have some data and it also contains some null values
    what i'll do here is I'll remove the null values and then will store the data in some other collection
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("water",null,"air",null,"tree","bird",null,"bike");
        
        List<String> filterWords = words.stream().filter(str->str!=null).collect(Collectors.toList());
        System.out.println(filterWords);

    }
}
