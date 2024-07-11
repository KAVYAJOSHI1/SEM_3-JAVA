/*9. Create a Java program to define a class Studeent with attributes rollNumber, name, and grade.
Implement:
• An array studentArray to store 5 Student objects.
• Methods to initialize the array with sample data and display details of all students.

*/
import java.util.*;
class Studeent
{
    int rollNumber;
    String name;
    int grade;

    Studeent(int rollNumber,String name,int grade)
    {
        this.rollNumber=rollNumber;
        this.name=name;
        this.grade=grade;
    }
    void displayInfo()
    {
        System.out.println("NAME:"+this.name);
        System.out.println("ROLL NUMBER:"+this.rollNumber);
        System.out.println("GRADE:"+this.grade);            
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        Studeent[] studentArray=new Studeent[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("ENTER THE ROLL NUMBER, NAME AND GRADE OF THE STUDENT");
            int rollNumber=s.nextInt();
            String name=s.next();
            int grade=s.nextInt();
            Studeent obj=new Studeent(rollNumber,name,grade);
            studentArray[i]=obj;
        }
        for(int i=0;i<5;i++)    
        {
            studentArray[i].displayInfo();
        }
    }
}
    