package map_demo;

/*
    I want to multiply every value in collection by 3 and store them in some other collection
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(9,5,8,2,7,6);

        List<Integer> numbersMultiplied;

//        numbersMultiplied = numbers.stream().map(num->num*3).collect(Collectors.toList());
//        System.out.println(numbersMultiplied);

        numbers.stream().map(num->num*3).forEach(System.out::println);
    }
}
