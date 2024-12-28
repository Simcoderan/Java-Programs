package Basics;
// 📌 **RELATIONAL AND LOGICAL OPERATORS IN JAVA**

/* 📚 **INTRODUCTION TO RELATIONAL AND LOGICAL OPERATORS**
- Relational operators are used to compare values and return a boolean result (`true` or `false`).
- Logical operators are used to combine multiple boolean expressions or conditions to produce a single boolean value.
*/

// 📚 RELATIONAL OPERATORS IN JAVA:

// ✅ `>` (Greater Than):
//    - Returns `true` if the left operand is greater than the right operand.
//    - Example: `x > y` (true if `x` is greater than `y`)

// ✅ `<` (Less Than):
//    - Returns `true` if the left operand is less than the right operand.
//    - Example: `x < y` (true if `x` is less than `y`)

// ✅ `>=` (Greater Than or Equal To):
//    - Returns `true` if the left operand is greater than or equal to the right operand.
//    - Example: `x >= y` (true if `x` is greater than or equal to `y`)

// ✅ `<=` (Less Than or Equal To):
//    - Returns `true` if the left operand is less than or equal to the right operand.
//    - Example: `x <= y` (true if `x` is less than or equal to `y`)

// ✅ `==` (Equal To):
//    - Returns `true` if both operands are equal.
//    - Example: `x == y` (true if `x` equals `y`)

// ✅ `!=`(Not Equal To):
//    - Returns `true` if both operands are not equal.
//    - Example: `x != y` (true if `x` does not equal `y`)


// 📚 LOGICAL OPERATORS IN JAVA:

// ✅ AND (`&&`):
//    - Returns `true` only if both conditions are true.
//    - Example: `x > y && a > b` (true if both `x > y` and `a > b` are true)
// ✅ OR (`||`):
//    - Returns `true` if at least one condition is true.
//    - Example: `x > y || a < b` (true if either `x > y` or `a < b` is true)
// ✅ NOT (`!`):
//    - Reverses the result of a condition.
//    - Example: `!result` (true if `result` is false)



// 📚 EXAMPLES:

/* Relational Operators Example */
/*
int x = 6;
int y = 9;
boolean result = x < y;  // true because 6 is less than 9
System.out.println(result);  // Output: true  */



/* Logical Operators Example */
/*

int a = 5;
int b = 9;
boolean result1 = x > y || a < b || a > 1;  // true because at least one condition is true
System.out.println(result1);  // Output: true

boolean result2 = x > y && a > b;  // false because both conditions are not true
System.out.println(result2);  // Output: false

boolean check = !(a > b);  // true because NOT reverses the result
System.out.println(check);  // Output: true




/* 📚 CONCEPT NOTES:


✅ Relational Operators:
   - Used to compare two values and return a boolean result (`true` or `false`).
   - Common relational operators include `>`, `<`, `>=`, `<=`, `==`, and `!=`.

✅ Logical Operators:
   - Used to combine multiple conditions or boolean expressions.
   - Key logical operators include AND (`&&`), OR (`||`), and NOT (`!`).

✅ Why Use Relational and Logical Operators?
   - They are essential for making decisions and controlling the flow of a program.
   - They help in checking multiple conditions and performing actions based on them.

✅ Best Practices:
   - Use relational operators to compare values.
   - Use logical operators to combine multiple boolean conditions.

*/



/* 📌 INTERVIEW & PLACEMENT QUESTIONS WITH ANSWERS:


1️⃣ What is the difference between relational and logical operators?
   - Relational operators compare two values (e.g., `x > y`), while logical operators combine multiple boolean expressions (e.g., `x > y && a > b`).

2️⃣ How does the AND (`&&`) operator work?
   - The AND operator returns `true` only if both conditions are true. If either condition is false, it returns `false`.

3️⃣ What does the NOT (`!`) operator do?
   - The NOT operator inverts the result of a boolean expression. If the expression is true, it returns false; if it's false, it returns true.

4️⃣ Can you give an example of using the OR (`||`) operator?
   - If you have `x > 5 || y < 10`, the expression will return true if either `x > 5` or `y < 10` is true.

5️⃣ Why are relational operators used in programming?
   - Relational operators are used to compare values, enabling the programmer to make decisions based on conditions.

6️⃣ What happens if you use a relational operator incorrectly?
   - If you incorrectly use a relational operator, the logic of your program may fail, leading to unintended behavior or errors.

7️⃣ Are relational operators case-sensitive?
   - No, relational operators are not case-sensitive, as they operate on numeric values or expressions.
*/


