package String;
// 📌 **STRINGBUFFER IN JAVA**

// 📚 **INTRODUCTION TO STRINGBUFFER**
// - StringBuffer is a mutable sequence of characters.
// - It is synchronized (thread-safe).
// - Preferred when multiple threads might access it.

public class Strbuffer {
    public static void main(String[] args) {
        // 📌 Creating StringBuffer with Default Capacity (16 characters)
        StringBuffer sb = new StringBuffer("Simran"); // Initial capacity: 16 + length of "Simran"
        
        // 📌 Different Methods of StringBuffer
        sb.append(" Singh"); // Adds " Singh" to the existing string
        sb.deleteCharAt(2); // Removes character at index 2
        sb.insert(0, "Java "); // Inserts "Java " at the start
        sb.insert(7, "Java "); // Inserts "Java " at index 7
        sb.setLength(30); // Sets the length of StringBuffer to 30
        sb.ensureCapacity(100); // Ensures capacity is at least 100
        
        System.out.println(sb); // Output the final result
        
        // 📌 Converting StringBuffer to String
        String str = sb.toString();
        System.out.println("Converted to String: " + str);
    }
}

/* 📚 **CONCEPT NOTES:**

✅ **StringBuffer vs String:**
   - String: Immutable (Cannot be changed).
   - StringBuffer: Mutable (Can be changed).

✅ **Key Methods of StringBuffer:**
   - `append(String)` → Adds text at the end.
   - `insert(int, String)` → Inserts text at a specified index.
   - `deleteCharAt(int)` → Removes character at a specified index.
   - `setLength(int)` → Sets the length of the string.
   - `ensureCapacity(int)` → Ensures minimum capacity.
   - `toString()` → Converts StringBuffer to String.

✅ **Memory Management:**
   - StringBuffer uses a dynamic array to manage storage.
   - Default Capacity: 16 characters (increases dynamically).

✅ **Thread-Safety:**
   - StringBuffer is synchronized, making it thread-safe.

✅ **Performance:**
   - StringBuffer is slower compared to StringBuilder because of synchronization.

*/

/* 📌 **INTERVIEW & PLACEMENT QUESTIONS WITH ANSWERS:**

1️⃣ **What is StringBuffer?**
   - A mutable, thread-safe class used for creating and manipulating strings.

2️⃣ **What is the difference between String and StringBuffer?**
   - String: Immutable.
   - StringBuffer: Mutable.

3️⃣ **Why is StringBuffer synchronized?**
   - To make it thread-safe in multi-threaded environments.

4️⃣ **What is the default capacity of StringBuffer?**
   - 16 characters.

5️⃣ **What happens when StringBuffer exceeds its capacity?**
   - Capacity increases automatically (current capacity * 2 + 2).

6️⃣ **Explain the difference between `append` and `insert` in StringBuffer.**
   - `append`: Adds text at the end.
   - `insert`: Adds text at a specific index.

7️⃣ **How to convert StringBuffer to String?**
   - Using the `toString()` method.

8️⃣ **What is the use of `setLength` in StringBuffer?**
   - Adjusts the length of the string.

9️⃣ **Which is faster: StringBuffer or StringBuilder?**
   - StringBuilder (It is not synchronized).

10️⃣ **When to use StringBuffer vs StringBuilder?**
   - StringBuffer: Multi-threaded environments.
   - StringBuilder: Single-threaded environments.

*/
