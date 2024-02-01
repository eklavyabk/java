package map_demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    I want to find length of every element and then put those element in some other collection
 */
public class MapDemo2 {
    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("car","bike","bicycle","flight","train");

        List<Integer> vehiclesLength;

//        vehiclesLength = vehicles.stream().map(name->name.length()).collect(Collectors.toList());
//        System.out.println(vehiclesLength);

//        vehicles.stream().map(name->name.length()).forEach(name-> System.out.println(name));

        vehicles.stream().map(name->name.length()).forEach(System.out::println);


    }
}
