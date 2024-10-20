//Object Oriented Programming
//Object-Properties and Behaviours
//How to create OBJECT?-----first we need to create Class
//give the design to class - BLUE PRINT
//JVM---creates the object but the blue print is given be us
// we create class file --> byte code ---> jvm
// manufacturing of code will be done here by jvm
//every object will have 2 things ----->  PROPERTIES  &   METHODS

class Calculator {           //---design 

int a;  //----variable name
public int add( int n1,int n2) //------method name
{
    int r = n1 + n2;
    return r;
    
}

}



public class Objects
 {
    
    public static void main(String[] args) 
    {
        int num1=4;    //---primitive variable
        int num2=6;
        // add(); -----simply calling class doesnt makes sense becz class is only design we need object also manufacture
        Calculator calc = new Calculator();     // new device of type calculator                //--calc is refference variable

        int result = calc.add( 4,5);  //we can write num1 , num2

       
       // int result = num1+ num2;
        System.out.println(result);


        
    }
}



//====BEHINDE THE SCENE=====//

//JDK-java development kit 

//JVM- java virtual machine

//for making platform independent java we went for a virtual layer which is JVM a virtual layer

//Jvm is needed to run ur code

//our code always needs external files,inbuilt classes etc..which is present in JRE a overall layer over JVM

//JRE- java runtime  environment

//JDK is upper layer 

