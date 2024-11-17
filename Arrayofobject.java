class Student
{
    int rollno;   //instance variable becz it belongs to class
    String name;
    int marks;

}


public class Arrayofobject {

   public static void main(String[] args) 
   
   {

    Student s1 = new Student();
    s1.rollno=1;
    s1.name="simran";
    s1.marks=70;

    Student s2 = new Student();
    s2.rollno=2;
    s2.name="sam";
    s2.marks=90;

    Student s3 = new Student();
    s3.rollno=3;
    s3.name="kiran";
    s3.marks=80;

    //print students  details
    //System.out.println(s1.name +":" + s1.marks);


    //Array of Students
    //creating array to hold student refferences
    // we have to manually create objects and assign to an array(students)

    Student students[] = new  Student[3]; //just like eg - int num[]=new int[4];
    students[0]=s1;
    students[1]=s2;
    students[2]=s3;

    //print all details of  all studnts --------studnets[i] keeps changing

    for(int i=0;i<students.length;i++){
        System.out.println(students[i].name +":" + students[i].marks);
        

    }
            } 

    }

//--ENHANCED FOR LOOP---//
 //for(Student stud : students)  //it will fetch one student at a time
 //{
   // System.out.println(stud.name +":" + stud.marks);
 //}



