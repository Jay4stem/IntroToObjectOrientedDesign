/**
 * Week 3: Else If
 */

// here is our class called "Conditions2" it is able to be run by other programs and jre
public class Conditions2 {
    // the main method - the computer looks for this first
    public static void main(String[] args){

        // declaring variables
        int firstNum = 87; // store as an int
        int secondNum = 67; // store as an int

        //See if the condition --> first number is less than the second number --> is met
        if(firstNum < secondNum){
            // execute if the condition is true -->  first number is less than the second number
            System.out.println("The first number " + firstNum + " is less than the second number " + secondNum);
        }
        //See if the condition --> first number is greater than the second number --> is met
        else if(firstNum > secondNum){
            // execute if the condition is true --> first number is greater than the second number
            System.out.println("The first number " + firstNum + " is greater than the second number " + secondNum);
        }
        // if the other conditions are not true...
        else{
            // execute if all other conditions are false (the numbers are equal)
            System.out.println("The first number " + firstNum + " is equal to the second number " + secondNum);
        }
    }

}
