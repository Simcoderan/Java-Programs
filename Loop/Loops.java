package Loop;

public class Loops {

  public static void main(String[] args)
  {
      // The purpose of loops is to repeat a block of code multiple times.
      // We will demonstrate the different types of loops: while, do-while, and for loops, which are used based on specific conditions and use cases.

      // ----- WHILE LOOP -----
      int i = 1;  // Initialization: Starting point of the loop

      // While loop: Executes as long as the condition is true.
      // In this case, the loop will run as long as i is less than or equal to 4.
      while (i <= 4)  // Condition: Loop will continue as long as i is less than or equal to 4
      {
          System.out.println("Hi " + i);  // Print the value of i
          
          // Nested While Loop: A loop inside another loop
          int j = 1;  // Initialization for the nested loop
          while (i <= 3) {  // Condition for the nested loop
              System.out.println("Hello " + j);  // Print "Hello" with j value
              j++;  // Increment the inner loop counter
          }
          i++;  // Increment the outer loop counter
      }

      System.out.println("Bye " + i); // Print "Bye" after the outer loop finishes, i will be 5 here

      // ----- DO-WHILE LOOP -----
      int c = 1;  // Initialization: Starting point of the loop

      // Do-while loop: Executes the block of code once before checking the condition
      // The loop runs at least once, even if the condition is false after the first iteration.
      do {
          System.out.println("hi " + c);  // Print "hi" with the current value of c
          c++;  // Increment the loop counter
      } while (c <= 4);  // Condition: Loop runs while c is less than or equal to 4

      // ----- FOR LOOP -----
      // For loop: A concise loop that contains initialization, condition, and increment/decrement in one line.
      // For loops are useful when the number of iterations is known in advance.

      // Example of a simple for loop that prints "hi" followed by the loop counter value
      for (int v = 1; v <= 4; v++) {
          System.out.println("hi " + v);  // Print "hi" with the value of v
      }

      // Nested For Loop: Prints the days of the week and the corresponding working hours
      // This example prints "DAY 1" through "DAY 7" and the corresponding work hours for each day.
      for (int a = 1; a <= 7; a++) {  // Outer loop for the days
          System.out.println("DAY " + a);  // Print the current day

          // Nested For loop for printing the working hours from 9 AM to 6 PM
          for (int b = 1; b <= 9; b++) {  // Inner loop for the hours
              System.out.println(" " + (b + 8) + " - " + (b + 9));  // Print the time range (9 AM to 6 PM)
          }
      }
  }
}












// Concept Notes:
// 1. **While Loop**:
//    - A `while` loop repeatedly executes a block of code as long as the given condition is true.
//    - It is useful when the number of iterations is not known in advance and you want the loop to run based on a dynamic condition.


// 2. **Do-While Loop**:
//    - A `do-while` loop is similar to the `while` loop but guarantees that the loop will run at least once, because the condition is checked after executing the code block.
//    - This is useful when you need to ensure that the code runs at least once before checking the condition.


// 3. **For Loop**:
//    - The `for` loop is often used when the number of iterations is known beforehand (like iterating over arrays, or printing days of the week).
//    - It allows initialization, condition, and increment/decrement to be written in a single line, making it a more compact and efficient loop for fixed iterations.


// 4. **Nested Loops**:
//    - Nested loops are loops inside another loop. They are useful when you need to perform iterations within iterations (like printing hours for each day of the week).
//    - Care must be taken with nested loops, as the complexity increases with each added layer, leading to higher execution time and potentially slower performance.




// Interview/Placement Points:

// 1. Difference Between While, Do-While, and For Loops:
//    - While Loop: Used when you do not know the number of iterations in advance and want the loop to continue as long as the condition holds true.
//    - Do-While Loop: Ensures the loop runs at least once before checking the condition. This is useful for scenarios where you want the code to execute once regardless of the condition.
//    - For Loop: Ideal when the number of iterations is known upfront (e.g., iterating over arrays, or a fixed range of numbers).


// 2. Performance Considerations:
//    - While the performance of these loops is generally similar, using nested loops carelessly can lead to inefficiency, especially in large data sets. Consider optimizing the loop conditions or breaking out of loops early when possible to improve performance.


// 3. Time Complexity:
//    - **While Loop**: Has a time complexity of O(n) where n is the number of iterations.
  // - **Do-While Loop**: Also has a time complexity of O(n), but with at least one guaranteed iteration.
  // - **For Loop**: Also has a time complexity of O(n) for a loop running n times, but when nested, it results in O(n^2), O(n^3), etc., depending on the depth of nesting.
  // - For example, the nested loop printing the working hours (9 AM to 6 PM) for each day has a time complexity of O(m * n), where m is the number of days and n is the number of working hours.


// 4. Best Practices:
//    - Always ensure that your loops have a well-defined termination condition to avoid infinite loops, which can cause your program to hang or crash.
  // - Try to use the most appropriate loop based on your requirement:
    // - **For loops** are ideal when you know the number of iterations beforehand.
    // - **While loops** are perfect when the termination condition depends on dynamic values.
    // - **Do-while loops** are useful for executing code at least once, even if the condition is initially false.


// 5. Loop Control Statements:
//    - **Break**: Exits the loop immediately.
  // - **Continue**: Skips the current iteration and moves to the next iteration of the loop.
  // These can help in optimizing loops by controlling the flow and reducing unnecessary iterations.

