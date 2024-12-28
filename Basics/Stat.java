package Basics;
// 📌 STATIC IN JAVA

/*
The static keyword is used in Java to indicate that a variable or method belongs to the class, rather than to instances (objects) of the class.
Static members are shared across all instances of the class.
*/

// 📚 Static Variable

// A static variable is shared by all objects of a class. 
// It is initialized only once when the class is loaded into memory, and it has the same value across all instances.
// Example: 'name' is a static variable, shared across all Mobile objects.

class Mobile {
   int price;  // Instance variable: unique to each object
   String brand;  // Instance variable: unique to each object
   static String name;  // Static variable: shared by all objects of the class

   // 📚 Static Method - show()
   // Instance method that can access both instance and static variables.
   // Static variables like 'name' can be accessed using the class name or an object reference.
   public void show() {
       System.out.println(brand + " : " + price + " : " + name);  // Accessing instance and static variables
   }
}

// 📚 Main Method - Execution starts here
// The main method is the entry point of the program. In this example, we are creating objects and modifying static variables.

public class Stat {
   public static void main(String[] args) {
       
       // 📚 Creating First Object (obj1)
       Mobile obj1 = new Mobile();  // Creating an object obj1 of the Mobile class
       obj1.brand = "Oppo";  // Setting instance variable 'brand' for obj1
       obj1.price = 60;  // Setting instance variable 'price' for obj1
       Mobile.name = "Smartphone";  // Setting static variable 'name' for the class (affects all objects)
       
       // 📚 Creating Second Object (obj2)
       Mobile obj2 = new Mobile();  // Creating an object obj2 of the Mobile class
       obj2.brand = "Apple";  // Setting instance variable 'brand' for obj2
       obj2.price = 90;  // Setting instance variable 'price' for obj2
       Mobile.name = "Phone";  // Changing the static variable 'name', which affects both obj1 and obj2
       
       // 📚 Modifying Static Variable Directly
       obj1.name = "Mob";  // Changing static variable 'name' through obj1, now both obj1 and obj2 share the same 'name'

       // 📚 Displaying Values Using show() Method
       obj1.show();  // Output: Oppo : 60 : Mob
       obj2.show();  // Output: Apple : 90 : Mob
   }
}




/*📚 Key Concepts:

Static Variables:
Shared by all objects of the class. Only one copy exists for the entire class.

Static Methods:
Belong to the class, can only access static variables/methods. Can be called without an object.

Instance vs Static:
Instance Variables/Methods: Unique to each object.
Static Variables/Methods: Shared across all objects, belonging to the class.

Static Blocks:
Code executed once when the class is loaded. Used for static initialization.
java
 Code:

static {
    System.out.println("Class loaded");
}


📌 Interview Questions:


1️⃣ What is the static keyword?

Used for class-level variables and methods, shared among all objects.

2️⃣ Difference between static and non-static variables?

Static: Shared among all objects.
Non-static: Unique to each object.

3️⃣ Difference between static and non-static methods?

Static: Can only access static members.
Non-static: Can access both static and non-static members.

4️⃣ Can static methods be called without an object?

Yes, by using the class name: ClassName.staticMethod().


5️⃣ What is a static block?

Code executed once when the class is loaded. Useful for static initialization.

6️⃣ What happens if you change a static variable in one object?

The change reflects in all objects, as static variables are shared.

7️⃣ Can static methods be overridden?

No, static methods cannot be overridden, but they can be hidden in subclasses.

8️⃣ Can we access instance variables from a static method?

No, static methods cannot access instance variables directly. */