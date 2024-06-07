#String Operations in Java<br>
#Description<br>
This Java program demonstrates various basic operations that can be performed on strings. It covers concatenation, finding the length of a string, accessing characters at specific positions, extracting substrings, and comparing strings. These operations are fundamental for anyone learning Java, as strings are a crucial part of programming in any language.




Explanation <br>
1.Declaring and Initializing Strings:

'.' String str1 = "Hello";
String str2 = "World";
Two strings are declared and initialized with values "Hello" and "World".
Concatenation:

String str3 = str1 + " " + str2;
The two strings are concatenated with a space in between, resulting in "Hello World".
System.out.println("Concatenated String: " + str3);
The concatenated string is printed.
String Length:

System.out.println("Length of str3: " + str3.length());
The length of the concatenated string "Hello World" is calculated and printed. The length is 11.
Character at a Specific Position:

System.out.println("Character at index 1: " + str3.charAt(1));
The character at index 1 of the string "Hello World" is retrieved and printed. The character is 'e'.
Substring:

System.out.println("Substring from index 0 to 5: " + str3.substring(0, 5));
A substring from index 0 to 5 (exclusive) is extracted from the string "Hello World". The substring is "Hello".
String Comparison:

System.out.println("str1 equals str2: " + str1.equals(str2));
The two strings "Hello" and "World" are compared for equality. The result is false since the strings are different.
How to Run
Ensure you have Java installed on your machine.
Download or clone this repository.
Navigate to the directory containing StringExample.java.
Compile the Java file using the command:
sh
Copy code
javac StringExample.java
Run the compiled Java program using the command:
sh
Copy code
java StringExample
Conclusion
This example is a simple yet effective way to understand the fundamental operations that can be performed on strings in Java. Mastering these basics is essential for further exploration and usage of strings in more complex programs.


