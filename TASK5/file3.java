/*3. Write a program in Java to count the number of vowels in the file “sample.txt” */
import java.io.*;
public class file3
{
public static void main(String args[])
{
    String filename="ex1.txt";
    int count=0;
    try(BufferedReader reader=new BufferedReader(new FileReader(filename)))
    {
       int character;
        while((character=reader.read())!=-1)
        {
            char ch=(char)character;
           if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                    {
                        count++;
                    }
        }
        System.out.println("NUmber of vowels in teh file is:"+count);
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }
    
}
}