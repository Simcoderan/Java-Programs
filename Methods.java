class Computer        //----behaviour is methods
{
    public void playMusic() //---method
    {
        System.out.println("playing music");

    }

    public String getMeAPen(int cost)
    {
        //if want to put condition on cost of pen 
        if(cost>=10)
          return "pen";
          else
            return "Nothing";

    }


}


public class Methods {

    public static void main (String[]args) 
    {
        Computer comp = new Computer();   //object created
        comp.playMusic();
       String str = comp.getMeAPen(10);  //if cost =2 then nothhing is output
       System.out.println(str);


    }
    
}


class Calculator
{
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }

    public int add(int n1,int n2)  //----parameters can have double,...etc
    {
        return n1+n2;

    }

//know when to call which--name of method can be same but parameters needs to be different

//------METHOD OVERLOADING------ same name of the methods but parameter like >>>"public int/double/.. are different
 public double add(double n1,int n2)  //---method overloading --same number of parameters but with different type
 {
    return n1+n2;
 }


 //public double add(int n1,int n2)---doesnt work--return doesnt mattter(double) it has to be with the paramters

}



//.....JVM..........MEMORY LEVEL........
// we have STACK & HEAP in the memory of it
//every method have its own stack

















