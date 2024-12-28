package Basics;
// 📌 PACKAGES AND IMPORTS IN JAVA

// 📚 INTRODUCTION TO PACKAGES IN JAVA

// - A package is a way to organize related classes and interfaces.
// - Packages help avoid name conflicts and can also control access to classes.
// - The `java.lang` package is automatically imported in every Java program by default.



// 📚 PACKAGE AND CLASS EXAMPLES:

// ✅ Package Declaration:
//    - Classes can belong to specific packages. If no package is declared, the class belongs to the default package.
//    - Example: `package myPackage;`

// ✅ System Class in `java.lang`:
//    - `System` is a class that belongs to the `java.lang` package.
//    - Example: `java.lang.System` (automatically imported using `import java.lang.*`)
//    - You can directly use `System` in your program without importing since it's automatically available.

// ✅ IMPORTING PACKAGES AND CLASSES:
//    - To use classes from other packages, you need to import them.
//    - Example: `import java.util.*;` (Imports all classes from `java.util` package)
//    - The `*` symbol imports all the classes from the package, but not the sub-packages.
 
// ✅ IMPORTING SPECIFIC CLASSES:
//    - You can import a specific class from a package to avoid unnecessary imports.
//    - Example: `import java.util.Scanner;` (Imports only the `Scanner` class)



// 📚 CREATING AND SHARING PACKAGES:

// ✅ Unique Package Names:
//    - When you create your own package, make sure the package name is unique to avoid conflicts with existing packages.
//    - Package names should be meaningful, often related to the functionality of the classes within them.
//    - Example: `package com.example.utilities;`

// ✅ Access Control:
//    - The access level of classes and members (fields, methods) can be controlled using `public`, `private`, `protected`, and default access modifiers.




// 📚 EXAMPLES:

/* Example of Importing All Classes from a Package */
import java.util.*;  // Imports all classes from the java.util package

public class PackageExample {
    public static void main(String[] args) {
        try (// Using Scanner class from the java.util package
      Scanner scanner = new Scanner(System.in)) {
         System.out.println("Enter a number: ");
           int number = scanner.nextInt();
           System.out.println("You entered: " + number);
      }
    }
}



/* 📚 CONCEPT NOTES:

✅ Package Usage:
   - Organizes classes and interfaces logically.
   - Avoids name conflicts and improves code readability.

✅ Why Unique Package Names Matter:
   - Prevents name conflicts with other libraries or packages.
   - When sharing your code, others will be able to use it without clashes.

✅ Access Control:
   - `public`: Can be accessed from anywhere.
   - `private`: Can only be accessed within the same class.
   - `protected`: Can be accessed within the same package or subclasses.
   - Default (no modifier): Can be accessed within the same package.

✅ Best Practices:
   - Always declare packages at the top of your Java files.
   - Use meaningful and unique names for your packages, especially when you plan to share or distribute your code.
   - Be mindful of importing only what you need to optimize your program's memory usage.
*/


// 📌 INTERVIEW & PLACEMENT QUESTIONS WITH ANSWERS:

/* 
1️⃣ What is a package in Java?
   - A package is a collection of related classes and interfaces that are grouped together to avoid name conflicts and improve code organization.

2️⃣ What is the default package in Java?
   - The default package is the package that a class belongs to when no package is explicitly declared. All classes in this package do not require an import statement to be accessed.

3️⃣ What is the purpose of the `java.lang` package?
   - The `java.lang` package contains fundamental classes like `String`, `Math`, `System`, etc. It is automatically imported in every Java program, so you don't need to import it explicitly.

4️⃣ Can you explain the difference between `import java.util.*;` and `import java.util.Scanner;`?
   - `import java.util.*;` imports all the classes from the `java.util` package, while `import java.util.Scanner;` imports only the `Scanner` class from the package.

5️⃣ What is the significance of package names in Java?
   - Package names should be unique to avoid conflicts with other packages, especially when sharing or distributing libraries. Meaningful and descriptive package names help in better organization of code.

6️⃣ What is the access control in Java packages?
   - In Java, access to classes and their members can be controlled by using access modifiers like `public`, `private`, `protected`, and default (no modifier). These control visibility across packages and classes.

7️⃣ How do you create a package in Java?
   - A package is created using the `package` keyword followed by the package name at the beginning of the Java file. For example, `package com.example.utilities;`.

8️⃣ What happens if a package is not imported?
   - If a package is not imported, you cannot use the classes or methods from that package in your program. You will encounter a compile-time error.

9️⃣ Can we have multiple classes in one package?
   - Yes, you can have multiple classes in a single package. Packages are used to group related classes together.

🔟 What is the benefit of using `import` statements in Java?
   - The `import` statement allows you to use classes from other packages without having to specify their fully qualified names, making the code cleaner and easier to read.
*/