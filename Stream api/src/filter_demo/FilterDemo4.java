package filter_demo;

/*
    In the collection if I store some objects, then how can we process by using filter method.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    double price;

    public Product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}

public class FilterDemo4 {
    public static void main(String[] args) {

        // For storing Product type of object into this list
        List<Product> productList = new ArrayList<>();

        /*
        Product product1 = new Product(1,"Fan",1200);
        Product product2 = new Product(2,"TV",10000));
        Product product3 = new Product(3,"Cooler",7000));
        Product product4 = new Product(4,"Heater",1500));
        Product product5 = new Product(5,"Table",900));

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        */

//      The same above thing can be written as
        productList.add(new Product(1,"Fan",1200));
        productList.add(new Product(2,"TV",10000));
        productList.add(new Product(3,"Cooler",7000));
        productList.add(new Product(4,"Heater",1500));
        productList.add(new Product(5,"Table",900));

//        Note:when dealing with class dont use this.
//        List<Product> ls = productList.stream().filter(pr -> pr.price>1000).collect(Collectors.toList());
//        System.out.println(ls);
//        productList.stream().filter(pr -> pr.price>9500).forEach(System.out::println);

//      use this
        productList.stream().filter(pr -> pr.price>1000).forEach(pr-> System.out.println(pr.name));



    }
}
