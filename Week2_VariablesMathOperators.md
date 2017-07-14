# Week 2: Variables, Math, Operators

## Variables
* Variables allow us to store information.
* Names for Variable should always start with a **LOWERCASE** letter.
* Variable names can include and start with the **dollar sign ($)** or **underscore (_)**, but cannot contain spaces. 
* Different types of information (text, number, decimal number, character, and true/false values) are stored in different locations
 are stored in different locations.  
* There are two types of variables:
  * Primitive Data Types
  * Reference/Object Data Types  
  
### Primitive Data Types
* **Primitive Data Types** are data types that are already built into Java.
  * **integers** - is a positive or negative number **without** any decimal place
    * byte -  values from **-128** to **127** (8 bits)
    * short - values from **-32,768** to **32,767** 
    * int - values from **-2,147,483,648** to **2,147,483,648** (4 Bytes)
    * long - really **LARGE** values (8 Bytes)
[Integer Examples]: ints.png
  * **decimals** - is referred to a **"floating"** or a positive or negative number with a **decimal** point.
    * **float** - is 32 bits (4 Bytes)
    * **double** - is 64 bits (8 Bytes)
[Decimal Examples]: dec.png
  * **Boolean** - **true** or **false** values (1 bit)
[Boolean Examples]: bool.png
  * **char** - single **letters** and other keyboard **symbols**
    * **ALWAYS** uses single quotes **(')**
[Char Examples]: char.png

### Reference/Object Data Types
 * **String** - **text** values
   * **ALWAYS** starts with a **CAPITOL** "S".
   * **ALWAYS** uses **DOUBLE** quotes **(")**
[String Examples]: string.png
 * **class** - as a variable should always start with a **LOWERCASE** letter, while in its declaration it should always have an **UPPERCASE**.

### Strongly & Loosely Typed Languages
   * In **Strongly Typed Languages (Java)** once a variable is defined as a data type, it cannot be used to store another data type.
   * **Loosely Typed Languages (Javascript)** allows different types of data in the same variable (but not at the same time!)

### Scope
   * How far a varable can reach
   * Defined by the **curly brackets {}**
 
## Math & Operators
### **Arithmetic Operators** - Used operators for basic math
  * **+** : Addition 
  * **-** : Subtraction 
  * **/** : Division 
  * ** * ** : Multipulcation
  * **=** : Equals
  * **%** : Remainder from Division
  * **++** : Increment by 1
  * **--** : Decrease by 1  
### Relational Operators - Used to compare two values
  * **<** : Less Than
  * **>** : Greater Than
  * **!=** : Not Equal To
  * **==** : Equal To
  * **<=** : Less Than or Equal To
  * **>=** : Greater Than or Equal To
### Logical Operators - Used to check conditions
  * **&&** : And
  * **||** : Or
  * **!** : Not
  
## Conditional (Control Flow) Statements
### If Statement
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
### Else If
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
  * The conditions will be checked in the same order the are written in. 
  * There can be as many conditions as you would like to code. 
  * The computer will only reach the else statement if non of the other conditions listed are met. 
  
### Switch
  * Can sometimes be used as an alternative to **if**.
  * It evaluates the keyword after **switch** and the program only follows on if the cases.
  * The keyword **break** is used at the end of each case statement to make the code jump out of the switch, if you do not do this, the program will just continue to read through.
  * Here is a sample of its syntax:
  ```java
  switch (yourGrade){

   case 'A':
     System.out.println("Excellent Job!");
     break;
   case 'B':
     System.out.println("Good Job!");
     break;
   case 'C':
     System.out.println("Need to work more!");
     break;
   case 'D':
     System.out.println("Change your attitude!");
   break;
 }
 ```
 



