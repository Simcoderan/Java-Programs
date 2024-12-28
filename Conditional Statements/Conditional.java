public class Conditional {
   public static void main (String[] args) {
       
       // Example with two numbers x and y
       int x = 5; // Initializing x with 5
       int y = 7; // Initializing y with 7

       // Find the greatest number between x and y using if-else
       if (x > y) { // Check if x is greater than y
           // If x is greater than y
           System.out.println(x);  // Output: 5
           System.out.println("Thank you"); // Additional statement printed if x is greater than y
       } else {
           // If y is greater than or equal to x
           System.out.println(y);  // Output: 7
       }

       // Example with three numbers x, y, and z
       int z = 9; // Initializing z with 9

       // Find the greatest number among x, y, and z using if-else if-else
       if (x > y && x > z) { // Check if x is greater than both y and z
           // If x is greater than both y and z
           System.out.println(x);  // Output: x is the greatest
       } else if (y > x && y > z) { // If y is greater than both x and z
           // If y is greater than both x and z
           System.out.println(y);  // Output: y is the greatest
       } else {
           // If neither x nor y is greater, then z is the greatest
           System.out.println(z);  // Output: z is the greatest
       }
   }
}

/* 
   Key Concepts in Conditional Statements:

   1. **If-Else Statements**:
      - The `if` statement evaluates a condition and executes the associated block of code if the condition is true.
      - The `else` statement executes when the `if` condition is false.
      - Example: We use if-else to compare `x` and `y` to find which is greater.
   
   2. **Logical Operators**:
      - **`&&` (AND)**: Evaluates to true only if both conditions are true.
      - **`||` (OR)**: Evaluates to true if at least one condition is true.
      - Example: The condition `x > y && x > z` checks if `x` is greater than both `y` and `z`.

   3. **Else If Ladder**:
      - Used when multiple conditions need to be checked.
      - Allows for more than two outcomes based on different conditions.
      - Example: The `else if` block checks if `y` is the greatest, and the final `else` handles the case where `z` is the greatest.
   
   4. **Nesting of Conditional Statements**:
      - One conditional block can be inside another, allowing for complex decision-making processes.
      - Example: The second block checks multiple conditions using nested `if-else` to determine the greatest of three numbers.

   **Interview Notes**:

   1. **Understanding Conditional Logic**:
      - Conditional statements are fundamental in interviews as they test your ability to make decisions based on conditions.
      - Common interview tasks involve comparing numbers, checking multiple conditions, and implementing decision-making logic.
   
   2. **Common Interview Questions**:
      - **"Find the largest of three numbers."**
        - This problem can be solved using `if-else` or `else if` blocks, which is the approach used in this code.
      - **"Find the second-largest number in an array."**
        - This requires checking all elements in the array to find the largest and second-largest numbers.
   
   3. **Edge Cases**:
      - Always consider edge cases such as:
        - All numbers being equal (e.g., `x = y = z`).
        - Negative numbers or zero in the comparison.
        - Example: If `x = 0, y = 5, z = -3`, the logic should handle these cases properly.

   4. **Time Complexity Considerations**:
      - For comparing a fixed number of variables (like `x`, `y`, `z`), the time complexity is **O(1)**.
      - However, if you were to find the largest number in an array of `n` elements, the time complexity would be **O(n)** since each element needs to be checked once.
   
   5. **Common Coding Challenges**:
      - **Finding the maximum or minimum in an array**: You need to compare each element in the array.
      - **Determining if a number is prime**: This involves checking if the number is divisible by any smaller numbers.
      - **Even or odd check**: A simple task to check whether a number is divisible by 2.

   6. **Interview Strategy**:
      - Always break down the problem into smaller parts.
      - Understand the conditions you're checking, and write clear and concise code.
      - Handle edge cases where numbers might be equal or have different signs (positive/negative).

   Example Interview Question:
   Q1: "Write a program to find the largest of three numbers."
   - This can be answered with `if-else` logic as demonstrated.
   
   Q2: "How would you modify this code to handle more than three numbers?"
   - Use a loop to iterate over an array of numbers, comparing each one to find the maximum.
   
   Q3: "What if all numbers are equal? How would you handle that case?"
   - You can add an extra check at the beginning of the code to see if all the numbers are equal and handle that case explicitly.

   In conclusion, mastering conditional statements is essential for both programming interviews and real-world coding challenges. It's important to practice these concepts and think about various edge cases to handle all possibilities.
*/
