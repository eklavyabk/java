import java.util.Random;

public class GenerateRandomChar {
    public static void main(String[] args) {

        // Approach1

//        String letters = "abcdefghijklmnopqrstuvwxyz";
//        Random random = new Random();
//        int len = letters.length();
//
//        char randomChar = letters.charAt(random.nextInt(len));
//        System.out.println(randomChar);

        // Approach2

//    step1:    Math.random();                 generate decimal number between 0 and 1
//    step2:    Math.random()*26;              bcoz 26 alphabet number
//    step3:    (int)(Math.random()*26);       to cut out the decimal part and obtain whole number
//    step4:    (int)(Math.random()*26+65)     65 ie A. so 65 + whole number =new Number
//        This new number is then coverted into char.

        int randomNumber = (int) (Math.random() * 26);
        int alphabetNo = randomNumber+65;
        char randomChar = (char)(alphabetNo);
        System.out.println(randomChar);

//        System.out.println((char)(Math.random()*26+97));  // the same above thing in one line

/*

        Math.random(): This function generates a random decimal number between 0 (inclusive) and 1 (exclusive).
        For example, it might generate something like 0.652345.

        Math.random() * 26: This multiplies the random decimal by 26.
        In our example, if Math.random() is 0.652345, 0.652345 * 26 would be approximately 16.95.

        (int)(Math.random() * 26): The int part truncates the decimal,
        leaving you with a whole number between 0 and 25. In our example, this would be 16.

        (int)(Math.random() * 26 + 97): The + 97 part shifts the range from 0-25 to 97-122 in the ASCII table.
         ASCII values 97 to 122 represent lowercase letters 'a' to 'z'. So, if you add 97 to our example (16), you get 113, which is the ASCII code for the letter 'q'.

        (char)(Math.random() * 26 + 97): Finally, the (char) part converts the ASCII code back to its
        corresponding character. In our example, the ASCII code 113 corresponds to the letter 'q'.


 */
    }
}


