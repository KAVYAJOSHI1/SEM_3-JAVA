/*Write a program in Java to find the number of lines, words and characters in the file. */
import java.io.*;
public class file2
{
    public static void main(String args[])
    {
        String line;
        String filename="ex1.txt";
        int wordcount=0;
        int linecount=0;
        int charcount=0;
        try(BufferedReader reader=new BufferedReader(new FileReader(filename)))
        {
            while((line=reader.readLine()) != null)
            {
                linecount++;

                String[] words=line.split("\\s+");
                wordcount+=words.length;
                charcount+=line.length();

            }
            System.out.println("Number of lines:"+ linecount);
            System.out.println("Nummber of words:"+wordcount);
            System.out.println("Number of character:"+charcount);
        } 
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }

}