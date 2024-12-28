// CLASS DEFINITION: This class represents a student with attributes like roll number, name, and marks
class Student {
    int rollno;  // Instance variable: Unique to each object of the class
    String name; // Instance variable: Name of the student
    int marks;   // Instance variable: Marks obtained by the student
}

public class EnhancedForLoopExample {

    public static void main(String[] args) {
        // Declaring and initializing an array of integers with a size of 4
        int nums[] = new int[4];  // Array to hold integer values
        nums[0] = 4;  // Assigning values to array elements
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 6;

        // Traditional for loop (commented out)
        // The traditional for loop iterates through each index of the array
        // for (int i = 0; i < nums.length; i++) {
        //     System.out.println(nums[i]);
        // }

        // ENHANCED FOR LOOP (also known as the "for-each" loop)
        // The enhanced for loop makes it easier to iterate over arrays and collections.
        // It automatically handles indexing and gives you the value at each step.
        // Syntax: for (type varName : array/collection) { body }
        // In this case, the loop goes through each element in the array and stores it in 'n'
        // One element of the array 'nums' is given to 'n' at a time in each iteration.
        for (int n : nums) {  // n will take values from nums array one by one
            System.out.println(n); // Prints each value of the array
        }

        // Creating an array of Student objects and using an enhanced for loop to print student details
        Student[] students = new Student[3]; // Array to hold Student objects

        // Initializing Student objects
        students[0] = new Student();
        students[0].name = "John";
        students[0].rollno = 101;
        students[0].marks = 85;

        students[1] = new Student();
        students[1].name = "Sara";
        students[1].rollno = 102;
        students[1].marks = 90;

        students[2] = new Student();
        students[2].name = "Ali";
        students[2].rollno = 103;
        students[2].marks = 88;

        // Using enhanced for loop to print student details
        for (Student s : students) {
            System.out.println("Roll No: " + s.rollno + ", Name: " + s.name + ", Marks: " + s.marks);
        }
    }
}

/*
Concept Notes:

1. **Instance Variables**:
   - Instance variables (rollno, name, marks in the `Student` class) belong to each instance (or object) of the class.
   - Each object has its own copy of these variables. They are usually not shared across objects of the same class.

2. **Arrays**:
   - Arrays are used to store multiple values of the same type in a single variable. In this example, the `nums[]` array holds integers.
   - An array in Java is zero-indexed, meaning the index of the first element is 0.

3. **Enhanced For Loop**:
   - The enhanced for loop (or for-each loop) simplifies iterating over arrays or collections without using an index.
   - It automatically fetches elements one by one, making the code cleaner and more concise.
   - The syntax is: `for (dataType variable : array)`, where `variable` takes the value of each element in the array sequentially.
   
   Advantages:
   - **Concise**: Eliminates the need to manage an index or manually access array elements.
   - **Less Error-Prone**: Reduces potential mistakes related to out-of-bound errors in array access.
   
4. **Traditional For Loop vs Enhanced For Loop**:
   - Traditional for loop: Requires manually managing the index (`i`) to access elements by their positions.
   - Enhanced for loop: Easier to read and less error-prone, as it directly gives you the elements of the array.

Interview Preparation Insights:

1. **What is the difference between a traditional for loop and an enhanced for loop?**
   - The traditional for loop requires managing an index (starting from 0), whereas the enhanced for loop directly iterates over the elements of an array or collection. The enhanced for loop is typically used when you don't need the index and just want to access each element in the array.

2. **What are the advantages of using an enhanced for loop?**
   - It is more concise and less error-prone. It reduces the chances of an `ArrayIndexOutOfBoundsException` and makes the code more readable, especially when you don’t need to manipulate the index.

3. **Can the enhanced for loop be used to modify elements of an array?**
   - No, you cannot modify the elements of the array directly within an enhanced for loop. The variable (`n` in this case) is a copy of the element, and any modification to `n` does not affect the original array. You can only read the elements.

4. **What happens if you try to use the enhanced for loop with a non-array object like a primitive?**
   - The enhanced for loop only works with arrays or collections. Using it with a non-array object like a primitive type would result in a compilation error.

Interview Questions & Explanations:

1. **What is an enhanced for loop, and how is it different from a traditional for loop?**
   - The enhanced for loop is used to iterate through arrays or collections, eliminating the need to manually manage the index. In a traditional for loop, you would use an index (e.g., `for(int i = 0; i < nums.length; i++)`), whereas in an enhanced for loop, you directly access each element (e.g., `for(int n : nums)`).

2. **When should you use an enhanced for loop instead of a traditional for loop?**
   - Use the enhanced for loop when you only need to access the elements in an array or collection and don’t need the index. If you need to modify the array or keep track of the index, a traditional for loop would be more suitable.

3. **Can we use an enhanced for loop to iterate over a List in Java?**
   - Yes, you can use the enhanced for loop to iterate over any collection (like List, Set, etc.) or array in Java. For example:
     ```java
     List<String> names = new ArrayList<>();
     for (String name : names) {
         System.out.println(name);
     }
     ```

4. **Can the enhanced for loop be used with a Map in Java?**
   - The enhanced for loop cannot be used directly with a `Map` because a `Map` does not implement the `Iterable` interface. However, you can iterate over a `Map` using `Map.entrySet()`, `keySet()`, or `values()` methods, which return a collection that can be iterated with an enhanced for loop.

Real-World Example:

**Classroom Information System:**
- Suppose you are building a classroom information system where each student has a name, roll number, and marks.
- You could use an array or a list of `Student` objects and print out the details of each student using the enhanced for loop:
  ```java
  Student[] students = new Student[3];
  students[0] = new Student();
  students[0].name = "John";
  students[0].rollno = 101;
  students[0].marks = 85;

  students[1] = new Student();
  students[1].name = "Sara";
  students[1].rollno = 102;
  students[1].marks = 90;

  students[2] = new Student();
  students[2].name = "Ali";
  students[2].rollno = 103;
  students[2].marks = 88;

  // Using enhanced for loop to print details
  for (Student s : students) {
      System.out.println("Roll No: " + s.rollno + ", Name: " + s.name + ", Marks: " + s.marks);
  }
*/