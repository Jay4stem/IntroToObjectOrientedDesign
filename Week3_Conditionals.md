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
  
  ![If Example] (https://cdn.programiz.com/sites/tutorial2program/files/how-if-else-works-java.jpg)
  
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
  
  ![If Else Example] (https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwirzdqqq4zVAhVM0oMKHTFADUkQjRwIBw&url=http%3A%2F%2Fwww.homeandlearn.co.uk%2Fjava%2Fjava_if_else_statements.html&psig=AFQjCNHOu83GfixDx_SD6LxYytxAu2HqGA&ust=1500244207088362)
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
 ![Switch Example](http://www.homeandlearn.co.uk/java/images/con_logic/switch_statement.gif)
 
