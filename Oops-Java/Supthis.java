/*  📌 MULTILEVEL INHERITANCE IN JAVA
 Multilevel inheritance occurs when a class is derived from a class that is already derived from another class.
Java supports multilevel inheritance, where a subclass inherits from a superclass, and another subclass inherits from the first subclass.*/


class D extends Object {  // Every class in Java extends Object class implicitly, even if not mentioned.
    public D() {
        super();  // Calls the constructor of the Object class (implicitly there)
        System.out.println("in D");
    }

    public D(int z) {
        super();  // Calls the constructor of the Object class (implicitly there)
        System.out.println("in int D");
    }
}

class E extends D {  // Class E inherits from class D (multilevel inheritance)
    public E() {
        super();  // Calls the constructor of D (implicitly there)
        System.out.println("in E");
    }

    public E(int z) {
        this();  // Calls the default constructor of class E, which will call D's constructor first
        System.out.println("with int E");
    }
}

public class Supthis {
    public static void main(String[] args) {
        // Create an object of class E using the constructor with an integer parameter
        E obj3 = new E(6);  // Output: in D, in E, with int E
    }
}







/*📚 Key Concepts:

Multilevel Inheritance:
When class E inherits from class D, and class D inherits from Object (implicitly).
Class E is indirectly a subclass of Object through D.

Constructor Call:
The super() call is automatically added to call the constructor of the superclass.
You can explicitly call super() or this() in the subclass constructor to invoke the parent or sibling class constructor.

Constructor Flow in Multilevel Inheritance:
If a subclass has multiple constructors, you can call the parent class constructors using super(), and even call sibling constructors using this().

Implicit super():
Even if super() is not mentioned, it’s called by default to invoke the constructor of the Object class, which is the root class in Java.





📌 Interview Questions:

1️⃣ What is multilevel inheritance?
Multilevel inheritance occurs when a class derives from another class, and that class is derived from another, forming a chain.


2️⃣ Does every class in Java extend the Object class?
Yes, every class in Java implicitly extends the Object class, even if it's not explicitly mentioned.


3️⃣ What is the role of super() in a constructor?
super() is used to call the constructor of the superclass. If not mentioned, the default constructor is called automatically.


4️⃣ What is the difference between super() and this() in constructors?
super() calls the constructor of the superclass.
this() calls another constructor in the same class.


5️⃣ Can we call super() multiple times in a constructor?
No, super() can only be called once, and it must be the first statement in the constructor.


6️⃣ What happens when super() is not explicitly used?
Java automatically calls the no-argument constructor of the superclass.


7️⃣ What is the significance of the Object class in Java?
All Java classes inherit from the Object class, which provides common methods like toString(), equals(), and hashCode(). 


8️⃣ Can super() and this() be used together?
No, super() and this() cannot be used in the same constructor because both must be the first statement in the constructor.*/