class F {
    public F() {
        System.out.println("Object created");
    }

    public void show() {
        System.out.println("in F show");
    }
}

public class Anonym {
    public static void main(String[] args) {
        // ✅ Referenced Object
        // F obj4 = new F();   
        // obj4.show();

        // ✅ Anonymous Object
        new F(); // Object created (No method called)
        
        new F().show(); // Object created, show() called
        new F().show(); // Another new object created, show() called again
    }
}



/*# ✅ Anonymous Object in Java

# 1️⃣ What is an Anonymous Object? 
# - An **anonymous object** is an object **created without a reference variable**.  
# - Example: `new F();`  

# 2️⃣ Usage:
# - Used when **an object is needed only once**.  
# - No need to store the object reference in a variable.  
# - Example: `new F().show();`  

# 3️⃣ Memory Allocation:  
# - **STACK MEMORY:** Holds the **reference variable** (if any).  
# - **HEAP MEMORY:** Allocates memory for the **object itself**.  
# - For anonymous objects, **only heap memory is used** since no reference variable exists.

# 4️⃣ Drawbacks: 
# - Cannot reuse the anonymous object since it lacks a reference.  
# - Each call creates a **new object in the heap**.

# 5️⃣ Example Explanation:  
# ✅ `new F();` → Object created, constructor runs, but cannot call methods.  
# ✅ `new F().show();` → Object created, method `show()` called, object discarded.  
# ✅ `new F().show();` → A new object is created again for the second call.
 */
