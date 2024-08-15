import java.util.*;
public class Animal
{
    protected String sound;
    Animal(String a)
    {
        sound=a;
    }
    void makesound()
    {
        System.out.println("ANIMAL MAKES SOUND"+sound);    }
}