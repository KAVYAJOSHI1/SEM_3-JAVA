import java.util.*;
public class Animal1
{
    protected String species;
    protected int age;
    Animal1(String a,int b)
    {
        species=a;
        age=b;
    }
    void display()
    {
        System.out.println("SPECIES IS"+species);
        System.out.println("AGE IS "+age);
    }
}