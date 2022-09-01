import java.util.*;

class EMPLOYEE {
    private int Empid ;
    private String  EmpName;
//Setters 
    public void setname(String name){
        EmpName = name ; 
    }
    public void setid(int i){
        Empid = i ;
    } 
//Getters
    public String getname(){
        return EmpName;
    }

    public int getid(){
        return Empid;
    }

}



public class customClass {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        EMPLOYEE Count1 = new EMPLOYEE();


        System.out.println("Enter the Employee id : ");
        int id = sc.nextInt();
        Count1.setid(id);

        System.out.println("Enter the name of the Employee : ");
        String name = sc.next();
        Count1.setname(name);

        System.out.println("The Id is : "+ Count1.getid());
        System.out.println("The Name of the Employee is : "+ Count1.getname());

    }
    
}
