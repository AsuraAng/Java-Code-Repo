import java.util.*;

class Employee {
    Scanner sc = new Scanner(System.in);
    private String name ;
    private int Salary ;

    Employee(){// this constructor class works as setter for all the private variables 
        System.out.println("Enter the Name of the Employee : ");
        name = sc.next();
        System.out.println("Enter the Salary of the Employee : ");
        Salary = sc.nextInt();
    }
    // getters to fetch the name and salary 

    String getname(){
        return name;
    }
    
    int getsalary(){
        return Salary ;
    }

    public void Employee() {
    }
}


public class NewOOPs {

    public static void main(String[] args) {
        while (true){
            Employee emp = new Employee();
            emp.Employee();

            
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to see : ");
            System.out.println("1.Name of the Employee ");
            System.out.println("2.Salary of the Employee ");
            System.out.println("3.Both name and salary of the Employee ");

        

            System.out.print("Enter the choice (1-3) : ");
            int ch = sc.nextInt();

        

            if (ch == 1){
                System.out.println("The Name of the Employee is - " + emp.getname());

            } else if (ch == 2){
                System.out.println("The Salary of the Employee is _ " + emp.getsalary());

            } else if (ch == 3){
                System.out.println("The Name of the Employee is " + emp.getname() + " and his/her Salary is " + emp.getsalary() );

            }else {
                System.out.println("INVALID CHOICE !!!!");
            }

        }

        
    }
}