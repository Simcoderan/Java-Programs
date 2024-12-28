package Method;
// Class Computer demonstrates methods (behavior of an object)
class Computer {
    // A method to simulate playing music (void method: no return value)
    public void playMusic() {
        System.out.println("playing music");
    }

    // Method that returns a String based on the cost of a pen (value-returning method)
    public String getMeAPen(int cost) {
        // Conditional check to decide if the pen can be given based on cost
        if (cost >= 10) {
            return "pen";  // Return "pen" if cost >= 10
        } else {
            return "Nothing";  // Return "Nothing" if cost is less than 10
        }
    }
}

public class Methods {

    public static void main(String[] args) {
        // Creating an object of the Computer class
        Computer comp = new Computer();
        
        // Calling a void method that performs an action without returning a value
        comp.playMusic();
        
        // Calling the method that returns a value and printing the result
        String str = comp.getMeAPen(10);  // With cost 10, the result will be "pen"
        System.out.println(str);  // Output: "pen"
    }
}

// Class Calculator demonstrates method overloading (same method name, different parameters)
class Calculator {

    // Method to add three integers
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // Method to add two integers (overloading the add method)
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // Method to add a double and an integer (overloading with different parameter types)
    public double add(double n1, int n2) {
        return n1 + n2;
    }

    // NOTE: You cannot overload methods by changing only the return type.
    // Example: "public double add(int n1, int n2);" would NOT work if another method with the same parameters exists.
}

// .....JVM..... Memory Management: STACK & HEAP ....
// In JVM memory, we have STACK and HEAP areas.
// - The STACK stores method frames (local variables and method calls).
// - The HEAP stores dynamically allocated memory (objects created using 'new').
// Each method invocation has its own stack frame, which is removed once the method execution is complete.







/*
📌 Conceptual Notes:

1. Methods:

Definition: A method is a block of code that performs a specific task. It can either return a value or perform an action without returning anything.
Void Methods: These methods perform an action (like playMusic()) but do not return a value. The void keyword indicates no return type.
Value-returning Methods: Methods like getMeAPen() return a result (e.g., a String or an int).

2. Method Overloading:

What is Method Overloading?: Method overloading occurs when you define multiple methods with the same name but with different parameter lists (either in the number of parameters, their types, or both). It is resolved during compile-time.
Why Use it?: Overloading makes code more readable and helps to perform similar operations on different data types or numbers of arguments.
Example: In the Calculator class, we overload the add() method to handle different numbers and types of parameters.
java

 Code:
public int add(int n1, int n2, int n3) { return n1 + n2 + n3; }
public int add(int n1, int n2) { return n1 + n2; }
public double add(double n1, int n2) { return n1 + n2; }


3. JVM Memory (Stack vs Heap):

Stack Memory:
Used for storing method calls and local variables. Each method invocation has its own stack frame.
The memory used by local variables is released once the method finishes execution.

Heap Memory:
Stores objects created with the new keyword (like new Computer()).
Managed by Garbage Collection in Java to reclaim memory that is no longer in use.
Method Frames: Each method invocation in the stack stores local variables and method calls.

4. Method Invocation:

Calling Methods: Methods are invoked using either an object reference (for non-static methods) or directly (for static methods).
Returning Values: Methods that return values pass their result back to the calling code, which can store it in a variable for further use.
 
  📌 Interview Placement Questions:

1. What is method overloading?
Definition: Method overloading allows you to define multiple methods with the same name but different parameters (in number, type, or both). It provides flexibility and improves code readability.

2. What is the difference between method overloading and method overriding?
Method Overloading: Occurs within the same class where methods have the same name but different parameter lists.
Method Overriding: Occurs when a subclass provides a specific implementation of a method already defined in its superclass, with the same signature (name, return type, and parameters).

3. What is the significance of the void keyword in a method declaration?
The void keyword indicates that the method does not return any value. For example, public void playMusic() means the method performs an action but doesn't return anything.

4. Can a method return multiple values?
No, a method can return only one value. However, you can return multiple values by:
Using an Object: Create a class to hold multiple return values and return that object.
Using Collections or Arrays: You can return an array, list, or map to return multiple values.

5. What is the difference between Stack and Heap memory in JVM?
Stack: Stores method calls, local variables, and frames. Each method invocation has its own stack frame.
Heap: Stores dynamically created objects using new. Objects in the heap are managed by the garbage collector.

6. Can we overload methods by changing only the return type?
No, method overloading requires the method signature to differ in parameter lists (not just return type). Changing the return type does not create an overload, as it does not affect the method's signature.

7. What are the advantages of method overloading?
Code Reusability: Using the same method name for similar operations (with different parameter types) reduces redundancy.
Improved Readability: It makes code easier to understand by grouping similar methods under the same name.

8. What happens when a method is invoked in Java?
When a method is called, a new stack frame is created in the stack memory. This frame contains local variables, method parameters, and the method call itself. Once the method finishes execution, its stack frame is removed.
Best Practices:
Method Overloading: Avoid overloading methods with too many parameters, as it can make the code confusing. Use meaningful parameter names.
Method Naming: Choose method names that clearly represent the behavior or task they perform, making the code self-documenting. */