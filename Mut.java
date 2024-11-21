public class Mut {

    public static void main (String a[])
    {
        String name ="sim";   //this one is ready for garbage collection -it will be removed  ----onces created cant be changed
        name=name+"singh";  //creating new obj in heap memory and address gets shifter to new obj in heap memory 

        System.out.println("hello"+name);

        String s1="Simran";   //heap memory stored it
        String s2="Simran";   //in stack memory it will refferef to same address of prev in heap memory 


    }
    
}


//MUTUABLE STRING - can be changed
//IMMUTABLE STRING - cannot be changed  (by default strings are immutable)




     //want mutuable strings?
//----we have 2 types for this----//
       //-STRING BUFFER
       //-STRING BUILDER