package Arrays;
public class Arr 
{

    public static void main(String[] args) {

        // 1. Single-dimensional array

        
        // An array is a collection of elements, all of the same type, stored in contiguous memory locations.
        // In Java, arrays are objects, so they are stored in the heap memory.
        
        int nums[] = {3, 7, 2, 4};  // Array initialization and assignment
        
        nums[1] = 6;  // Modifying the value at index 1 (arrays are mutable)
        
        // Accessing array elements by their index (arrays are zero-indexed in Java)
        System.out.println("Single-dimensional array:");
        System.out.println("First element: " + nums[0]);  // Prints the value at index 0

        // Creating an array with default values (0 for integers, false for booleans, etc.)
        int nums1[] = new int[4]; 
        System.out.println("Default value in nums1[1]: " + nums1[1]);  // Prints default value 0

        // **Key Concept**: Arrays are fixed in size once created, and elements are stored contiguously in memory.
        // **Time Complexity**: Accessing elements is O(1), but insertion and deletion are O(n) for most operations.

        // Printing all values in the array nums using a loop
        System.out.println("All values in nums:");
        for (int i = 0; i < nums.length; i++) {  // nums.length gives the number of elements in the array
            System.out.println(nums[i]);  // Prints each element of the nums array
        }

        // 2. Multidimensional array (2D array)


        // Multidimensional arrays are essentially arrays of arrays. The elements can be accessed using multiple indices.
        
        int nums2[][] = new int[3][4];  // 2D array with 3 rows and 4 columns (3x4 matrix)
        
        // Initializing the array with random values between 0 and 99
        System.out.println("\nMultidimensional array (2D):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                // Random values assigned to the array
                nums2[i][j] = (int) (Math.random() * 100);  // Random values between 0 and 99
                System.out.print(nums2[i][j] + " ");  // Print each element in the row
            }
            System.out.println();  // New line after each row
        }

        // **Key Concept**: 2D arrays are often used for matrix representations or tables.
        // **Time Complexity**: Access is O(1) for specific elements, and iterating over the array is O(n*m) where n is the number of rows and m is the number of columns.

        // 3. Jagged array (Array of arrays with different column sizes)


        // A jagged array is an array of arrays where each sub-array can have a different length (unlike a 2D array).
        
        int nums3[][] = new int[3][];  // Jagged array with 3 rows, columns are undefined
        
        // Assigning different column sizes for each row
        nums3[0] = new int[2];  // First row with 2 elements
        nums3[1] = new int[4];  // Second row with 4 elements
        nums3[2] = new int[3];  // Third row with 3 elements

        // Initializing values for the jagged array
        nums3[0][0] = 1;
        nums3[0][1] = 2;
        nums3[1][0] = 3;
        nums3[1][1] = 4;
        nums3[1][2] = 5;
        nums3[1][3] = 6;
        nums3[2][0] = 7;
        nums3[2][1] = 8;
        nums3[2][2] = 9;

        // Printing the jagged array
        System.out.println("\nJagged array:");
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums3[i].length; j++) {
                System.out.print(nums3[i][j] + " ");  // Print each element in the row
            }
            System.out.println();  // New line after each row
        }

        // **Key Concept**: A jagged array is more flexible as it allows rows to have different numbers of columns.
        // **Use case**: Useful when you need arrays with varying sizes like when dealing with different lengths of data.
        // **Time Complexity**: Similar to 2D arrays, access is O(1) and iteration is O(n*m) where n is the number of rows, and m is the varying number of columns.

    }
}





// 🚀 Conceptual Notes for Placement/Interview Preparation

// 1. **Single-dimensional Arrays**:
//    - **Definition**: Collections of fixed-size, same-type elements stored in contiguous memory locations. 🧳
//    - **Key Operations**:
//        - **Access**: Direct access to elements using an index (`O(1)` time complexity). 🎯
//        - **Modification**: Elements can be modified after initialization. ✏️
//    - **Drawbacks**:
//        - Fixed size (resizing requires creating a new array). 🚫
//        - Memory is allocated based on the initial size. 🧠

/*
  2. **Multidimensional Arrays (2D)**:
     - **Definition**: Arrays of arrays, used to represent matrices or tables. 📊
     - **Access**: Elements accessed using two or more indices (e.g., row and column). 🔢
     - **Example**: Used in matrix operations, dynamic programming, etc. 🧮
     - **Time Complexity**:
        - **Access**: O(1) for element access. ⏱️
        - **Iteration**: O(n*m) where n is the number of rows and m is the number of columns. 🔁
*/

// 3. **Jagged Arrays**:
//    - **Definition**: Arrays of arrays where sub-arrays (rows) can have different lengths. 🪶
//    - **Use Case**: Useful when data in each row varies in size, e.g., records with different lengths. 📅
//    - **Time Complexity**: Similar to 2D arrays but more flexible, as each row can have a different number of columns. 🔄

/*
  Key Points for Placement/Interview:
  - **Fundamental Data Structure**: Arrays are a crucial data structure in Java and frequently asked in technical interviews. 📚
  - **Time and Space Complexity**: Always optimize for both when working with arrays. ⏳💾
  - **Jagged Arrays and 2D Arrays**: Key for solving matrix problems and in dynamic programming questions. 🧩
*/

// Common Interview Questions:
// 1. Write a program to find the sum of a 2D matrix. ➕
// 2. Implement a jagged array and perform operations like searching or sorting. 🔍🔢
// 3. Given a 2D matrix, find the largest sum of any row or column. 📏💡
// 4. Implement a method to transpose a matrix. 🔄📐

/*
  Important Points About Arrays in Java:
  - **Memory**:
      - Arrays are objects stored in **heap memory**. 🏔️
      - The reference to the array is stored in **stack memory**. 🗂️
  - **Initialization**: Arrays in Java are automatically initialized with default values (e.g., `0` for integers, `null` for object types). 🔢
  - **Flexibility**: Jagged arrays provide flexibility when working with irregularly sized data. 🎯
*/
