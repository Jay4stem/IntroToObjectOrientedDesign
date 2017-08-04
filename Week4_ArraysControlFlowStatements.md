## Arrays & Control Flow Statements

![array](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/array.png)

## Advanced: Arrays
* **Arrays** are objects that hold multiple values of the same data type.
* Arrays are marked by placing **square brackets** after the variable name, or data type like this:
```java
  int[] arrayRefVar;   // preferred way.

  String arrayRefVar[];  // works but not preferred way.
```
* Each item in the array has its own **index (or position number)**. The index always starts at zero.
* Create an instance of an array like this:
```java
  players = new String [4];
```
* The size of an array must be declared before assigning any values. If you do not know how many valuables you will be storing you cannot us an array.
* The items in the array can be assigned individually by using the index number like this:
```java
  players[1] = "Daniel";
```

![index](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/index.png)

* All arrays have an attribute called **length**, Like other languages, such as python, this will return the amount of items in the array.
```java
  int totalPlayers = players.length;
```
* Arrays can be declared and initialized in one line of code, like this:
```java
  String [] players = {"David", "Daniel", "Anna", "Gregory"}
```
* Similar to assigning the items in the array individually, they can also be used in code using the index number.
```java
  String theWinner = players[1];
      System.out.println("Congratulations, " + theWinner + "!");
```
* These arrays are considered **one-dimensional**. This simply means they are essentially a list of variables. There are also **multi-diensonal** arrays that are more complex.


## Storing User Input
* To accept keyboard input from the user, additional Java capabilities from a **utilities** package.
* **Libraries** and **packages** are sets of code that someone else has created. To use these capabilities the packages need to be **imported**.
* The class **Scanner** that is part of the **java.util** utilities package, provides several useful functions for working with keyboard input.
* To import the **Scanner** class within this utility package, use the following line of code:
```java
  import java.util.Scanner;
```
* This line of code gets added before we do anything else, even before we define our class. This is so that the computer imports this package before looking for anything else within the program.
* In order to use the methods in this class for input first we need to store an **instance (object)** of the class in a variable that pulls input from the keyboard,**System.in** like this:
```java
  Scanner scan = new Scanner(System.in);
```
* Once an instance is created, methods within the class can be called.
* **nextLine()** will accept the next line of string data input from the keyboard
* **nextInt()** will accept the next line of string data and turn the text input from the keyboard into an integer number
* To store this data as a variable first, it needs to be **declared** as an **int**. This variable can be set as equal to 0.
* Then a message need to be displayed to prompt the user to "guess" a number between 1 and 100. We do this by using the same **println()** method from the **System** class that was used in HelloWorld.
* Now that the user knows what kind of input the program is expecting from them, the keyboard needs to be checked for input. To do this we call the **nextInt()** method of our Scanner instance by using **dot notation** and store it in the variable created for user input, like this:
```java
  System.out.println("Guess a number between 1 and 100:");
  guess = scan.nextInt();
```
* Add a **println** to ensure your the program is running correctly. This program should print out the same number that the user input.


## Loops
* **Loops** are statements that execute a statement or group of statements multiple times.
* There are three types of loops:
  * The **while** loop repeats a statement (or group of statements) while a given condition is true. It also tests the condition before running the statments witin the loop body.
  * The **for** loop runs a sequence of statements a set number of times, iteratively.
  * The **do** **while** loop is similar to a **while** loop, but it tests the condition at the end of the loop body.
* Statements that can change the sequence of the loop, are known as **loop control statements**. These statements are:
  * The **break** statement will terminate the loop or (just like the switch statement).  It will break out of the loop and run the code immediately following the loop (or switch).
  * The **continue** statement will cause the loop to skip the remainder of its body. It will retest the condition prior before re-running the code.

![loops](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/loops.png)

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
* Using the scanner class, build into our guessing game a feature that will store user input.
* Using loops, build in a feature where the user is asked again until they guess correctly.
* Once guessed correctly have the user given the option to play again. (Thing about loops here too!)
* **Advanced:**  Using arrays, respond to the user’s input with warmer or cooler (using their last guess as a point to compare from.


## Vocabulary
* Array
* Index
* one-dimensional array
* multi-dimensional array
* loops
* loop control statements
* break
* continue


## Keywords
* length
* for
* while
* do
* break
* continue



