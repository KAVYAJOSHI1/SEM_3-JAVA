/*7. Write a java program to create class person with members name. Age and aadhar no. Write the function for taking the values from user and display the detail. Create three objects for this class and copy them in file.*/

import java.io.*;
import java.util.*;
public class file9
{
    String name;
    int age;
    int adharno;

    void input(Scanner s)
    {
        System.out.println("ENTER THE NAME");
        name=s.nextLine();
        System.out.println("ENTER THE AGE");
        age=s.nextInt();
        System.out.println("ENTER THE ADHAR NUMBER");
        adharno=s.nextInt();
        s.nextLine();
    }

    void display()
    {
        System.out.println("NAME:"+name);
        System.out.println("AGE:"+age);
        System.out.println("ADHAR NUMBER:"+adharno);
    }

    void writeToFile(BufferedWriter writer) throws IOException
    {
        writer.write("Name: "+name);
        writer.newLine();
        writer.write("Age: "+age);
        writer.newLine();
        writer.write("Adhar Number: "+adharno);
        writer.newLine();
        writer.newLine();

    }


    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        file9 obj1=new file9();
        file9 obj2=new file9();
        file9 obj3=new file9();

        System.out.println("ENTER DETAILS OF PERSON 1");
        obj1.input(s);
        System.out.println("ENTER DETAILS OF PERSON 2");
        obj2.input(s);
        System.out.println("ENTER DETAILS OF PERSON 3");
        obj3.input(s);
        
        System.out.println("\nDETAIL OF PERSON 1:");
        obj1.display();
        System.out.println("\nDETAIL OF PERSON 2:");
        obj2.display();
        System.out.println("\nDETAIL OF PERSON 3:");
        obj3.display();

        try(BufferedWriter writer=new BufferedWriter(new FileWriter("person.txt")))
        {
            obj1.writeToFile(writer);
            obj2.writeToFile(writer);
            obj3.writeToFile(writer);
            System.out.println("DETAILS HAVE BEEN ENTERED");
        }
        catch(IOException e)
        {
         System.out.println("AN ERROR HAS OCCURED");
         e.printStackTrace();
        }
        s.close();


    }
}