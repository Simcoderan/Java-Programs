// 📌 **ABSTRACTION IN JAVA**

// 📚 **INTRODUCTION TO ABSTRACTION**
// - Abstraction is the process of hiding implementation details and showing only essential features.
// - It helps reduce code complexity and increases reusability.
// - In Java, abstraction is achieved using **abstract classes** and **interfaces**.

// 📚 **ABSTRACT CLASS VS INTERFACE**
// 1️⃣ **Abstract Class:**
//    - Can have abstract and non-abstract methods.
//    - Supports constructor.
//    - Can have instance variables.
// 2️⃣ **Interface:**
//    - Only abstract methods (Java 8+ allows default/static methods).
//    - No constructors.
//    - Variables are final, static, and public by default.

// 📚 **SYNTAX:**
// Abstract Class:
// abstract class ClassName {
//     abstract void methodName();
// }
// 
// Interface:
// interface InterfaceName {
//     void methodName();
// }

// Example of Abstract Class
abstract class Shape {
    abstract void draw();
    public void display() {
        System.out.println("Shape Display Method");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

// Example of Interface
interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }
}

public class Abs {
    public static void main(String[] args) {
        // Abstract Class Example
        Shape shape = new Circle();
        shape.draw();
        shape.display();
        
        // Interface Example
        Vehicle car = new Car();
        car.start();
    }
}

/* 📚 **CONCEPT NOTES:**

✅ **Abstraction Definition:**
   - Hiding implementation details while showing essential information.

✅ **Key Advantages of Abstraction:**
   - Reduces code complexity.
   - Improves code readability.
   - Enhances security by hiding details.

✅ **Abstract Class vs Interface:**
   - Abstract Class: Can have abstract and concrete methods.
   - Interface: All methods are abstract by default (prior to Java 8).

✅ **When to Use Abstract Class vs Interface:**
   - Abstract Class: When methods have default behavior.
   - Interface: When multiple classes share common behavior.

✅ **Best Practices:**
   - Use abstract classes when creating a base class.
   - Use interfaces for full abstraction.
*/

/* 📌 **INTERVIEW & PLACEMENT QUESTIONS WITH ANSWERS:**

1️⃣ **What is Abstraction?**
   - Abstraction hides implementation details and shows only functionality.

2️⃣ **How is Abstraction achieved in Java?**
   - Using Abstract Classes and Interfaces.

3️⃣ **Difference between Abstract Class and Interface?**
   - Abstract Class can have both abstract and concrete methods.
   - Interface can only have abstract methods (before Java 8).

4️⃣ **Can an abstract class have constructors?**
   - Yes, abstract classes can have constructors.

5️⃣ **Can an interface have a constructor?**
   - No, interfaces cannot have constructors.

6️⃣ **What is the purpose of abstract methods?**
   - To define a method that must be implemented by derived classes.

7️⃣ **Can we create an object of an abstract class?**
   - No, but we can use references of abstract classes.

8️⃣ **What happens if a class implements multiple interfaces?**
   - The class must provide implementation for all interface methods.

9️⃣ **Can an abstract class implement an interface?**
   - Yes, an abstract class can implement an interface.

🔟 **Why use Abstraction in Java?**
   - To improve flexibility, code reusability, and maintainability.
*/

