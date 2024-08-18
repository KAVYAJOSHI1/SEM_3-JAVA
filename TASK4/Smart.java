public class Smart extends appliance1 implements refrigerator1,washingmachine1
{
    String wifi;
    Smart(String a,int b,String c)
    {
        super(a,b);
        wifi=c;
    }
    void connectwifi()
    {
        super.display();
        System.out.println("NEED WIFI CONNECTION:"+wifi);
        
    }


public static void main(String args[])
{
    Smart obj=new Smart("A",23,"yes");
    obj.connectwifi();

}
}