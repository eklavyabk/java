package map_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
     map(): It transforms the data/objects i.e it will perform some operations on each element
     and result will be stored in some another collection or we can use it for some other purpose.
 */
public class MapDemo1 {
    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("car","bike","bicycle","flight","train");

        List<String> vehiclesUpperCase;

//   I'll convert all the vehicles name in upper case and store them in another collection

       vehiclesUpperCase = vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(vehiclesUpperCase);

    }
}
