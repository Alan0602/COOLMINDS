## 1.SquareOfAsterisks
#### Question: 1. 
  Write a program that reads a value from the input (system) and prints a square of value x value asterisks (*) in the output window as long as the value is between 1 and 5.


#### CODE: [View code](https://github.com/Alan0602/COOLMINDS/blob/main/ASSIGNMENT1/1.SquareOfAsterisks.java)

#### OUTPUT:

```java
C:\Users\hp\OneDrive\Documents\JavaS>javac SquareOfAstriks.java  

C:\Users\hp\OneDrive\Documents\JavaS>java SquareOfAstriks      
Enter the value between 1 to 5:4
* * * *
* * * *
* * * *
* * * *

C:\Users\hp\OneDrive\Documents\JavaS>java SquareOfAstriks
Enter the value between 1 to 5:6
Wrong value
```

## 2.NaturalLanguageMultiply
#### Question: 2.
  Write a program that will multiply two numbers in the range of zero to ninety-nine. java NaturalLanguageMultiply thirty-two ten and see 320 
 - Notes: 
 - It is okay to have global constants in a program. You can initialize global constants with a static block if you need to. 
 - If you create a method or class attribute that is for internal use only be sure to declare it private. 
 - Use one HashMap object that contains no more than 28 objects. 
 - Include a method with this signature: "private static int toInt( String s ) throws Exception". The exception is if the string is not recognized and contains the message you want to show to your user. 
 - The program must specify what text is not recognized. 
 - Purpose: To learn how to work with a HashMap, how to use static blocks to initialize, how to throw and catch exceptions 

#### CODE: [View code](https://github.com/Alan0602/COOLMINDS/blob/main/ASSIGNMENT1/2NaturalLanguageMultiply.java)

#### OUTPUT :

```shell
C:\Users\hp\OneDrive\Documents\JavaS>java NaturalLanguageMultiply       
Enter the first number (in words): thirty one
Enter the second number (in words): ten
The result is: 310

C:\Users\hp\OneDrive\Documents\JavaS>java NaturalLanguageMultiply
Enter the first number (in words): thirty-five
Enter the second number (in words): twenty two
Text not recognized: thirty-five

```


## 3.ReadTextFile/SortNames
#### Question 3.
Load an ArrayList with Strings from a text file of names. Show the names sorted in order of first name and then by last name. Use another class ReadTextFile to read the names from a text file with names of all Coolminds employees. Use the Collections class for sorting. Do not create a second list with the names in a different order. Do not modify the ArrayList or its contents except by using the Collections class. Your class will be called SortNames. 
- Purpose: To learn how to work with an ArrayList, how to implement an interface, and how to use I/O 

#### VIEW CODE :
#### [ReadTextFile](https://github.com/Alan0602/COOLMINDS/blob/main/ASSIGNMENT1/3ReadTextFile.java)  
#### [SortNames](https://github.com/Alan0602/COOLMINDS/blob/main/ASSIGNMENT1/3.1SortNames.java)

#### Explanation

##### ReadTextFile Class (1. Reads Text File):

- File Path: Stores the location of the text file to read (modify the path if needed).
- readNames Method: This method reads names from the file.
- ArrayList: Creates an ArrayList to store the names.
- Try-Catch Block: Handles potential errors while reading.
- BufferedReader: Opens the file for reading line by line.
- Read Lines: Loops through each line in the file.
- Add Names: Adds each line (name) to the ArrayList.
- Close Reader: Closes the file after reading.
- Return Names: Returns the ArrayList containing all names.

##### SortNames Class (2. Sorts Names):

- Main Method: This method runs the program.
- Read Names: Calls the readNames() method to get names.
- Sort Names: Uses Collections.sort() to sort the ArrayList.
- Custom Comparator: Sorts names by first name, then last name.
- Sorting Logic (within Comparator):
- Compares first names first.
- If first names are equal, compares last names.
- Sorts the ArrayList based on the comparison results.
- Printing Sorted Names:
- Loops through the sorted ArrayList of names.
- Prints each name (line) to the console.


#### InputFile

```txt
Xavier Ingram
Yvonne James
Laura King
Bob Brown
```

#### OUTPUT

```java
C:\Users\hp\OneDrive\Documents\JavaS>javac ReadTextFile.java SortNames.java

C:\Users\hp\OneDrive\Documents\JavaS>java SortNames

Bob Brown
Laura King
Xavier Ingram
Yvonne James
```

## 4.Thing/LookUp
#### Question 4.
A rental shop rents video DVDs, books, audio CDs, etc. Every thing has a serial number. Write a program called Lookup that takes in a serial number and writes information on a given item to the console. You will need to make an abstract class called Thing and three subclasses: Video, Book and Audio. There will be an abstract method called getDescription() that returns a String. Lookup will contain a static HashMap that contains a dozen things to rent. Make up whatever things you like as long as you use all three types. Give each of your classes relevant attributes and have the getDescription() method return as much information on an item as possible. Purpose: To learn about polymorphism

#### VIEW CODE:
#### [Thing](https://github.com/Alan0602/COOLMINDS/blob/main/ASSIGNMENT1/4Thing.java)
#### [LookUp](https://github.com/Alan0602/COOLMINDS/blob/main/ASSIGNMENT1/4.1LookUp.java)

### Explaination:
- **Abstract Class (Thing):** Defines a blueprint for items with serial number and title (abstract).
- **Concrete Classes (Audio, Video, Books):** Inherit from `Thing`, adding specific details (singer, director, author).
- **`getDescription()`:** Abstract method (must be implemented in subclasses) to describe the item.
- **`HashMap (shop)`:** Stores items (key: serial number, value: Thing object).
- **Pre-populated Items:** Sample videos, books, and audios are added to the shop.
- **`Scanner`:** Reads user input for the serial number.
- **User Input:** Prompts user to enter a serial number (1-6).
- **`get(serialNumber)`:** Retrieves the item from the shop based on the serial number.
- **Valid Serial Number:** If found, prints the item's description using `getDescription()`.
- **Invalid Serial Number:** Prints an error message for invalid input.

#### OUTPUT:

```cmd
C:\Users\hp\OneDrive\Documents\JavaS>java LookUp      
Enter the serial number from 1 to 6: 3
Books: Serial Number: 3
Title: The Batman
Author: Matt Reeves

C:\Users\hp\OneDrive\Documents\JavaS>java LookUp
Enter the serial number from 1 to 6: 7
Invalid serial number
```

## 5.Astersisks
#### Question 5.
Write a program that reads a value from the input (system) and prints a square of value x value asterisks (*) in the output window as long as the value is between 1 and 5. (read from keyboard, I/O classes, loop, exception handling) 

#### VIEW CODE: [Asterisks](https://github.com/Alan0602/COOLMINDS/blob/main/ASSIGNMENT1/5Asterisks.java)

#### OUTPUT
```cmd
C:\Users\hp\OneDrive\Documents\JavaS>java Asterisks
Enter the number from 1 to 5: 4
* * * *
* * * *
* * * *
* * * *
C:\Users\hp\OneDrive\Documents\JavaS>java Asterisks
Enter a value between 1 and 5: 6
Value must be between 1 and 5.
```

## 6.NameMatrix
#### Question 6.
Write a program that will read in a name from the command line and write it out 100 times. (10 columns x 10 rows). Columns seperated by a 2 spaces.(concatenate strings & loop)

#### VIEW CODE : [NameMatrix](https://github.com/Alan0602/COOLMINDS/blob/main/ASSIGNMENT1/6.NameMatrix.java)

#### OUTPUT
```cmd
C:\Users\hp\OneDrive\Documents\JavaS>javac NameMatrix.java

C:\Users\hp\OneDrive\Documents\JavaS>java NameMatrix Alan
Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan
Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan
Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan
Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan
Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan
Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan
Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan
Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan
Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan
Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan  Alan

C:\Users\hp\OneDrive\Documents\JavaS>java NameMatrix Alan K
AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK
AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK
AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK
AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK
AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK
AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK
AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK
AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK
AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK
AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK  AlanK

C:\Users\hp\OneDrive\Documents\JavaS>java NameMatrix       
Please give any name in command line
```

## 8.OddOrEven
#### Question 8. 
Write a program that will read in a number from the command line and tell me if it is even or odd. (if..., modulus)

#### VIEW CODE :  [OddOrEven](https://github.com/Alan0602/COOLMINDS/blob/main/ASSIGNMENT1/7.OddOrEven.java)

#### OUTPUT:
```cmd
C:\Users\hp\OneDrive\Documents\JavaS>javac OddOrEven.java

C:\Users\hp\OneDrive\Documents\JavaS>java OddOrEven 13   
13 is odd

C:\Users\hp\OneDrive\Documents\JavaS>java OddOrEven 12
12 is even

C:\Users\hp\OneDrive\Documents\JavaS>java OddOrEven   
Please give a number in command line

C:\Users\hp\OneDrive\Documents\JavaS>java OddOrEven alan
Invalid input. Please enter a valid integer in command line.

C:\Users\hp\OneDrive\Documents\JavaS>java OddOrEven 10,5
Invalid input. Please enter a valid integer in command line.

C:\Users\hp\OneDrive\Documents\JavaS>java OddOrEven 10.5
Invalid input. Please enter a valid integer in command line.
```

## 8.LeapYear
#### Question 8.
Write a program that will read in a year and report if it is a leap year.(logical)

#### VIEW CODE: [LeapYear](https://github.com/Alan0602/COOLMINDS/blob/main/ASSIGNMENT1/8.LeapYear.java)

#### OUTPUT
```cmd
C:\Users\hp\OneDrive\Documents\JavaS>java LeapYear
Enter the year: 
2000
2000 is a leap year and it has 366 days
C:\Users\hp\OneDrive\Documents\JavaS>java LeapYear
Enter the year:
1999
1999 is not a leap year and it has 365 days
C:\Users\hp\OneDrive\Documents\JavaS>java LeapYear       
Enter the year: 
thuiu
 Please enter a valid integer year.
```
