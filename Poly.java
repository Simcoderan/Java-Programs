//many -behaviour    -----POLYMORPHISM

//TYPES
    //-Compile time(late binding) -- if behaviour defined at compile time --[method overloading]
    //-Run time (early binding)  -- if behaviour defined at run time    --[method overridding]


    //DYNAMIC METHOD DISPATCH

    class A
    {

        public void show()
        {
            System.out.println("in A show");

        }

    }
    class B extends A
    {

        public void show()
        {
            System.out.println("in B show");

        }



    }

    class C extends A
    {

        public void show()
        {
            System.out.println("in C show");

        }



    }

  


    public class Poly {
        public static void main(String[] args) {
            // A obj =new A();   
            
            //wht if ? 


            A obj =new A();
            obj.show();  //object of A

            obj=new B();
            obj.show();  //object of B //replace 

            obj=new C();
            obj.show(); //object of C //replace    //run time polymorphism


            //hence same "obj.show()" behaving differently with different objects
            
            
        }
    }
