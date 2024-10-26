public class JaggedArray {

    public static void main(String[] args) {
//Jagged Array
//int nums[][]=new int[3][]; //isnt mentioned the second one-unsured no.of columns unknown

int nums[][]= new int[3][]; 

nums[0]=new int [3];
nums[1]=new int[4];
nums[2]=new int[2];


for( int i=0;i<nums.length;i++)  

{
    for(int j=0;j<nums[i].length;j++)
    {
        nums[i][j]=(int)(Math.random()*10);
        


    }
    
}

for (int n []: nums)
{
     for (int m:n)
     {

     System.out.print(m+ " "); 

     }
  System.out.println();  
}

        
    }
    
}


