//Anonymus Object
class F{

    public F(){

        System.out.println("object created");
    }



    public void show()
    {
        System.out.println("in F show");
    }
}


public class Anonym {
    public static void main(String[] args)
    {
        //F obj4= new F();   //refferenced object
        //obj4.show();
        new F();     //object created  //Anonymous obj //can reuse them
        
        //new F().show();
        //new F().show();  //2 new objects created

        
    }
    
}

//backend
//  JVM ------>> STACK MEMORY + HEAP MEMORY
//STACK--  (refference variaBLE) obj|101 (Address)    ---------->heap reffereing
// HEAP --  obj created with and address

