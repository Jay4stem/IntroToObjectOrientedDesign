/**
 * Week 2: Basic Math Operations
 */
import java.text.*; // import java class text so we can format the results

// here is our class called "MathOperators" it is able to be run by other programs and jre
public class MathOperators {
    // the main method - the computer looks for this first!
    public static void main(String[] args) {

        // declaring variables
        int firstNum = 35; // store as an int
        int secondNum = 27; // store as an int

        int sum = firstNum + secondNum; // store sum as int
        int difference = firstNum - secondNum; // store difference as int
        int product = firstNum * secondNum; // store product as int
        int quotient = firstNum / secondNum; // store quotient as int
        int remainder = firstNum % secondNum; // store remainter as int

        // print the results
        System.out.println("The sum of " + firstNum + " and " + secondNum + " is " + sum + ".");
        System.out.println("You will get " + difference + " if you subtract " + secondNum + " from " + firstNum + ".");
        System.out.println("The product of " + firstNum + " and " + secondNum + " is " + product + ".");

        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("The quotient of " + firstNum + " / " + secondNum + " is " + quotient);
        System.out.println("The remainder of " + firstNum + " / " + secondNum + " is " + remainder);
        System.out.println("Add 1 to " + firstNum + " (increment) to get " + (++firstNum) + ".");
        System.out.println("Subtract 1 from " + secondNum + " (decrement) to get " + (--secondNum) + ".");
    }
}
