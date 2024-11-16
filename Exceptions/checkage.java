import java.io.*;
import java.util.*;

public class checkage
{
    public static void check(int age) throws InvalidAgeException
    {
        if(age <18)
        {
            throw new InvalidAgeException("NOT ELIGIBLE FOR VOTING");
        }
        else
        {
            System.out.println("VALID AGE");
        }
    }
    public static void main(String args[])
    {
        try{
            check(50);
        }
        catch(InvalidAgeException e)
        {
            System.out.println("Error: "+ e);
        }
    }
}