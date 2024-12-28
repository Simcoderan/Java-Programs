package String;
// 📌 **STRING MUTABILITY IN JAVA**

public class Mut {

    public static void main(String a[]) {
        // 📌 **IMMUTABLE STRING EXAMPLE**
        String name = "sim"; // This is an immutable string.
        // Once a string is created, it cannot be changed.
        // Any modification creates a new object in the heap memory.
        
        name = name + "singh"; // A new object is created in heap memory with value "simsingh".
        // The previous object "sim" becomes eligible for garbage collection.
        
        System.out.println("Hello " + name); // Output: Hello simsingh

        // 📌 **STRING LITERAL POOL (STRING CONSTANT POOL)**
        String s1 = "Simran"; // Stored in the String pool in heap memory.
        String s2 = "Simran"; // Points to the same object as s1.
        // Java optimizes memory by reusing string literals from the string pool.
        
        System.out.println(s1 == s2); // true (both reference the same object)
        System.out.println(s1.equals(s2)); // true (content is the same)
    }
}

/* 📚 **CONCEPT NOTES:**

✅ **String in Java:**
   - Strings are immutable in Java (once created, cannot be changed).
   - Any modification creates a new object in heap memory.

✅ **Why are Strings Immutable?**
   - Security: Prevents unauthorized modifications (e.g., in class loaders).
   - Caching: String literals are cached in the String pool.
   - Synchronization: Strings are thread-safe.

✅ **Memory Management:**
   - **Heap Memory:** Stores objects.
   - **String Pool:** Special memory area within the heap for string literals.
   - **Garbage Collection:** Unused string objects are removed.

✅ **Mutable Strings in Java:**
   - **StringBuffer:** Thread-safe, synchronized, slower.
   - **StringBuilder:** Non-thread-safe, faster, better for single-threaded programs.

✅ **Difference Between == and .equals():**
   - `==` compares references (memory addresses).
   - `.equals()` compares the content of strings.

*/

/* 📌 **INTERVIEW & PLACEMENT QUESTIONS WITH ANSWERS:**

1️⃣ **What is the difference between String, StringBuffer, and StringBuilder?**
   - String: Immutable
   - StringBuffer: Mutable, thread-safe
   - StringBuilder: Mutable, not thread-safe

2️⃣ **Why are strings immutable in Java?**
   - For security, caching, and thread-safety.

3️⃣ **Explain the difference between == and .equals() when comparing strings.**
   - `==` checks memory reference, `.equals()` checks content.

4️⃣ **What is the String Constant Pool?**
   - A memory area in the heap for string literals to avoid duplication.

5️⃣ **Which is faster: StringBuffer or StringBuilder? Why?**
   - StringBuilder, because it is not synchronized.

6️⃣ **What happens when you modify a String in Java?**
   - A new string object is created.

7️⃣ **Explain the concept of garbage collection in relation to Strings.**
   - Unused string objects are removed to free memory.

8️⃣ **Why is it recommended to use StringBuilder over StringBuffer in single-threaded applications?**
   - StringBuilder is faster as it avoids synchronization overhead.

9️⃣ **Can a string object be garbage collected? If yes, when?**
   - Yes, if there are no active references.

10️⃣ **How does JVM handle string literals?**
   - JVM stores string literals in the String Constant Pool for memory efficiency.

*/



     //want mutuable strings?
//----we have 2 types for this----//
       //-STRING BUFFER
       //-STRING BUILDER