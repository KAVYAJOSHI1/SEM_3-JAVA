import java.io.*;
public class FileCopy
{
    public static void main(String args[])
    {
        String source ="source.txt";
        String destination ="destination.txt";

        try( FileInputStream i =new FileInputStream(source);
        FileOutputStream o=new FileOutputStream(destination))
        {
        int bytedata;
        while((bytedata=i.read())!=-1)
        {
            o.write(bytedata);
        }
        System.out.println("File copied successfully!");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Source file not found!");
        }
        catch(IOException e)
        {
            System.out.println("Error while copying file!");
        }   
    }
    }
