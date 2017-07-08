/**
 * Week 2: Mixing Data Types
 */

// here is our class called "StrongType" it is able to be run by other programs and jre
public class StrongType {
    // the main method - the computer looks for this first!
    public static void main(String[] args) {

        // declaring variables
        int myVal = 29; // store as int data type

        // use method println from java's system class to print
        System.out.println("The integer value is " + myVal);

        //myVal = "My Value"; // now store a string value in the myVal variable

        System.out.println("The modified value is " + myVal);
    }
}

/**
 * Error:(17, 17) java: incompatible types: java.lang.String cannot be converted to int
 **/