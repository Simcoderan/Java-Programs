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