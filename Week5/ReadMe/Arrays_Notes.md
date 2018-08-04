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

## Generating A Random Number
* [Simple example to start off](https://github.com/Jay4stem/IntroToObjectOrientedDesign/blob/master/Week5/Simple_Random.java)
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


## In Class Assignment
* Using the scanner class, build into our guessing game a feature that will store user input.
* Using loops, build in a feature where the user is asked again until they guess correctly.
* Once guessed correctly have the user given the option to play again. (Thing about loops here too!)
* **Advanced:**  Using arrays, respond to the user’s input with warmer or cooler (using their last guess as a point to compare from.

##[Complete Random Code](https://github.com/Jay4stem/IntroToObjectOrientedDesign/blob/master/Week5/HighLow.java)
