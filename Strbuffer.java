public class Strbuffer {
    public static void main(String[] args) 
    {

       // StringBuffer sb = new StringBuffer();  //GIVES U BUFFER SIZE OF 16bits
        //System.out.println(sb.capacity());  //output-16

        StringBuffer sb = new StringBuffer("Simran"); //capacity will increase-it will store and add   +16 bits extra to it also
        //length
        //  System.out.println(sb.length());  -- output-6


        //----different methods----//
        sb.append(("  Singh"));
        sb.deleteCharAt(2);    //idea is we change it
        sb.insert(0,  "java");   // java simran singh
        sb.insert(7, "Java");    // simran java singh
        sb.setLength(30);
        sb.ensureCapacity(100);

        System.out.println(sb);

        //String str= sb.toString(); can be channged to string





        
    }
    
}
