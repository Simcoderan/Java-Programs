//final-variable,method,class
//constant is said final in java


 class Calc{
    public final void show()  //stop method overriding
    {
        System.out.println(" by sim");

    }

    public void add(int a,int b) {
        System.out.println(a+b);

    }

   
   
   //if u want to stop inheritance put final in the parent class 
   //final class Calc

    class AdvCalc extends Calc
    {

       // public  void show(){
    
           // System.out.println("by mr x"); //method overrrding
             
        //}




    }
}


public class Final {

    public static void main(String[] args)
     {

       //final  int num=8;
       // num=9;  -- cant change
        //System.out.println(num) ; //8

        Calc obj=new Calc();
        obj.show();
        obj.add(4,5);

        
    }
    
}
