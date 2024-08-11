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
    void display()
    {
        System.out.println("NAME IS :"+name);
        System.out.println("MARKS ARE:"+marks);
        System.out.println("GRADE IS :"+Grade);
    }



public static void main(String args[])
{
    String name;
    int marks;
    char Grade;
    Scanner s=new Scanner(System.in);
    sortchar[] obj=new sortchar[2];
    for(int i=0;i<2;i++)
    {
        System.out.println("ENTER THE NAME:");
        name=s.nextLine();
        System.out.println("ENTER THE MARKS:");
        marks=s.nextInt();
        System.out.println("ENTER THE GRADE:");
        Grade=s.next().charAt(0);
        s.nextLine();
        obj[i]=new sortchar(name,marks,Grade);


    }
    Arrays.sort(obj, new Comparator<sortchar>()
    {
      public int compare(sortchar a,sortchar b)
      {
        return a.Grade-b.Grade;
      }
    }
    );
    for(int i=0;i<2;i++)
    {
        obj[i].display();
    }

}
}