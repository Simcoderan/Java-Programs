package Constructor;
// Class Hooman with private fields
class Hooman {
    
    // Instance variables (fields)
    private int age;   // Store the age of the human
    private String name; // Store the name of the human

    // Default constructor - no parameters, sets default values
    public Hooman() {  // Default Constructor
        // The default constructor is called automatically when an object is created
        // without passing any arguments. It sets default values to instance variables.
        age = 12;  // Default age is set to 12
        name = "john";  // Default name is set to "john"
    }

    // Parameterized constructor - allows setting custom values at object creation
    public Hooman(int age, String name) {  // Parameterized Constructor
        // "this" keyword refers to the current object
        this.age = age;  // Assign the passed age to the instance variable
        this.name = name;  // Assign the passed name to the instance variable
    }

    // Getter for age
    public int getAge() {
        return age;  // Returns the age of the human
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;  // Sets the age of the human
    }

    // Getter for name
    public String getName() {
        return name;  // Returns the name of the human
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;  // Sets the name of the human
    }
}

// Main class for testing the constructors
public class Construc {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Hooman obj = new Hooman();  // Calls the default constructor
        // The default constructor initializes age to 12 and name to "john"
        
        // Creating an object using the parameterized constructor
        Hooman obj1 = new Hooman(18, "Neha");  // Calls the parameterized constructor
        // The parameterized constructor sets age to 18 and name to "Neha"
        
        // Uncommenting the following lines will show the default values of obj
        // System.out.println(obj.getAge());  // Prints: 12
         System.out.println(obj.getName()); // Prints: "john"
        
        // You can use setters to change the values later
        // obj.setAge(11);  // Sets age to 11
        // obj.setName("Riya");  // Sets name to "Riya"
        // System.out.println(obj.getAge());  // Prints: 11
        // System.out.println(obj.getName()); // Prints: "Riya"
        System.out.println(obj1.getName());
    }
}

// Concepts:
// 1. **Default Constructor**:
//    - A constructor that does not take any parameters.
//    - If no constructor is defined by the user, Java automatically provides a default constructor.
//    - In this example, the default constructor sets default values for `age` and `name`.
//    - Interview Tip: Know that if a constructor is not provided, Java adds a default constructor with no arguments.


// 2. **Parameterized Constructor**:
//    - A constructor that takes arguments to initialize an object with custom values.
//    - The parameterized constructor is used here to initialize the `age` and `name` fields with values passed during object creation.
//    - Interview Tip: Be prepared to explain how constructors can be overloaded to allow for multiple ways of object initialization.


// 3. **Getters and Setters**:
//    - Getters are used to access private fields (encapsulation).
//    - Setters are used to modify the values of private fields.
//    - Example: `getAge()` returns the `age`, and `setAge(int age)` modifies it.
//    - Interview Tip: Understand the concept of encapsulation, which is used to protect the internal state of an object.


// 4. **`this` Keyword**:
//    - The `this` keyword is used to refer to the current object instance.
//    - In parameterized constructors, `this` helps differentiate between the parameter and instance variable.
//    - In the constructor `Hooman(int age, String name)`, `this.age` refers to the instance variable, and `age` refers to the parameter passed to the constructor.


// Interview Preparation Notes:
// 1. **Constructor Types**:
//    - Be able to explain the difference between a **default constructor** (no parameters) and a **parameterized constructor** (with parameters).
//    - Know how constructors are used to initialize objects when they are created.
//    - Be ready to explain the use of `this` in constructors and methods to access instance variables.

// 2. **Encapsulation**:
//    - In Java, encapsulation is the technique of keeping fields private and using getter and setter methods to access or modify them.
//    - Example: The `age` and `name` variables are private, and getters/setters are provided to access and modify their values.


// 3. **Overloading Constructors**:
//    - If multiple constructors are needed, you can create multiple constructors with different parameters, which is known as constructor overloading.
//    - Example: A constructor with no parameters (default) and a constructor with parameters (parameterized).


// 4. **Constructor Chaining**:
//    - In some cases, constructors can call other constructors. This is known as constructor chaining.
//    - Example: A constructor might call another constructor using `this()` to reuse code, but you should avoid infinite recursion.


// Common Interview Questions:
// 1. **What is the difference between a default constructor and a parameterized constructor?**
// 2. **Why is the `this` keyword used in Java constructors?**
// 3. **What is encapsulation, and how is it implemented in Java?**
// 4. **Can constructors be overloaded in Java? Explain with an example.**
// 5. **Can you call one constructor from another in the same class? If so, how?**
