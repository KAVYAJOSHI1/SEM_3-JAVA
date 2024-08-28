/*4. Write a program in Java to copy a file into another file using byte stream and character
stream.*/

//USING BYTE STREAM
import java.io.*;
public class file4
{
    public static void main(String args[])
    {
        String sourcefile="source.txt";
        String destfile="dest.txt";
        try(FileInputStream inputStream= new FileInputStream(sourcefile);
            FileOutputStream outputStream=new FileOutputStream(destfile))
            {
                int bytedata;
                while((bytedata=inputStream.read()) !=-1)
                {
                    outputStream.write(bytedata);
                }
                System.out.println("FILE COPIED SUCCESSFULLY");

            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
    }
}

