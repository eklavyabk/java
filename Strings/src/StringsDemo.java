import java.sql.SQLOutput;

public class StringsDemo {
    public static void main(String[] args) {

        /*
            String pool is a separate section inside heap memory
         */

        String a = "bk";  // it will be created in string pool inside heap memory
        String b = "bk";  // it will check in string pool if there is an object with same name
                          // if yes it will point to same object
        String c = "bkk";  // it will be created in string pool

        System.out.println(a==b); // it will return true , bcoz == checks if the refernce variable
                                  // is pointing to the same object or not.

        String str = new String("bk");
        /*
        This will create a new String object and store it in heap memory outside of string pool
         */
        System.out.println(a==str); // it will return false bcoz both the reference variable are pointing
                                    // to different objects.
        System.out.println(a.equals(str));
        /*
               This will return true, bcoz .equals() checks whether the content of objects is same or not
         */




        //why do we need StringBuilder or StringBuffer?

        String s = "a";
        String t = s + "b";
        String u = t + "c";
        String v = u + "d";
        String k = t.concat(u);

        System.out.println(s);
        System.out.println(t);
        System.out.println(u);
        System.out.println(v);
        System.out.println(k);

        /*
           so in the above example each time a we concat ,a new object is being created
           we are not able to modify the same object
           because strings are immutable.
           Hence StringBuilder came into picture.
         */

        StringBuilder sb = new StringBuilder("Ram");
        sb.append("-Sita");
        sb.append("-Laxman");

        System.out.println(sb); // so here the same object has been modified
        // we are not creating a new object each time we append something
        // it saves us from unnecessary memory wastage

        System.out.println(sb.substring(4,sb.length()));








    }
}
