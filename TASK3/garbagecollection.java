import java.util.*;
public class garbagecollection{
    public garbagecollection()
    {
        System.out.println("OBJECT IS CREATED");
    }
    protected void finalize()
    {
        System.out.println("IT IS BEING GARBAGED");
    }
    public static void main(String args[])
    {
        garbagecollection obj=new garbagecollection();
        obj=null;
        System.gc();

    }

}