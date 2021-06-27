package employee;


public class Employee {
    public String name;
    public int yoj;
    public float salary;
    public String address;
    Employee(String name, int yoj, float salary, String address)
    {
        this.name=name;
        this.yoj=yoj;
        this.salary=salary;
        this.address=address;
    }
    public void display()
    {
        System.out.println(name+"      "+yoj+"         "+salary+"      "+address);
    }
   
    
    public static void main(String[] args) {
        Employee[] a;
        a=new Employee[3];
        a[0]=new Employee("Robert",1994,12000,"64-C Wall Street");
        a[1]=new Employee("Sam",2000,14000,"68-D Wall Street");
        a[2]=new Employee("John",1999,16000,"26-B Wall Street");
        System.out.println("Name   Year of Joining   Salary   Address");
        a[0].display();
        a[1].display();
        a[2].display();
        
    }
    
}
