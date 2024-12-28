package Basics;
public class Statmod {

    // 📌 Static Block
    // The static block is used to initialize static variables when the class is loaded.
    // This block runs only once, when the class is first loaded into memory, 
    // and eliminates the need for initializing the static variable repeatedly in constructors or methods.

    // static {
    //     name = "Phone";  // Static variable initialization within static block
    // }

    // 📚 Class Loading
    // The class loader loads the class first, before creating any object of the class.
    // Since the static block and static variables are loaded when the class is loaded, 
    // the static block is executed before the creation of objects.

    // Important note: If you don't create an object of the class, the class will not be loaded into memory.

    // 📚 Loading a Class Using Class.forName()
    // In some cases, you may want to load a class dynamically using the Class.forName() method.
    // This can be used to load a class by name (as a string), even without creating an instance of the class.
    
    // Class.forName("Mobile");  // This loads the Mobile class dynamically

    // 📚 Static Method and Static Variable Usage
    // - Static methods can be called directly using the class name.
    // - Static variables can be accessed and used within static methods.
    // - You can also pass an object reference to access static variables in a static method.
    
    // Example of calling static method and using static variable:
    // Mobile.staticMethod();
    // System.out.println(Mobile.staticVariable);

    // Note: Static members are shared among all instances of the class and are accessed using the class name.
}



/*

📚Key Concepts:

Static Block:
A special block used to initialize static variables. The block is executed when the class is loaded, before any objects are created.

Class Loading:
The class loader loads the class into memory when it's first referenced or when explicitly loaded using Class.forName().

Static Methods and Variables:
Static methods and variables belong to the class, not instances.
They can be called directly using the class name without creating an object of the class.


Dynamic Class Loading with Class.forName():
This method allows loading a class dynamically by passing the class name as a string. It’s useful when you want to load classes at runtime without explicitly referencing them in the code.



📌 Interview Questions:


1️⃣ What is a static block in Java?
A static block is a special code block used for initializing static variables or performing initialization tasks when the class is loaded. It runs only once, the first time the class is referenced.


2️⃣ What is the difference between a static method and an instance method?
Static methods belong to the class and can be called without creating an object of the class. Instance methods belong to an instance of the class and require an object to be called.


3️⃣ How do static variables differ from instance variables?
Static variables are shared among all instances of a class and are accessed using the class name. Instance variables belong to specific objects, and each object has its own copy of instance variables.


4️⃣ What does Class.forName() do in Java?
Class.forName() is used to dynamically load a class at runtime using its fully qualified class name. It’s typically used when the class needs to be loaded but is not explicitly referenced in the code.


5️⃣ Can you call a static method using an object reference?
Yes, a static method can be called using an object reference, but it is not recommended. Static methods should ideally be called using the class name to maintain clarity that the method is class-level, not instance-level.


6️⃣ What happens if you don’t create an object of a class with static members?
The static members (variables and methods) of the class are still loaded when the class is loaded, even if no object of the class is created.


7️⃣ When is the static block executed in a Java program?
The static block is executed when the class is loaded into memory, which occurs either when the class is first referenced or when an instance is created (depending on the class loading mechanism). */