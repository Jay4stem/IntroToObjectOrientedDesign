/**
 * Week 2: If Else Conditions
 */

// here is our class called "Conditions" it is able to be run by other programs and jre
public class Conditions {
    // the main method - the computer looks for this first!
    public static void main(String[] args){

        // declaring variables
        int firstNum = 17; // store as an int
        int secondNum = 17; // store as an int

        //See if the condition --> first number and second number are the same --> is met
        if(firstNum == secondNum){
            // execute if the condition is true --> the first and second number are the same
            System.out.println("The first number " + firstNum + " is equal to the second number " + secondNum);
        }
        // if the condition is not true...
        else {
            // execute if the condition is false --> the first and second number are not the same
            System.out.println("The first number " + firstNum + " is not equal to the second number " + secondNum);
        }
    }
}

