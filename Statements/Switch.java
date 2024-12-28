package Statements;
public class Switch {
  public static void main(String[] args) {
      int n = 1;

      // 📌 ---One Way (Using if-else Statements)---
      // In the one-way approach, you use a series of 'if-else if' statements to check each condition.
      // Example:
      // if (n == 1) 
      //    System.out.println("Monday");
      // else if (n == 2) 
      //    System.out.println("Tuesday");
      // ...
      // This method can be inefficient if there are too many conditions.

      /* 📌 ----Better Way (Using Switch Statement)---- */
      // The switch statement is used to compare a variable against multiple values (cases).
      // This is a more efficient way than using multiple 'if-else' conditions when there are several conditions to check.

      switch (n) {
          case 1:  // If n equals 1, print "Monday"
              System.out.println("Monday");
              break;  // Breaks out of the switch block after executing the matching case.
          case 2:  // If n equals 2, print "Tuesday"
              System.out.println("Tuesday");
              break;
          case 3:  // If n equals 3, print "Wednesday"
              System.out.println("Wednesday");
              break;
          case 4:  // If n equals 4, print "Thursday"
              System.out.println("Thursday");
              break;
          case 5:  // If n equals 5, print "Friday"
              System.out.println("Friday");
              break;
          case 6:  // If n equals 6, print "Saturday"
              System.out.println("Saturday");
              break;
          case 7:  // If n equals 7, print "Sunday"
              System.out.println("Sunday");
              break;
          default:  // If n does not match any case, print a default message
              System.out.println("Enter a valid number");
      }  // The switch statement matches the value of 'n' with cases and executes the corresponding block of code.
      
      // If you use n = 2, after the 2nd case, the break will prevent the execution of the following cases.
      // The 'break' statement is important to terminate the switch block after a match is found.
  }
}






/*📚 Important Concepts:

Switch Statement:
A control flow statement that evaluates a variable and executes different code blocks based on its value.
It is often more efficient and readable compared to using multiple if-else conditions when comparing a variable against many values.

Break Statement:
The break statement is used in the switch statement to terminate the case block and prevent the execution of the following cases.
Without break, the program will execute the next case, which is called "fall-through."

Default Case:
The default case is optional in a switch statement but provides a fallback option when none of the specified cases match.

Switch vs If-Else:
Use if-else when conditions involve ranges or complex conditions.
Use switch for simpler cases where you're comparing a single variable against different values.






📌 Interview Questions:


1️⃣ What is the difference between a switch statement and an if-else statement in Java?
switch is used for discrete values of a variable (like integers, characters, or enums) and is more efficient for multiple conditions. if-else can be used for more complex conditions like ranges or expressions.


2️⃣ What happens if you forget the break statement in a switch case?
Without break, the code will "fall-through" to the next case. It will execute the code for the current case and continue with the subsequent cases, even if the case condition is not met.


3️⃣ Can a switch statement evaluate multiple expressions or ranges?
No, the switch statement only compares a single expression to different constant values (like integers, characters, or strings). If you need to compare ranges or complex expressions, use if-else.


4️⃣ What types of data can be used in a switch statement in Java?
Java switch statements can work with int, char, String, enum, and the corresponding wrapper classes like Integer, Character. They cannot directly handle floating-point numbers or other complex types.


5️⃣ What is the purpose of the default case in a switch statement?
The default case is executed if none of the defined cases match the value being evaluated. It provides a fallback option for handling unexpected values.


6️⃣ Can a switch statement be used with strings in Java?
Yes, from Java 7 onwards, the switch statement can be used with String values.


7️⃣ What happens if the value of n does not match any case in a switch statement?
If no case matches, and if a default case is provided, the default block will be executed. If no default case exists, the program will do nothing.


8️⃣ Can you use multiple values for a single case in a switch statement?
No, a switch case can only check one value at a time. To handle multiple conditions for a single action, you can use a fall-through method or group multiple cases together. */