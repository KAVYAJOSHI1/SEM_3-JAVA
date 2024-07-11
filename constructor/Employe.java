import java.util.*;

public class Employe {
    int empId;
    String name;
    int salary;
    Employe(int id, String n, int s) {
        empId = id;
        name = n;
        salary = s;
    }
    static int total = 0;
    static int Salary(int salary) {
        total += salary;
        return total;
    }
    static int MAX = 0;
    static int max(int salary) {
        if (MAX < salary) {
            MAX = salary;
        }
        return MAX;Go on sleep mode
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Employe a[] = new Employe[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("ENTER THE EMPLOYEE ID");
            int id = s.nextInt();
            System.out.println("ENTER THE EMPLOYEE NAME");
            String name = s.next();
            System.out.println("ENTER THE EMPLOYEE SALARY");
            int salary = s.nextInt();
            Employe obj = new Employe(id, name, salary);
            a[i] = obj;
        }
        for (int i = 0; i < 2; i++) {
            a[i].Salary(a[i].salary);
            a[i].max(a[i].salary);
        }
        System.out.println("TOTAL SALARY IS: " + total);
        System.out.println("MAXIMUM SALARY IS: " + MAX);
    }
}