class Student
{
    int rollno;   //instance variable becz it belongs to class
    String name;
    int marks;

}


public class Enhancedforloop {


    public static void main(String[] args) {


        int nums[]=new int[4];
        nums[0]=4;
        nums[1]=8;
        nums[2]=3;
        nums[3]=6;

        //for (int i=0;i<nums.length;i++)
        //{
         //   System.out.println(nums[i]);
          //}

          //--ENHANCED FOR LOOP---//

          for(int n : nums)  //give me one value at a time and it will go in "n"
          {
            System.out.println(n);


          }
        
    }
    
}
