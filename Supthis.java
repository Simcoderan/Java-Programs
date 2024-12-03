  //multilevel inheritance   
class D  extends Object          //every class in java extends the OBJECT class in java//multilevel inheritance   
{

    public D()
    {
        super();   //its there even if u dont mention this
        System.out.println("in A");

    }
    public D(int z)

    {     
        super();   //its there even if u dont mention this
        System.out.println("in int D");

    }

}
class E extends D
{
    public E()
    {
        super();   //its there even if u dont mention this
       
        System.out.println("in E");

    }

    public E(int z)
    {
        //super();   //its there even if u dont mention this  //call the constructor of super class
        // super(z); 
        this();        //in D//in E//with int E
        System.out.println("with int E");
        
    }


}




public class Supthis {

    public static void main(String[] args)
    {
       // E obj3= new E();  
         E obj3= new E(6);  //in D and with int


        
    }
}
