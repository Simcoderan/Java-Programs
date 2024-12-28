// 📌 **FINAL KEYWORD IN JAVA**

// 📚 **INTRODUCTION TO FINAL IN JAVA**
// - The `final` keyword is used to declare constants, prevent method overriding, and prevent inheritance.
// - It can be applied to variables, methods, and classes.


// 📚 USAGE OF FINAL IN JAVA:

/* ✅ Final Variables: 
   - When a variable is declared `final`, its value cannot be changed after initialization.
   - Example: `final int num = 8;`  
     - `num` cannot be reassigned once it's initialized.
*/

// Final Variable Example
//final int num = 8;
// num = 9;  // Error: cannot assign a value to a final variable


/* ✅ Final Methods:  
   - When a method is declared `final`, it cannot be overridden by subclasses.  
   - Example:  
     ```java
     public final void show() {
         System.out.println("by sim");
     }
     ``` 
*/

// ✅ Final Method Example
class Calc {
    public final void show() {
        System.out.println("by sim");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

/* ✅ Final Classes:  
   - When a class is declared `final`, it cannot be inherited.  
   - Example:  
     ```java
     final class Calc { ... }
     ```
*/

// ✅ Final Class Example
final class FinalCalc {
    public void display() {
        System.out.println("This class cannot be inherited.");
    }
}


// 📚 EXAMPLES WITH INHERITANCE AND METHOD OVERRIDING:

class AdvCalc extends Calc {
    // Uncommenting this method would cause an error
    // public void show() {
    //     System.out.println("by mr x");
    // }
}

public class FinalExample {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.show();  // Output: by sim
        obj.add(4, 5);  // Output: 9
    }
}

/* 📚 CONCEPT NOTES:

✅ Final Variables:
   - Used to create constants.
   - Value cannot be reassigned after initialization.

✅ Final Methods:
   - Prevent method overriding in subclasses.
   - Ensure consistent behavior across class hierarchies.

✅ Final Classes:
   - Prevent inheritance.
   - Often used for utility or immutable classes (e.g., `String` class).

✅ Best Practices:
   - Use `final` for constants.
   - Use `final` for methods that shouldn't be overridden.
   - Use `final` for classes to enforce immutability.
*/


// 📌 **INTERVIEW & PLACEMENT QUESTIONS WITH ANSWERS:**

/* 
1️⃣ **What does `final` mean in Java?**  
   - It is used to declare constants, prevent method overriding, and prevent inheritance.

2️⃣ **What happens if you declare a variable as `final`?**  
   - Its value cannot be reassigned after initialization.

3️⃣ **Can a `final` method be overridden?**  
   - No, a `final` method cannot be overridden by subclasses.

4️⃣ **Can a `final` class be extended?**  
   - No, a `final` class cannot be inherited.

5️⃣ **Why use `final` for variables?**  
   - To create constants whose values cannot change.

6️⃣ **Why use `final` for methods?**  
   - To prevent subclasses from modifying the method's behavior.

7️⃣ **Why use `final` for classes?**  
   - To prevent inheritance and ensure immutability.

8️⃣ **What is an example of a `final` class in Java?**  
   - `String` is a final class in Java.

9️⃣ **Can we initialize a `final` variable later?**  
   - Yes, but only once, and it must be done either in the constructor or directly at the time of declaration.

🔟 **What is the advantage of using `final` in Java?**  
   - It enhances security, ensures immutability, and improves code clarity.

1️⃣1️⃣ **What is the difference between `final` variable and constant?**  
   - A `final` variable cannot be reassigned, and constants are typically written in uppercase letters.

1️⃣2️⃣ **Can a constructor be `final`?**  
   - No, constructors cannot be `final` because they are not inherited.

1️⃣3️⃣ **Can we assign a new value to a `final` variable?**  
   - No, attempting to reassign a value will cause a compilation error.

1️⃣4️⃣ **What happens if we try to extend a `final` class?**  
   - It results in a compilation error.
*/









//Constant is a final variable with a fixed value that cannot be changed. Constants are written in uppercase.
//  Final is a keyword used to make a variable, method, or class unmodifiable. A final variable can behave like a constant, but not all final variables are constants.
