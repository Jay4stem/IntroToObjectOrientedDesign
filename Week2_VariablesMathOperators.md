# Week 2: Variables, Math, Operators

![Variables](https://openresty.org/download/image/value-container.jpg)
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
    
    ![Integer Examples](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/ints.png)

  * **decimals** - is referred to a **"floating"** or a positive or negative number with a **decimal** point.
    * **float** - is 32 bits (4 Bytes)
    * **double** - is 64 bits (8 Bytes)
    
    ![Decimal Examples](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/dec.png)

  * **Boolean** - **true** or **false** values (1 bit)
  
    ![Boolean Examples](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/bool.png)

  * **char** - single **letters** and other keyboard **symbols**
    * **ALWAYS** uses single quotes **(')**
    
    ![Char Examples](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/char.png)

### Reference/Object Data Types
 * **String** - **text** values
   * **ALWAYS** starts with a **CAPITOL** "S".
   * **ALWAYS** uses **DOUBLE** quotes **(")**
   
   ![String Examples](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/string.png)

 * **class** - as a variable should always start with a **LOWERCASE** letter, while in its declaration it should always have an **UPPERCASE**.

### Strongly & Loosely Typed Languages
   * In **Strongly Typed Languages (Java)** once a variable is defined as a data type, it cannot be used to store another data type.
   * **Loosely Typed Languages (Javascript)** allows different types of data in the same variable (but not at the same time!)
   
     ![Strong Typed](https://pythonconquerstheuniverse.files.wordpress.com/2009/10/static_typing.png?w=640)

### Scope
   * How far a varable can reach
   * Defined by the **curly brackets {}**
   
     ![Scope](https://i-msdn.sec.s-msft.com/dynimg/IC506209.png)
 
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
  



