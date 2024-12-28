// ENCAPSULATION: Hiding the internal state of an object and exposing only necessary functionality
// Encapsulation is a fundamental concept in OOP where data (variables) and methods that operate on data 
// are bundled together, and access to data is controlled by methods called getters and setters.

class Human {
    // Instance variables: These represent the state of the object. 
    // They are marked private to restrict direct access from outside the class.
    private int age;  // 'private' ensures that this variable can only be accessed within the same class
    String name;      // 'name' is package-private, meaning it can be accessed by classes in the same package

    // Getter method for 'age': This allows other classes to retrieve the value of age
    // The method is public, so it is accessible from outside the class.
    public int getAge() {
        return age; // Returns the private age variable
    }

    // Setter method for 'age': This allows other classes to modify the value of age
    // The method is public, so it is accessible from outside the class.
    public void setAge(int a) {
        age = a;  // Assign the provided value to the private 'age' variable
    }
}

public class Encap {
    public static void main(String[] args) {
        // Creating an object of Human class
        Human obj = new Human();  // Creates an object of the Human class

        // We cannot directly access 'age' because it's private
        // obj.age = 11;  // This would result in a compile-time error: age has private access in Human class

        // Instead, we use the setter method to assign a value to 'age'
        obj.setAge(11);  // This allows us to set the age indirectly using the setter method

        // We can access 'age' using the getter method and print it
        System.out.println(obj.getAge());  // Prints: 11
    }
}

/*
Concept Notes:

1. **Encapsulation**: Encapsulation is a key OOP concept that involves bundling the data (variables) 
   and methods that operate on the data together. It restricts direct access to some of the object's 
   components and can prevent the accidental modification of data. In Java, encapsulation is achieved by 
   making the variables private and providing public getter and setter methods to access or modify them.

2. **Private Access Modifier**: 
   - The `private` keyword restricts access to the variable so it cannot be accessed from outside the class.
   - This ensures that the object’s internal state remains protected and any changes must go through getter/setter methods, allowing validation or additional logic.

3. **Getter and Setter Methods**: 
   - **Getters** allow other classes to access private variables safely without directly exposing them.
   - **Setters** allow modifying the private variables safely. This can include additional logic or validation if necessary.
   
Interview Preparation Insights:

1. **Why is encapsulation important?**
   - Encapsulation is important for protecting the internal state of objects. It ensures that an object's data cannot be changed in unexpected ways. This makes software more reliable, maintainable, and secure.
   - By providing access to the data through controlled methods (getters and setters), you can easily modify the behavior without affecting other classes that depend on the object.

2. **What is the difference between private, protected, and public access modifiers?**
   - **Private**: The variable or method is accessible only within the same class. This ensures strict data hiding and is the core of encapsulation.
   - **Protected**: The variable or method is accessible within the same package and by subclasses (even if they are in different packages).
   - **Public**: The variable or method is accessible from any other class.

Interview Questions & Explanation:

1. **Why is encapsulation used in Java?**
   - Encapsulation is used to hide the internal implementation of an object and only expose the necessary functionalities to the outside world. This allows developers to change the internal working of the class without affecting other classes that depend on it. It also helps in protecting data from being changed directly.

2. **Can you explain the concept of data hiding and how it is implemented in Java?**
   - Data hiding is a concept related to encapsulation, where the internal state of an object is hidden from the outside world. In Java, data hiding is implemented by declaring instance variables as private and providing public methods (getters and setters) to access and modify these variables safely.

3. **What is the difference between encapsulation and abstraction?**
   - **Encapsulation**: It focuses on hiding the internal state of an object and providing methods to access and modify that state. It is more about data protection and integrity.
   - **Abstraction**: It focuses on hiding the complexity of an implementation and showing only the necessary features to the user. It simplifies the interaction with complex systems.

4. **Why are setter methods used in encapsulation?**
   - Setter methods are used to set values for private instance variables. They provide controlled access to the internal state of an object, allowing validation or additional logic before changing the state.

5. **Why do we need getters and setters? Can't we directly access private fields?**
   - Getters and setters are used for maintaining the integrity of the object by controlling how the data is accessed and modified. Direct access to private fields would allow external manipulation of an object’s state, which could potentially introduce bugs or unwanted behavior. Getters and setters ensure data consistency by allowing validation or logic to be implemented before modifying an object's internal state.

6. **What would happen if you don't use encapsulation in your code?**
   - If encapsulation is not used, the internal state of an object would be exposed to the outside world. This would allow any class to modify the state, potentially leading to data corruption, bugs, or inconsistent object behavior. Without encapsulation, it becomes difficult to maintain and modify the code.

7. **Can you explain how encapsulation is implemented in Java?**
   - In Java, encapsulation is implemented by declaring the class variables as private and then providing public getter and setter methods to access and modify these variables. This ensures that the internal state of the object is protected and can only be changed through controlled methods.

Real-World Example:

**Bank Account System**: In a real-world banking system, a `BankAccount` class might have private fields like balance and account number.
- We wouldn't allow users to directly change the balance because it could lead to security issues.
- Instead, we provide methods like `deposit` and `withdraw` to control how the balance is updated, ensuring that users can't withdraw more than the available balance or perform other invalid operations.

Code Example:

class BankAccount {
    private double balance;  // Private variable to hold account balance
    
    // Constructor to initialize balance
    public BankAccount(double balance) {
        this.balance = balance;
    }
    
    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Setter method for balance (e.g., deposit)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money, ensuring that the balance cannot be negative
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

// Main method to test encapsulation in a banking system
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);  // Create account with an initial balance
        System.out.println("Initial Balance: " + account.getBalance());  // Access balance via getter
        
        account.deposit(500);  // Deposit money into the account
        System.out.println("Balance after deposit: " + account.getBalance());  // Access balance again
        
        account.withdraw(200);  // Withdraw money from the account
        System.out.println("Balance after withdrawal: " + account.getBalance());  // Access balance again
    }
}
*/