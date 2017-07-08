/**
 * Week 2: Scope
 */

// here is our class called "Scope" it is able to be run by other programs and jre
public class Scope {
    // the main method - the computer looks for this first!
    public static void main(String[] args) {
        // {
            // declaring variables
            int firstNum = 15; // store as an int
            int secondNum = 25; // store as an int
            int sum = firstNum + secondNum; //calculates the sum and stores as an int

            System.out.println("The sum is " + sum); // print the sum
        // }
        // {
            int product = firstNum * secondNum; //calculates the product and store it as an int

            System.out.println("The product is " + product); // print the product
        }

}

// Error:(23, 2) java: reached end of file while parsing