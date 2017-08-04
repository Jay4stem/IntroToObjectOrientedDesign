/**
 * Week 4: Guessing Game
 */

// import the Scanner Object from the utility package.
import java.util.Scanner;

// here is our class called "HighLow" it is able to be run by other programs and jre
public class HighLow {
   // the main method - the computer looks for this first!
   public static void main(String[] args) {
      // Create an instance of the Scanner object so we can call its methods for input
    	Scanner scan = new Scanner(System.in);
 		// Create a random number for the user to guess
      // Use (int) to ensure the number is a whole number
      // Use Math.Random to return a decimal between 0.0 and 1.0
      // Multiply the decimal by 100 to move the decimal two places and makes a number 0 and 99.9
      // Add one to ensure the number is between 1 and 100, and never 0.
      int theNumber = (int)(Math.random() * 100 + 1);
      // Print theNumber to ensure the code works
      //System.out.println( theNumber );

      // Initialize the guess variable
 		int guess = 0;
         // Repeat these steps while the guess does not match the random number generated.
      	while (guess != theNumber){
            // Print instructions to guess a number
            System.out.println("Guess a number between 1 and 100:");

            // store user input as an int
            // updating the guess variable we initialized earlier
            guess = scan.nextInt();

            // If the guessed number is lower then the random number
            if (guess < theNumber){
               // Print too low
               System.out.println(guess + " is too low. Try again.");
            // If the guessed number is too high
            }else if (guess > theNumber){
               // Print too high
               System.out.println(guess + " is too high. Try again.");
            // If both of these conditions are not met, the number must match
            }else{
               // Print out correct!
               System.out.println(guess + " is correct. You win!");
            }
		} // End of while loop for guessing

   // We won't take any more input now.
   scan.close();
	}
}
