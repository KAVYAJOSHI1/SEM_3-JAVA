//to move data from one file to another using character stream
import java.io.*;
public class file5
{
    public static void main(String args[])
    {
        String sourcefile="source.txt";
        String destfile="dest.txt";
        try(FileReader reader=new FileReader(sourcefile);
            FileWriter writer=new FileWriter(destfile))
            {
                int chardata;
                while((chardata=reader.read()) !=-1)
                {
                    writer.write(chardata);
                }
                System.out.println("FILE COPIED SUCCESSFULLY");

            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            }

    }
