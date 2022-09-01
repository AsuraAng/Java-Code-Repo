import java.util.*;

class Calculatorifelse{
    public static void main(String args[]){
        //declearing the object for input 
        Scanner sc = new Scanner(System.in);
        
        //etering the first number
        System.out.println("Enter the first integer : ");
        int a = sc.nextInt();

        //entering the second number 
        System.out.println("Enter the second integer : ");
        int b = sc.nextInt();

        //showing the actions available
        System.out.println("CHOOSE THE ACTION :");

        System.out.println("1 - Addition");
        
        System.out.println("2 - Subtract");
        
        System.out.println("3 - Divide");

        int opt = sc.nextInt();

        System.out.println("The Result is : ");
        
        //making Calculator
        if(opt == 1 ) {
            System.out.println(a+b);
        } else if(opt == 2) {
            System.out.println(a-b);
        } else if(opt == 3) {
            System.out.println(a/b);
        } else {
            System.out.println("Invalid Choice !!");
        }
        
    }
}