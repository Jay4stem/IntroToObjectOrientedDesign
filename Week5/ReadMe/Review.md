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



