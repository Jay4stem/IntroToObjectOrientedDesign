/**
 * Week 4: While Loops
 */

// here is our class called "DoWhileCount" it is able to be run by other programs and jre
public class DoWhileCount {
      // the main method - the computer looks for this first!
      public static void main(String[] args){
         // declaring variables
         int count = 1;

         // Do this...
         do {
            // print out what count is equal too
            System.out.println("Count is: " + count);

            // after we print add one to count
            count++;

         // while count is less then 11 go back to the do
         } while (count < 11);
      }
   }
