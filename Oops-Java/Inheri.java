// 📌 **INHERITANCE IN JAVA**

// 📚 **INTRODUCTION TO INHERITANCE**
// - Inheritance allows one class to acquire the properties and behaviors of another class.
// - It promotes code reusability and establishes a relationship between classes.
// - It enables method overriding and polymorphism.

// 📚 **TYPES OF INHERITANCE**
// 1️⃣ **Single Inheritance:**
//    - One class inherits from another class.
// 2️⃣ **Multilevel Inheritance:**
//    - A class inherits from a derived class.
// 3️⃣ **Hierarchical Inheritance:**
//    - Multiple classes inherit from a single base class.
// 4️⃣ **Multiple Inheritance (via Interfaces):**
//    - A class can implement multiple interfaces.
// 5️⃣ **Hybrid Inheritance:**
//    - A combination of multiple and multilevel inheritance (achieved using interfaces).

// 📚 **BASE AND DERIVED CLASSES**
// - **Base Class (Parent Class):** The class whose properties are inherited.
// - **Derived Class (Child Class):** The class that inherits properties.

// 📚 **SYNTAX:**
// class ChildClass extends ParentClass {
//     // Additional properties and methods
// }

// Example:
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    public void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class Inheri {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat(); // Inherited from Animal
        puppy.bark(); // Inherited from Dog
        puppy.weep(); // Defined in Puppy
    }
}

/* 📚 **CONCEPT NOTES:**

✅ **Inheritance Definition:**
   - Mechanism of acquiring properties and behaviors from parent class.

✅ **Key Advantages of Inheritance:**
   - Code reusability.
   - Method overriding.
   - Easier code maintenance.

✅ **'super' Keyword:**
   - Used to call parent class methods and constructors.

✅ **Types of Inheritance:**
   - Single, Multilevel, Hierarchical, Multiple (via interfaces), Hybrid.

✅ **Best Practices:**
   - Avoid deep inheritance hierarchies.
   - Use 'protected' access modifier when appropriate.

*/

/* 📌 **INTERVIEW & PLACEMENT QUESTIONS WITH ANSWERS:**

1️⃣ **What is Inheritance?**
   - A mechanism where one class acquires the properties and methods of another class.

2️⃣ **What are the types of Inheritance?**
   - Single, Multilevel, Hierarchical, Multiple (via interfaces), Hybrid.

3️⃣ **What is the difference between 'extends' and 'implements'?**
   - 'extends' is used for class inheritance.
   - 'implements' is used for interface inheritance.

4️⃣ **What is method overriding?**
   - Redefining a method of a parent class in the child class.

5️⃣ **What is the 'super' keyword?**
   - It is used to refer to parent class members.

6️⃣ **Can constructors be inherited?**
   - No, but they can be called using 'super'.

7️⃣ **What is the difference between IS-A and HAS-A relationships?**
   - IS-A: Inheritance (Dog IS-A Animal).
   - HAS-A: Composition (Car HAS-A Engine).

8️⃣ **Why is inheritance important?**
   - Reduces code duplication and enhances maintainability.

9️⃣ **What happens if the parent and child have the same method?**
   - The child class method will override the parent method.

🔟 **Can we inherit multiple classes in Java?**
   - No, but multiple inheritance can be achieved using interfaces.
*/
