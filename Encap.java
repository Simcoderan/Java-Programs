                       //  ENCAPSULATION//


                       
class Human
 { 
    private  int age; //=11 can assign here also //  PRIVATE-accessable only in the same class,make instance variable private
    String name;

    //To access this there is an METHOD
    public  int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {  //set age here
        age=a;
    }

}







public class Encap {
    public static void main(String[] args) {
        Human obj=new Human();
       // obj.age=11;  --- U cant acceess becz its private
       // obj.name="Sam";


       obj.setAge(11); //give the value here


        //System.out.println(obj.name);
        System.out.println(obj.getAge());
        
    }
}