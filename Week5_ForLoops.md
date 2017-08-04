# Week 5: For Loops & Methods

![loops](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/loops.png)

## For Loops
* A **for** loop iterates over a range of values.
* The syntax of a for loop is as follows:
```java
   for (initialization; termination; increment) {
      statement(s)
   }
```
   * **initialization** initializes the loop. It is only executed once, when the loop begins.
   * **termination** sets the limit for the loop to end.
   * **increment** adds to the value after each time through the loop (or iteration). It can also be a decrement.
* The variable that controls a for statement (i) should be declared within the initialization expression, when able to limit their life span and reduce errors. Usually these variables take the names i, j, and k.
* Below is an example of how to count to 10 using a for loop:
```java
   class ForCount {
      public static void main(String[] args){
         for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
         }
      }
   }

```
* Three expressions are optional. To create an **infinite loop** use the following:
```java
// infinite loop
   for ( ; ; ) {
      // your code goes here
   }
```
* **For** Loops are great for executing actions for each item in an **arrays** or collections. This is sometimes referred to as an **enhanced for loop** or a **for each**.
* Below is an example of using an enhanced for loop to count to 10:
```java
   class EnhancedForCount {
      public static void main(String[] args){
         int[] numbers =
             {1,2,3,4,5,6,7,8,9,10};
         for (int item : numbers) {
             System.out.println("Count is: " + item);
         }
      }
   }
```

## In Class Assignment
* Write a java class that computes the a designated amount of numbers in the Fibonacci sequence.
* Write a java class that asks the user to guess a color that the computer randomly chooses from an array. 
* Add in the same feature from the number guessing game.
* **Advanced:**  Write a program using the for loop that prints your moon weight for the next 15 years, assuming you gain a kilo every year. 







