public class Loops {

    public static void main(String[] args)
     {
       //repeat this statement 4 times
       //loop- while ,do while ,for loop havaing own use cases
       // infinte times , based on conditions ..etc accordingly


       //-----WHILE LOOP-----
      int i = 1;   //----INITIALIZATION

      while (i<=4)  //----CONDITION
    {
        System.out.println("Hi" + i);
        //nested loop
        int j=1;
        while(i<=3){
            System.out.println("Hello"+ j);
            j++;
        }
        i++;     //----INCREMENT
    }

    System.out.println(" Bye " + i); //bye5 






//execute code even if the condition is false

//----- DO WHILE LOOP -----
int c=1; 
   do
   {
    System.out.println("hi" + c);
    c++;
   } while (c<=4); //output for onces and then while loop starts

  
    



//------ FOR LOOP -------
//instead of all conditions in different lines keeping it in one line of for
   for(int v=1;v<=4;v++)
   {
     System.out.println("hi" +v);
   }

   //print days with hours of 9am to 6pm

   for(int a= 1;a<=7; a++)
   {
    System.out.println("DAY" + a); 
    
 //nested loop
     for(int b= 1;b<=9;b++)
     {
        System.out.println(" " + (b+8) + " - " + (b+9));
     }

   }




     }


 }









    

