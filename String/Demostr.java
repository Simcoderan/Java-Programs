package String;
// STRING CLASS IN JAVA
// String is a class in Java but behaves like a primitive type due to some special handling by Java.
// Java's String class is part of the java.lang package and is immutable. 
// This means that once a String object is created, its value cannot be changed.

public class Demostr {
    public static void main(String a[]) {
        // String Initialization
        // You can initialize a string in two ways:
        // 1. Using the 'new' keyword:
        String name = new String("simran");  // Creates a new String object
        // 2. Without the 'new' keyword (more common and efficient):
        // String name = "simran";  // Java handles this internally as String literals are cached in the String pool

        // Output concatenation
        System.out.println("hello" + name);  // Concatenate the string "hello" with the value of name, outputs: hello simran

        // Using charAt() to access a character at a specific index
        // It returns the character at the specified index (0-based index)
        System.out.println(name.charAt(1));  // Outputs: 'i' (the character at index 1 in "simran")

        // Using concat() to combine two strings
        // It concatenates two strings and returns a new String object
        System.out.println(name.concat("riya"));  // Outputs: "simranriya"

        // Additional useful String methods (to be used in interviews):
        // 1. length() - Returns the length of the string.
        // 2. equals() - Compares two strings for equality.
        // 3. substring() - Extracts a substring from the string.
        // 4. indexOf() - Finds the first occurrence of a specified character or substring.
        // 5. toLowerCase() / toUpperCase() - Converts the string to lower/upper case.
    }
}

/*Key Concepts:
String Initialization:

new String("simran") creates a new String object, while String name = "simran"; refers to a string literal, which is cached in a string pool for efficient memory usage.
String Immutability:

Strings in Java are immutable, meaning that once created, their content cannot be changed. Any operation that modifies a string (e.g., concatenation) actually creates a new string object rather than modifying the existing one.

Common Methods:

charAt(index): Returns the character at a specified index.
concat(): Concatenates two strings.
length(): Returns the length of the string.
equals(): Checks if two strings have the same value.
indexOf(): Finds the index of the first occurrence of a character or substring.


Placement/Interview Questions:

String vs StringBuilder: Explain the difference between String and StringBuilder (use of StringBuilder when you expect to modify the string multiple times, as it’s mutable).

String Pool: What is the String Pool in Java? How does it optimize memory usage?

String Immutability: Why are strings in Java immutable, and what are the advantages of immutability in multithreading?

Common String Methods: Write a program to count the occurrences of a character in a string.

Performance: Why is concatenating strings using + inefficient in a loop? What should you use instead? (Use StringBuilder for efficient string concatenation in loops). */
