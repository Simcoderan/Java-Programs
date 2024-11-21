//STRING
//STRING IS A CLASS-but  with different ways

public class Demostr{
    public static void main (String a[]){
        String name=new String("simran");  //initialisation
        //String name="simran" ;  ---will work,no need to worry for object creation






        System.out.println("hello" + name);  //concatinate
        System.out.println(name.charAt(1));  //to find the location of any character at  any index
        System.out.println(name.concat("riya")); //concat 2 names also

        
    }

}