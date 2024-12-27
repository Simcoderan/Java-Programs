// 🔑 Interface in Java
// An interface defines a contract for classes to implement. It contains abstract methods and static final variables.

// 📌 Interface declaration
interface A {  
    // Variables in interfaces are implicitly public, static, and final.
    int price = 44; // Constant variable (must be initialized)

    // Abstract methods (implicitly public and abstract)
    void show();  
    void config();  
}

// 📌 Class implementing the interface
class B implements A {  
    // Overriding show() method from interface A
    @Override
    public void show() {
        System.out.println("in show");
    }

    // Overriding config() method from interface A
    @Override
    public void config() {
        System.out.println("in config");
    }
}

// 📌 Main class to demonstrate interface implementation
public class Inter {  
    public static void main(String[] args) {
        // 🔹 Interface reference pointing to a class object
        A obj;  
        obj = new B(); // Object of class B assigned to interface reference

        // 🔹 Calling methods using interface reference
        obj.show();  
        obj.config();  

        // 🔹 Accessing static variable from the interface
        System.out.println("Price: " + A.price);  
    }
}


/*  
🔑 **Interfaces in Java and Memory Allocation:**  

1️⃣ **No Heap Memory for Interfaces:**  
    - Interfaces **do not have their own memory on the heap.**  
    - They cannot be instantiated (`A obj = new A();` → ❌).  

2️⃣ **Static Variables in Interfaces:**  
    - Variables in an interface are **public static final** by default.  
    - These are stored in the **Method Area** (JVM memory), **not on the heap.**  

3️⃣ **Memory for Implementing Classes:**  
    - Memory is allocated on the **heap** only for the object of the implementing class (`new B()`).  
    - Interface references (`A obj`) **point to the object of the implementing class** (`B`).  

4️⃣ **Abstract Methods:**  
    - Methods in interfaces are abstract (`public abstract`) by default.  
    - They do not occupy memory in the heap.  

5️⃣ **Accessing Static Variables:**  
    - Static variables are accessed using the **interface name** (`A.price`).  
    - They are not tied to any instance.  

6️⃣ **Object Behavior:**  
    - `A obj = new B();` → Heap memory is allocated for the `B` object.  
    - `A` reference (`obj`) acts as a **pointer** to this object.  
*/



/*# 🔑 **One Class Can Implement Multiple Interfaces, But Cannot Implement an Abstract Class**

# 1️⃣ **Multiple Interface Implementation:**  
# - A single class can **implement multiple interfaces** in Java.  
# - Example: `class MyClass implements Interface1, Interface2 {}`  
# - This is because interfaces define only method signatures without implementation conflicts.

# 2️⃣ **Abstract Class Cannot Be Implemented:**  
# - An **abstract class cannot be implemented**, it can only be **extended**.  
# - Example (Correct): `class MyClass extends AbstractClass {}`  
# - Example (Incorrect): `class MyClass implements AbstractClass {}` → ❌  

# 3️⃣ **Why the Difference?**  
# - Interfaces are meant to define a **contract** (method declarations only).  
# - Abstract classes can have both **implemented and unimplemented methods**, and they act as a **base class** rather than a contract.

# 4️⃣ **Syntax Summary:**  
# - ✅ `class MyClass implements Interface1, Interface2 {}` → Allowed  
# - ✅ `class MyClass extends AbstractClass {}` → Allowed  
# - ❌ `class MyClass implements AbstractClass {}` → Not Allowed  
 */



