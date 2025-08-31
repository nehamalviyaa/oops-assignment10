/*Create a class Employee with(empNo ,salary and totalSalary) with following features.

Only parameterized constructor;

totalSalary always represent total of all the salaries of all employees created.

empNo should be auto incremented.

display total employees and totalSalary using class method*/
import java.util.Scanner;
class Employee{
    private int empno;
    private int salary;
    private int totalsalary;
    public Employee(int salary){
        this.empno=empno;
        this.salary=salary;
        this.totalsalary=totalsalary;
    }
    public int increment(){
        empo++;
        this.salary=salary;
        this.totalsalary=totalsalary;
        this.totalsalary +=salary;


    }
    public int Display(){
        
        System.out.println("total salary :"+totalsalary);
    }

}
class Main{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println(" enter employee first");
     int empno=sc.nextInt();
     System.out.println("enter salary of employee");
     int salary=sc.nextInt();

      Employee e=new Employee(salary);
    
      }
      e.increment(3);
     e.Display();




    }
