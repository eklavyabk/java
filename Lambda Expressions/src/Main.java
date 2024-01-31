
/*
    What is lambda expressions?
    Lambda expressions are anonymous functions which is used to make our code more concise and compact.

    Anonymous functions?
    A function with no name,no return-type, and no access modifier is known as anonymous function.

    refer youtube : sdet-qa  lambda expressions videos.

   Note: Lambda expressions and interfaces are interconnected.
         Lambda expressions can be invoked by Functional Interfaces only.
         ie an interface with only one abstract method.
 */

//------------------------------------------------------------------------------------------------------------

/*

interface Learn{
    void study();
}

class Student implements Learn{
    @Override
    public void study() {
        System.out.println("gain knowledge");
    }
}

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.study();

        }
    }

 */

//------------------------------------------------------------------------------------------------------------

// The same above thing can be written with lambda expressions as follows:

/*

interface Learn{
    void study();
}

public class Main {
    public static void main(String[] args) {

        // we can use super class reference to refer to a subclass object
        Learn student1 = () -> System.out.println("gain knowledge");

        student1.study();

    }
}

 */


//------------------------------------------------------------------------------------------------------------
/*
interface Learn{
    String study();
}

public class Main {
    public static void main(String[] args) {

        // u can use return statement with curly braces only
//        Learn student1 = () -> {return ("gain knowledge");};
        // if there is only 1 statement than u can remove curly braces and return keyword.
        Learn student1 = () -> "gain knowledge";

        System.out.println(student1.study());


    }
}

 */

//------------------------------------------------------------------------------------------------------------
/*

interface Learn{
    String study(String sub1,String sub2);
}


public class Main {
    public static void main(String[] args) {
       // curly braces are used here because there are 2 statements.
        Learn student1 = (sub1,sub2) -> {
            System.out.println("Welcome to school");
            return ("Your subjects are "+sub1+" and "+sub2);
        };

        System.out.println(student1.study("Scence","Math"));



    }
}

 */