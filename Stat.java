//about wht is static?

class Mobile {
     int price;
     String brand;
      static String name;    //by adding static we are making it coomom for all objs(obj1 and obj2)


     public void show()
     {
        System.out.println(brand + " : " + price + " : " + name);

}

}


public class Stat {
    

 public static void main(String[] args) {


    Mobile obj1 =new Mobile();

    obj1.brand="oppo";
    obj1.price=60;
    Mobile.name="smartphone";


    Mobile obj2 =new Mobile();

    obj2.brand="apple";
    obj2.price=90;
    Mobile.name="phone";  //call it with class name itself


    obj1.name="mob";  //now both will have same name

    obj1.show();
    obj2.show();
    


    
 }
}
