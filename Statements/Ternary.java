package Statements;
public class Ternary {

    public static void main(String[] args) {
          
        int n = 4;
        int result = 0; // Initialize result

        // 📌 ---Ternary Operator--- (Shorthand for if-else)
        // Syntax: condition ? value_if_true : value_if_false
        result = n % 2 == 0 ? 10 : 20; // Assign 10 if n is even, otherwise 20

        // Output the result
        System.out.println(result);
    } 
}


/*📚 Important Concepts:

Ternary Operator:
A shorthand for if-else.
Syntax: condition ? value_if_true : value_if_false.
Example: n % 2 == 0 ? 10 : 20 assigns 10 if n is even, otherwise 20.


Modulo (%):
Returns the remainder when dividing. n % 2 == 0 checks if n is even.


Concise Conditional Logic:
Ternary operator allows simple conditions to be written in one line.



📌 Interview Questions:


1️⃣ What is the ternary operator in Java?
A shorthand for if-else. Syntax: condition ? value_if_true : value_if_false.

2️⃣ How does the ternary operator work?
Evaluates the condition. If true, returns the first value; if false, returns the second.

3️⃣ What are the advantages of the ternary operator?
More compact and concise than traditional if-else.

4️⃣ Can you chain multiple ternary operators?
Yes, but avoid making it too complex for readability.

5️⃣ What is the result of n % 2?
Returns 0 for even numbers, 1 for odd numbers.

6️⃣ When to use the ternary operator over if-else?
Use it for simple, concise conditions; avoid it for complex logic.





 */
