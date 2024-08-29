/*6. Write a java program to merge two files and store the data in third file*/

import java.io.*;
public class file8
{
    public static void main(String args[])
    {
        String file1="f1.txt";
        String file2="f2.txt";
        String newfile="new.txt";
        try(
            BufferedReader reader1=new BufferedReader(new FileReader(file1));
            BufferedReader reader2=new BufferedReader(new FileReader(file2));
            BufferedWriter writer=new BufferedWriter(new FileWriter(newfile));

            )
            {
                String line;

                while((line=reader1.readLine()) != null)
                {
                    writer.write(line);
                    writer.newLine();
                }
                while((line=reader2.readLine()) != null)
                {
                    writer.write(line);
                    writer.newLine();
                }
                System.out.println("FILES HAVE BEEN MERGED SUCCESSFULLY");


            }
            catch(IOException e)
            {
                System.out.println("An error occured while merging file");
                e.printStackTrace();
            }
    }
}