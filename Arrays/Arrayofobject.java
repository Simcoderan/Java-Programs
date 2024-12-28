package Arrays;
// Class representing a Student
class Student {
    int rollno;  // Instance variable for student's roll number
    String name; // Instance variable for student's name
    int marks;   // Instance variable for student's marks
}

public class Arrayofobject {

    public static void main(String[] args) {

        // Creating individual Student objects
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Simran";
        s1.marks = 70;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Sam";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Kiran";
        s3.marks = 80;

        // Creating an array to hold Student objects (array of references)
        // Array of Students can hold references to objects of Student class
        Student students[] = new Student[3]; // Array of size 3 to hold Student objects
        students[0] = s1;  // Assigning s1 to first position in array
        students[1] = s2;  // Assigning s2 to second position in array
        students[2] = s3;  // Assigning s3 to third position in array

        // Printing the details of all students stored in the array
        // Accessing each element of the students array
        System.out.println("Student Details:");
        for (int i = 0; i < students.length; i++) {  // Iterating through the array using normal for loop
            System.out.println("Roll No: " + students[i].rollno + ", Name: " + students[i].name + ", Marks: " + students[i].marks);
        }

        // Enhanced For Loop: A simpler way to iterate over arrays
        System.out.println("\nUsing Enhanced For Loop:");
        for (Student stud : students) {  // Fetching one student object at a time
            System.out.println("Roll No: " + stud.rollno + ", Name: " + stud.name + ", Marks: " + stud.marks);
        }
    }
}

// 🚀 Conceptual Notes for Placement/Interview Preparation:

// 1. Arrays of Objects:
// - An array of objects stores references to the objects, not the objects themselves. 
// - The array holds **references** to objects of the `Student` class, and each index points to an object in memory. 
// - You need to create the objects first before storing them in the array, unlike primitive types. 
// - Example use cases: Storing a list of students, employees, or any object in a collection. 
// - **Time Complexity**: Accessing elements is **O(1)**, iterating over the array is **O(n)** where n is the number of elements.


// 2. Enhanced For Loop (also known as "For-each loop") 🔄:
// - Simplifies iteration over arrays and collections.
// - Automatically loops through each element without needing an index.
// - **Syntax**: `for (Type var : array) { // actions }`.
// - Useful for cases where you don’t need the index, just the element itself.


// Key Concepts to Keep in Mind for Placement 🧠:
// - **Memory Management**: The array stores **references** to objects, not the actual objects themselves, so memory management is crucial. 
// - **Object-Oriented**: Arrays of objects are one of the core concepts when handling real-world entities in OOP (Object-Oriented Programming). 
// - **Flexibility**: Arrays of objects provide flexibility to store a large collection of items of the same type. 



// Interview Questions You May Encounter 🧰:
// 1. Create an array of objects and print their details.
// 2. Find the average marks of all students in the array.
// 3. Create a method that accepts an array of Student objects and returns the student with the highest marks.
// 4. Sort an array of Student objects based on marks using Arrays.sort().
// 5. Create a constructor in the Student class to initialize fields instead of manually assigning values.



//   Important Points for Placement/Interview ⚠️:
// - **Object Instantiation**: Objects are instantiated using the `new` keyword, and their references are stored in the array. 
// - **Arrays and Objects**: An array of objects is a collection of references, making it flexible for storing various real-world data entities. 
// - **Constructor vs Manual Assignment**: Instead of manually assigning values, constructors can be used for more efficient object initialization. 
// - **Null Check**: Always ensure objects in arrays are initialized before using them to avoid `NullPointerException`. 
// - **Garbage Collection**: Once objects go out of scope or references are set to null, they can be garbage collected. 
// - **Sorting Objects**: You may need to implement `Comparable` or use `Comparator` to sort arrays of objects based on some property, like marks or names. 
