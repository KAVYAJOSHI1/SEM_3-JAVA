import java.util.*;
public class sortchar
{
    String name;
    int marks;
    char Grade;
    sortchar(String a,int b,char c)
    {
        this.name=a;
        this.marks=b;
        this.Grade=c;
    }


}
public static void main(String args[])
{
    String name;
    int marks;
    char Grade;
    Scanner s=new Scanner(System.in);
    sortchar[] obj=new sortchar[5];
    for(int i=0;i<5;i++)
    {
        System.out.println("ENTER THE NAME:");
        name=s.nextLine();
        System.out.println("ENTER THE MARKS:");
        marks=s.nextInt();
        System.out.println("ENTER THE GRADE:");
        Grade=s.nextCharAt(0);
        obj[i]=new obj(name,marks,Grade);


    }

}