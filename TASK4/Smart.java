public class Smart extends refregerator1,washingmachine1
{
    String wifi;
    Smart(String a,int b,String c)
    {
        super(a,b);
        wifi=c;
    }
    void connectwifi()
    {
        System.out.println("NEED WIFI CONNECTION:"+wifi);
        super.display();
    }


public static void main(String args[])
{
    Smart obj=new obj(a,b);
    obj.connectwifi();

}
}