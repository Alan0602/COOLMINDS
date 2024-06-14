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

## 9.SpellNumber
#### Question 9.
Write a program that will read in a number from 20 to 99 and spell out that number. The program must also report any values that are out of range. 33 - "thirty three" (array, invalid input exception handling)

#### VIEW CODE: [SpellNumber](https://github.com/Alan0602/COOLMINDS/blob/main/ASSIGNMENT1/9.SpellNumber.java)

#### OUTPUT
```cmd
C:\Users\hp\OneDrive\Documents\JavaS>javac SpellNumber.java

C:\Users\hp\OneDrive\Documents\JavaS>java SpellNumber
Enter a number from 20 to 99:
20
20 - tewnty

C:\Users\hp\OneDrive\Documents\JavaS>java SpellNumber
Enter a number from 20 to 99:
94
94 - ninety four

C:\Users\hp\OneDrive\Documents\JavaS>java SpellNumber
Enter a number from 20 to 99:
12
Number is Out of Range, Value must between 20 and 99.
```

## 10.TimesTable
#### Question 10.
 Write a program that (algorithmically) shows a times table.(convert integers to strings, format text, nested loops) 
```cmd
 0 1 2 3 4 5 6 7 8 9 
 0 0 0 0 0 0 0 0 0 0 0 
 1 0 1 2 3 4 5 6 7 8 9 
 2 0 2 4 6 8 10 12 14 16 18 
 3 0 3 6 9 12 15 18 21 24 27 
 4 0 4 8 12 16 20 24 28 32 36 
 5 0 5 10 15 20 25 30 35 40 45 
 6 0 6 12 18 24 30 36 42 48 54 
 7 0 7 14 21 28 35 42 49 56 63 
 8 0 8 16 24 32 40 48 56 64 72 
 9 0 9 18 27 36 45 54 63 72 81 
 ```

#### VIEW CODE :  [TimesTable](https://github.com/Alan0602/COOLMINDS/blob/main/ASSIGNMENT1/10.TimesTable.java)

#### OUTPUT
```cmd
C:\Users\hp\OneDrive\Documents\JavaS>java TimesTable.java
  0 1 2 3 4 5 6 7 8 9 
0 0 0 0 0 0 0 0 0 0 0
1 0 1 2 3 4 5 6 7 8 9
2 0 2 4 6 8 10 12 14 16 18
3 0 3 6 9 12 15 18 21 24 27
4 0 4 8 12 16 20 24 28 32 36
5 0 5 10 15 20 25 30 35 40 45
6 0 6 12 18 24 30 36 42 48 54
7 0 7 14 21 28 35 42 49 56 63
8 0 8 16 24 32 40 48 56 64 72
9 0 9 18 27 36 45 54 63 72 81
```

## 11.SquareGrains
#### Question 11.
There are 64 squares on a chessboard. If I put One grain on the first square of a chess board. Two grains on the next. Four on the third, and so on. Write a program that shows how many grains were on each square and the total number of grains. 
 ```
 square 1: 1 grain 
 square 2: 2 grains 
 square 3: 4 grains 
 ...... 
 ..... 
 square64: xxx grains
```
 (boundaries of int & accuracy) 

 #### VIEW CODE :  [SquareGrains](https://github.com/Alan0602/COOLMINDS/blob/main/ASSIGNMENT1/11.SquareGrains.java)

 #### Explain:
  - By using `BigInteger` intialize grain to 1 and total to zero
  - By loop print the square and grains
  - Add `total` by adding `graains`
  - Update `grains` by multiply grains with `BigInteger` 2
  - Print total

#### OUTPUT
```cmd
C:\Users\hp\OneDrive\Documents\JavaS>javac SquareGrains.java
C:\Users\hp\OneDrive\Documents\JavaS>java SquareGrains      
Square 1 : 1 grains
Square 2 : 2 grains
Square 3 : 4 grains
Square 4 : 8 grains
Square 5 : 16 grains
Square 6 : 32 grains
Square 7 : 64 grains
Square 8 : 128 grains
Square 9 : 256 grains
Square 10 : 512 grains
Square 11 : 1024 grains
Square 12 : 2048 grains
Square 13 : 4096 grains
Square 14 : 8192 grains
Square 15 : 16384 grains
Square 16 : 32768 grains
Square 17 : 65536 grains
Square 18 : 131072 grains
Square 19 : 262144 grains
Square 20 : 524288 grains
Square 21 : 1048576 grains
Square 22 : 2097152 grains
Square 23 : 4194304 grains
Square 24 : 8388608 grains
Square 25 : 16777216 grains
Square 26 : 33554432 grains
Square 27 : 67108864 grains
Square 28 : 134217728 grains
Square 29 : 268435456 grains
Square 30 : 536870912 grains
Square 31 : 1073741824 grains
Square 32 : 2147483648 grains
Square 33 : 4294967296 grains
Square 34 : 8589934592 grains
Square 35 : 17179869184 grains
Square 36 : 34359738368 grains
Square 37 : 68719476736 grains
Square 38 : 137438953472 grains
Square 39 : 274877906944 grains
Square 40 : 549755813888 grains
Square 41 : 1099511627776 grains
Square 42 : 2199023255552 grains
Square 43 : 4398046511104 grains
Square 44 : 8796093022208 grains
Square 45 : 17592186044416 grains
Square 46 : 35184372088832 grains
Square 47 : 70368744177664 grains
Square 48 : 140737488355328 grains
Square 49 : 281474976710656 grains
Square 50 : 562949953421312 grains
Square 51 : 1125899906842624 grains
Square 52 : 2251799813685248 grains
Square 53 : 4503599627370496 grains
Square 54 : 9007199254740992 grains
Square 55 : 18014398509481984 grains
Square 56 : 36028797018963968 grains
Square 57 : 72057594037927936 grains
Square 58 : 144115188075855872 grains
Square 59 : 288230376151711744 grains
Square 60 : 576460752303423488 grains
Square 61 : 1152921504606846976 grains
Square 62 : 2305843009213693952 grains
Square 63 : 4611686018427387904 grains
Square 64 : 9223372036854775808 grains
Total grains: 18446744073709551615
```

## 12.SumOfFloat
#### Question 12.
 Write a program that will start with a double called sum set to zero. Add 0.1 to sum 1000 times by using a for loop. Print the sum, and then print a statement of whether or not the sum is equal to 100. 
(the difference between floating point numbers and integers, precision) 

#### VIEW CODE:  [SumOfFloat](https://github.com/Alan0602/COOLMINDS/blob/main/ASSIGNMENT1/12.SumOfFloat.java)

#### OUTPUT
```java
C:\Users\hp\OneDrive\Documents\JavaS>javac SumOfFloat.java    

C:\Users\hp\OneDrive\Documents\JavaS>java SumOfFloat
Sum = 99.9999999999986
sum is not 100
```

## 13.TimeDateInfo
#### Question 13.
 Write a program that will show different time and date information based on what "code" you send it. The codes are: 
0 - number of milliseconds since January 1, 1970 
1 - number of seconds since January 1, 1970 
2 - number of days since January 1, 1970 
3 - current date and time 
 (use Calendar class, switch) 

#### VIEW CODE : [TimeDateInfo](https://github.com/Alan0602/COOLMINDS/blob/main/ASSIGNMENT1/13.TimeDateInfo.java)

#### OUTPUT : 
```cmd
C:\Users\hp\OneDrive\Documents\JavaS>javac TimeDateInfo.java

C:\Users\hp\OneDrive\Documents\JavaS>java TimeDateInfo      
Enter the code from 0 to 3: 0
Number of Milliseconds from 1970 Jan 1: 1718384187265

C:\Users\hp\OneDrive\Documents\JavaS>java TimeDateInfo
Enter the code from 0 to 3: 1
Number of Seconds from 1970 Jan 1: 1718384196

C:\Users\hp\OneDrive\Documents\JavaS>java TimeDateInfo       
Enter the code from 0 to 3: 2
Number of Days from 1970 Jan 1: 19888

C:\Users\hp\OneDrive\Documents\JavaS>java TimeDateInfo
Enter the code from 0 to 3: 3
Current Date and Time: Fri Jun 14 22:29:20 IST 2024
```

