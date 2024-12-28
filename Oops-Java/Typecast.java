 //upcasting and downcasting


 class A
 {

    public void show1()
    {
        System.out.println("in A show");

    }

 }

 class B extends A
  {
    public void show2()
    {
        System.out.println("in B show");


    }


 }
 public class Typecast {


    public static void main(String[] args) {

        //Firstly Typecasting

        //double d=4.5;
        //int i=(int) d;


        A obj= (A) new B();   //upcasting
        obj.show1();    //obj.show2 cant access  becz  A obj=new A();


         B obj1 =(B) obj; //downcasting
         obj1.show2();


    }
 }


 /*📚 Key Concepts:

Upcasting:
Definition: Converting a subclass object to a superclass type.
Explanation: When you assign a B class object to an A class reference, it’s called upcasting. Upcasting is implicit and doesn’t require explicit casting because a subclass object is always a superclass object.
Example: A obj = (A) new B();
The object of class B is treated as an object of class A. You can access only the methods of class A.


Downcasting:
Definition: Converting a superclass object back to a subclass type.
Explanation: Downcasting is explicit and requires casting. It is allowed when you're sure that the object being referenced is actually an instance of the subclass.
Example: B obj1 = (B) obj;
After downcasting, you can access methods specific to class B.


Typecasting:
Typecasting refers to converting one type of object into another, either implicitly (upcasting) or explicitly (downcasting).


📌 Interview Questions:


1️⃣ What is upcasting in Java?
Upcasting refers to converting an object of a subclass type to a superclass type. It’s an implicit type conversion, as the subclass object is always a superclass object.


2️⃣ What is downcasting in Java?
Downcasting is the process of converting a superclass object to a subclass object. It requires explicit casting and is done when you need to access subclass-specific methods.


3️⃣ Is upcasting implicit or explicit in Java?
Upcasting is implicit because a subclass is a type of its superclass. There’s no need for explicit casting.


4️⃣ Is downcasting implicit or explicit in Java?
Downcasting is explicit because it may cause a ClassCastException if the object being cast is not an instance of the subclass.


5️⃣ What will happen if you downcast to the wrong class type?
It will throw a ClassCastException at runtime if the object is not an instance of the class you are downcasting to.


6️⃣ Can we access subclass-specific methods in upcasting?
No, in upcasting, you can only access methods that are common to both the superclass and subclass (i.e., methods in the superclass).


7️⃣ Can we downcast an object without checking its type?
It’s not safe. You should always check the type of the object using instanceof before downcasting to avoid a ClassCastException.


8️⃣ What is the main difference between upcasting and downcasting?
Upcasting converts a subclass object to a superclass type (implicit). Downcasting converts a superclass object to a subclass type (explicit). */