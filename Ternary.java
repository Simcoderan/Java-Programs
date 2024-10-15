// check wheter a number is odd or even
public class Ternary {

    public static void main(String[] args) {
          
        int n =4;
        int result=0; //if even then result =10 else 20
        //---simple way---//
        //if (n%2==0)
            //result=10; 
        //else
              // result=20;


              //--TERNARY OPERATOR---// LOOKS LIKE  " ?: "

              result = n%2==0 ? 10 : 20; //--if false execute next one

           System.out.println(result);
    } 
    
}
