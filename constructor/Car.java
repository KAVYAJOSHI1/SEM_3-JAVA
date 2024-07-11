/*5. Create a Java class Car with attributes make, model, and year. Implement:
• A default constructor that initializes the attributes to default values.
• Parameterized constructors to initialize the Car object with provided values for make, model,
and year.*/

import java.util.*;
public class Car{
    String make;
    String model;
    int year;
    Car(){
        make="Maruti";
        model="Swift";
        year=2018;
    }
    Car(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    void display(){
        System.out.println("Make:"+make);
        System.out.println("Model:"+model);
        System.out.println("Year:"+year);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String make=s.next();
        String model=s.next();
        int year=s.nextInt();
        Car obj=new Car(make,model,year);
        obj.display();
        Car obj1=new Car();
        obj1.display();
    }
}