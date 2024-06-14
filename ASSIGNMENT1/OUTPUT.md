## 1.SQUAREOFASTERISKS
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


