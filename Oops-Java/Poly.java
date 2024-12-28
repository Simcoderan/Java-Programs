// 📌 **POLYMORPHISM IN JAVA**

// 📚 **INTRODUCTION TO POLYMORPHISM**
// - Polymorphism means "many forms."
// - It allows one interface to be used for multiple functionalities.
// - It enables flexibility and scalability in code.

// 📚 **TYPES OF POLYMORPHISM**
// 1️⃣ **Compile-Time Polymorphism (Static Binding):**
//    - Achieved through **Method Overloading.**
//    - Behavior is resolved at compile-time.
// 2️⃣ **Run-Time Polymorphism (Dynamic Binding):**
//    - Achieved through **Method Overriding.**
//    - Behavior is resolved at runtime.

// 📚 **DYNAMIC METHOD DISPATCH**
// - Used to call overridden methods at runtime.
// - Base class reference refers to a child class object.

class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("in B show");
    }
}

class C extends A {
    @Override
    public void show() {
        System.out.println("in C show");
    }
}

public class Poly {
    public static void main(String[] args) {
        A obj = new A(); // Object of A
        obj.show();
        
        obj = new B(); // Object of B
        obj.show();
        
        obj = new C(); // Object of C
        obj.show();
    }
}

/* 📚 **CONCEPT NOTES:**

✅ **Polymorphism Definition:**
   - Ability of an object to take many forms.

✅ **Method Overloading:**
   - Multiple methods with the same name but different parameters.

✅ **Method Overriding:**
   - Child class redefines a parent class method.

✅ **Dynamic Method Dispatch:**
   - Runtime polymorphism using method overriding.

✅ **Key Advantages of Polymorphism:**
   - Improves code reusability.
   - Enhances scalability and maintainability.

✅ **Binding Types:**
   - Static Binding: At compile-time.
   - Dynamic Binding: At runtime.

✅ **Best Practices:**
   - Prefer method overriding for runtime flexibility.
   - Use method overloading for compile-time clarity.
*/

/* 📌 **INTERVIEW & PLACEMENT QUESTIONS WITH ANSWERS:**

1️⃣ **What is Polymorphism?**
   - The ability of an object to take multiple forms.

2️⃣ **What are the types of Polymorphism?**
   - Compile-Time and Run-Time.

3️⃣ **What is Method Overloading?**
   - Multiple methods with the same name but different parameters.

4️⃣ **What is Method Overriding?**
   - Redefining a parent class method in a child class.

5️⃣ **What is Dynamic Method Dispatch?**
   - Resolving overridden methods at runtime.

6️⃣ **What is the difference between Overloading and Overriding?**
   - Overloading: Compile-time, same method name, different parameters.
   - Overriding: Runtime, same method signature, different implementation.

7️⃣ **What is the difference between Static and Dynamic Binding?**
   - Static Binding: Compile-time.
   - Dynamic Binding: Runtime.

8️⃣ **Why is Polymorphism important?**
   - Enables flexibility, scalability, and cleaner code.

9️⃣ **Can static methods be overridden?**
   - No, static methods are bound at compile-time.

🔟 **What is the use of 'super' keyword in polymorphism?**
   - To call the parent class method explicitly.
*/
