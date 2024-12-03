class Hooman
{ 
   private  int age; 
   private String name;

//default value-constructor
//same name as class,not specified return type
//evertime we create obj it will call constructor.

public Hooman()            //Default Constructor
{
    //System.out.println("in constructor");
    age=12;
    name="john";

}

//constructor with parameters
//public Hooman(int a,String n){    //Parameterized Constructor
   // age=a;
    //name=n;
//}

public Hooman(int age, String name) 
   
{
    this.age = age;
    this.name = name;
}






public  int getAge()
   {
       return age;
   }
   public void setAge(int a)
   {  
         this.age=age;
   }

   public  String getName()
   {
       return name;
   }
   public void setName(String name)
   {  
      this.name=name;
   }

}


public class Construc {
   public static void main(String[] args) {
       Hooman obj=new Hooman();
       //Hooman obj1=new Hooman(); //if we have 2 objects 2 times const. is called 2 times
       Hooman obj1=new Hooman(18,"neha"); //parameterized constructor
       //obj.setAge(11); 
       //obj.setName("riya");
      //System.out.println(obj.getAge());  //obj not called so setting default name
   }
}





//java creates and default constructor by its own if we dont

//public Hooman()     //blank constructor//if want to mention do explicitly

//{

//}

    

