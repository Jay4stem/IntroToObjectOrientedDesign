# Conditional (Control Flow) Statements

![Conditionals](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/conditionals.png)

## If Statement
  * The **if** statement checks if something is **true** or **false**.
  * The result of the if will either run a piece of code, or will skip past it to the else code.
  * We can use **relational, logical & conditional operators** to compare values with in these conditions. 
  * Here is the syntax of a conditional statement using **if**:
  ```java
  if (condition1){
    statements that are to be executed if condition1 is satisfied
  }else{
    statements that are to be executed if condition1 is not satisfied
  } 
  ```
  
  ![If Example](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/if.jpg)
  
## Else If
  * There can be multiple conditions within an **if** statement, these use **else if** and use this syntax:
  ```java
  if (condition1){
    statements that are to be executed if condition1 is satisfied
  } else if(condition2){
    statements that are to be executed if condition2 is satisfied and condition1 is not satisfied
  } else if(condition3){
    statements that are to be executed if condition3 is satisfied and condition1 and condition2 are not satisfied
  }else {
    statements that are to be executed if none of the above conditions are true
  } 
  ```
  
  ![If Else Example](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/ifelseif.gif)
  * The conditions will be checked in the same order the are written in. 
  * There can be as many conditions as you would like to code. 
  * The computer will only reach the else statement if non of the other conditions listed are met. 

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

## Loop Control Statements

## Methods
* Methods allow code to be reusable, readable, structured & organized. This stops us from having crazy code fingers!
* **Calling** a method means we execute the code within it.
* The syntax for a method is as follows:
```java
visibility static/instance returnType methodName (parameter1, parameter2, ...){
   lines of code
}
```
* An example of how a method to calculate the sum of two numbers would be written as follows:
```java
public static int calculateSum(int first,int second){
   int sum =  first + second;
   return sum;
}
```
* All methods have two parts a **method header** and a **method body**.
* The method body holds the lines of code that "do" something.
* The method header gives basic information about the method.
   * The first part of the header is an **access modifier**. This part decides whether other classes can use a class or the members of a class. The four main types of modifiers are:
      * Private - accessed only within a private group
      * Public - accessed not only within a class, but also from outside
      * Default - accessed only within a specific package
      * Protected - accessible to a class and its subclasses
   * The next portion tells the computer if the method will be **static** or **instance**.
      * A static method can be called without creating an object of the class (just like the Math.random() and System.out.println() methods we used!).
      * An instance method needs the creation of an instance in order to run the method (just like the scanner object methods we used!).
   * After the type of method the return value datatype is added. Use **void** if there is no return value.
   * The return value is followed by the method name. Make sure to use camalCase if needed.
   * Finally inside the parenthesis are the parameters, or variables, we will be using within the method. This allows us to pass the variables through the method without declaring them inside it.


## Generating A Random Number
* Before we can generate a random number, first we need to create a variable to store the value in. 
* The number we want to generate will be a **whole number** between 1 and 100, this variable should be declared as an **int**.
* To generate a random number it requires the use of the **Math** class that is built into Java.
* Within the **Math** Class the method **Math.random()** generates a random decimal number between 0.0 and 1.0. 
* Because our game requires a random whole number to be generated, we need to convert this decimal into a number between 1 and 100. We can do this by multipling the decimal generated by 100.  
* By doing this the number will range from 0.0 to 99.9 Storing it as an int, the number after the decimal point will drop. To ensure the number is never 0 and reaches 100, we will add 1. 
* **(int)** is added before our random function to **cast** , or change, the decimal number as an integer. 
* This statement should read as the following:

![math.random()](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/mathRandom.png)

* Add a **println** to ensure your number generator is running correctly. This program should print out a different number each time it is run. 

![math.random() result](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/mathRandomResult.png)
