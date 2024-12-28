// 📌 **OBJECT-ORIENTED PROGRAMMING (OOP) CONCEPTS IN JAVA**

// 📚 **CLASS AND OBJECT**
// - Class: Blueprint for creating objects.
// - Object: Instance of a class containing properties and behaviors.

class Calculator { // 📌 Class Design (Blueprint)
    int a; // 📌 Instance Variable
    
    public int add(int n1, int n2) { // 📌 Method to add two integers
        int r = n1 + n2;
        return r;
    }
}

public class Objects {
    public static void main(String[] args) {
        int num1 = 4; // 📌 Primitive Variable
        int num2 = 6;
        
        // 📌 Object Creation
        Calculator calc = new Calculator(); // Creating an object of Calculator
        int result = calc.add(num1, num2); // Calling the add method
        
        System.out.println("Result: " + result); // Output: Result: 10
    }
}

/* 📚 **CONCEPT NOTES:**

✅ **Class and Object:**
   - A **Class** is a blueprint for creating objects.
   - An **Object** is an instance of a class.

✅ **Memory Allocation in Java:**
   - **Heap Memory:** Stores objects and class instances.
   - **Stack Memory:** Stores method calls and local variables.

✅ **Key Terms:**
   - **Instance Variable:** Defined inside a class but outside methods.
   - **Method:** Behavior of an object.

✅ **Object Creation Process:**
   1. Class is loaded.
   2. Memory is allocated in heap.
   3. Constructor initializes the object.

✅ **JDK, JVM, and JRE:**
   - **JDK (Java Development Kit):** Contains tools for developing Java programs.
   - **JVM (Java Virtual Machine):** Executes Java bytecode.
   - **JRE (Java Runtime Environment):** Provides libraries and JVM to run Java programs.

*/

/* 📌 **INTERVIEW & PLACEMENT QUESTIONS WITH ANSWERS:**

1️⃣ **What is the difference between a class and an object?**
   - Class: Blueprint or template.
   - Object: Instance of a class.

2️⃣ **What is the role of JVM in Java?**
   - JVM executes bytecode and ensures platform independence.

3️⃣ **What is the difference between heap and stack memory?**
   - Heap: Stores objects.
   - Stack: Stores method calls and local variables.

4️⃣ **What happens during object creation?**
   - Memory allocation, constructor call, initialization.

5️⃣ **What is the use of `new` keyword in Java?**
   - It is used to create an object in heap memory.

6️⃣ **Explain the difference between instance and local variables.**
   - Instance: Defined in a class, accessible by all methods.
   - Local: Declared inside a method, limited scope.

7️⃣ **What is the role of constructors in Java?**
   - Constructors initialize an object when it is created.

8️⃣ **What is garbage collection in Java?**
   - JVM automatically removes unused objects from memory.

9️⃣ **Explain JDK, JRE, and JVM.**
   - JDK: Development tools.
   - JRE: Runtime libraries.
   - JVM: Executes bytecode.

10️⃣ **Why is Java considered platform-independent?**
   - Bytecode can run on any JVM, regardless of the underlying OS.

*/
