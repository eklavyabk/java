package map_demo;

/*
    In this, we will combine filter and map method

    First we will filter the data and then apply map on filtered data and then collect it.
    i.e collection-->stream-->filter-->map-->collect

 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int empId;
    String empName;
    int empSalary;

    public Employee(int empId, String empName, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }
}
public class MapDemo4 {
    public static void main(String[] args) {

//        List<Employee> employeeList = new ArrayList<>();
//
//        employeeList.add(new Employee(1,"Brijesh",50000 ));
//        employeeList.add(new Employee(2,"Sujit",1000000 ));
//        employeeList.add(new Employee(3,"Aryan",2000000));
//        employeeList.add(new Employee(4,"Yash",3000000 ));
//        employeeList.add(new Employee(5,"Cutki",4000000 ));

//        Same above thing can be directly written as:

        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"Brijesh",50000 ),
                new Employee(2,"Sujit",1000000 ),
                new Employee(3,"Aryan",2000000),
                new Employee(4,"Yash",3000000 ),
                new Employee(5,"Cutki",4000000 )
        );

        List<Integer> filteredEmployee = employeeList.stream()
                .filter(s->s.empSalary>50000)
                .map(e->e.empSalary)
                .collect(Collectors.toList());

        System.out.println(filteredEmployee);

//        Note: Map takes function interface as parameter
//              function interface takes two arguments i.e object type and return type
//              Here, List<Integer> filteredEmployee -- Integer is our return type





    }
}
