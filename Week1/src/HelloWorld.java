/**
 * Week 1: Hello World!
 * version 1
 */

/** to create a class we use the following structure:
 *  Access (public) class (Tell the computer we are naming a class) className (This will be the name of your file too!) {
 *      remember to include the brackets (sandwiches need buns!)
 *  }
 */

public class HelloWorld{ // this line tells the computer hey! we are making a public class called HelloWorld

    public static void main(String[] args){ // This is the main method of the class HelloWorld.
        /**
         * To break this line down further:
         * public - is the access level, public allows other classes access this code. (We will talk about the other access levels later)
         * static - means that we do not have to create an instance of the class. (We will get into this when we talk about objects in more depth)
         * void - this function/method will not return any data
         * main - is the method name
         * (String[] args) - these are the parameters that are passed. This is information that we pass through the method to use within the method.
         */

        System.out.println("Hello World!"); // This is our action item in the main method. It prints out "Hello World!" in the console.
        /**
         * To break this line down further:
         * System - is a class within Java
         * out - is a variable within the System class
         * println() - is a method within the System class
         * "Hello World!" - is the parameter we are passing through the println method.
         * DON'T Forget!!! All statements in Java need to end with a semi-colon (;).
         */

    }
}

