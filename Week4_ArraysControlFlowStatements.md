## Arrays & More Control Flow
## Arrays
* **Arrays** are objects that hold multiple values of the same data type.
* Arrays are marked by placing **square brackets** after the variable name, or data type like this:

* Each item in the array has its own **index (or position number)**. The index always starts at zero.
* Create an instance of an array like this:

* The size of an array must be declared before assigning any values. If you do not know how many valuables you will be storing you cannot us an array.
* The items in the array can be assigned individually by using the index number like this:

* All arrays have an attribute called **length**, Like other languages, such as python, this will return the amount of items in the array.

* Arrays can be declared and initialized in one line of code, like this:

* Similar to assigning the items in the array individually, they can also be used in code using the index number.

* These arrays are considered **one-dimensional**. This simply means they are essentially a list of variables. There are also **multi-diensonal** arrays that are more complex.

## Loops
* **Loops** are statements that execute a statement or group of statements multiple times.
* There are three types of loops:
  * The **while** loop repeats a statement (or group of statements) while a given condition is true. It also tests the condition before running the statments witin the loop body.
  * The **for** loop runs a sequence of statements a set number of times, iteratively.
  * The **do** **while** loop is similar to a **while** loop, but it tests the condition at the end of the loop body.
* Statements that can change the sequence of the loop, are known as **loop control statements**. These statements are:
  * The **break** statement will terminate the loop or (just like the switch statement).  It will break out of the loop and run the code immediately following the loop (or switch).
  * The **continue** statement will cause the loop to skip the remainder of its body. It will retest the condition prior before re-running the code.

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

## While
* The **while** statement will continually run its contents as long as it's condition is true.
* The syntax of a while loop is as follows:
```java
   while (expression) {
      statement(s)
   }
```
* First, the loop evaluates expression. This expression must return a boolean value (true or false).
* Only if this is true, will the computer executes the contents of the loop. It will continue running, re-evaluating on each loop, until it returns false.
* Below is an example of how to count to 10 using a while loop:
```java
   class WhileCount {
      public static void main(String[] args){
         int count = 1;
         while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
         }
      }
   }
```
* Similar to the for loop, the while loop can also be infinite. Create an infinite while loop like this:
```java
   while (true){
      // your code goes here
   }
```

## Do While
* The **Do/While** loop is expressed like this:
```java
   do {
      statement(s)
   } while (expression);
```
* The only difference between a while and a do/while statement is that the do-while evaluates its expression at the bottom of the loop instead of the top.
* The statements within the do block will always executed at least once.
* Below is an example of how to count to 10 using a do/while loop:
```java
   class DoWhileCount {
      public static void main(String[] args){
         int count = 1;
         do {
            System.out.println("Count is: " + count);
            count++;
         } while (count < 11);
      }
   }
```

## In Class Assignment

## Vocabulary

## Keywords

