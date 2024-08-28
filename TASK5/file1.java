/*1. Write a Java program to write a given data in file and read the file and display the content on
console. “Digital image processing is the process of using computer algorithms to perform
image processing on digital images. Latest topics in digital image processing for research
and thesis are based on these algorithms. Being a subcategory of digital signal processing,
digital image processing is better and carries many advantages over analog image
processing. It permits to apply multiple algorithms to the input data and does not cause the
problems such as the build-up of noise and signal distortion while processing.”*/

import java.io.*;
public class file1
{
    public static void main(String args[])
    {
        String data="Processing is the process of using computer algorithms to perform "
        + "image processing on digital images. Latest topics in digital image processing for research "
        + "and thesis are based on these algorithms. Being a subcategory of digital signal processing, "
        + "digital image processing is better and carries many advantages over analog image processing. "
        + "It permits to apply multiple algorithms to the input data and does not cause the problems such "
        + "as the build-up of noise and signal distortion while processing.";
    
        String filename="ex1.txt";

        try( BufferedWriter writer = new BufferedWriter(new FileWriter(filename)))
        {
            writer.write(data);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(filename)))
        {
            String line;
            while((line= reader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        }
    }

