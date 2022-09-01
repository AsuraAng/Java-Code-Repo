import java.util.*;

public class calculatorwithfunctions {

    public static float Sum(float i , float j ){
        return i+j;
    }
    public static float Product(float i , float j ){
        return i*j;
    }
    public static float Divide(float i , float j ){
        return i/j;
    }
    public static void Average( ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Count of values :");
        int a = sc.nextInt();
        int sum = 0;


        for ( int i = 1 ; i <= a ; i ++){
            System.out.println("Enter the value :");
            int b = sc.nextInt();
            sum = b + sum ;
        }
        System.out.println("The Average of Values is : " + sum/a);


    }
    public static int Factorial( int i){
        if (i==0){
            return 1;
        } else {
            int k = 1;
            for(int l =1; l<=i ; l ++){
                k = k*l;
            }
            return k ;
        }
    }
    public static float Difference(float i , float j ){
        return i-j;
    }
    public static int FloorDiv(int i , int j){
        return i%j;
    }
    public static void TableCreator( int i ){
        System.out.println("The Table of " + i + " is ");
        for(int j = 1 ; j <= 10; j ++){
            System.out.println(i+"*"+j+"="+i*j);
        }
    }
    public static void Fibo(int i){
        int a = 0;
        int b = 1;
        System.out.print(a+","+b);

        for(int j = 1 ; j<=i-2; j++){
            int c=a+b;
            System.out.print(","+c);
            a=b;
            b=c;
        }
        
    }
    public static double Circum(float i){
        double pi = 3.1428 ;
        double circum = 2*pi*i;
        return circum;
    }
    public static int OddSum(int i){
        return i*i ;
    }
    public static int EvenSum(int i){
        int sum=i*(i+1);
        return sum ;
    }
    public static void CheckGreat(float i,float j){
        if(i>j){
            System.out.print("The Greater of the two is : " + i);
        } else if (i==j) {
            System.out.print("Both are Equal....");
        } else {
            System.out.print("The Greater of the two is : " + j);
        }
    }
    public static int Expo(int n,int x){
        int expo=1;
        for(int l = 1 ; l <= n ; l ++){
            expo=expo*x;
        }
        return expo ;
    }
    public static void VoteElligibility(int i){
        if(i>=18){
            System.out.println("You are Elligible To VOTE....");
        } else {
            System.out.println("You are Not Elligible To VOTE..... ");
        }
    }
    public static int Gcf(int i , int j){
        int gcd = 0;

        for(int l = 2 ; l <= i && l<= j; l++){
            if(i%l==0 && j%l==0){
                gcd=l;
                break;
                
            } else {
                System.out.println("They are co-primes");
                gcd=1;
            }
        }
        return gcd;
    }
    
    public static void main(String args[ ]){

        Scanner sc = new Scanner(System.in);


        System.out.println("1.Add");
        System.out.println("2.Difference");
        System.out.println("3.Division");
        System.out.println("4.Floor Division");
        System.out.println("5.Factorial");
        System.out.println("6.Average");
        System.out.println("7.Product");
        System.out.println("8.Table Writer");
        System.out.println("9.Fibonacci Series");
        System.out.println("10.Circumference of Circle");
        System.out.println("11.Exponential Operarion");
        System.out.println("12.Find Greater");
        System.out.println("13.GCF Calculator");
        System.out.println("14.Sum of all Even till n");
        System.out.println("15.Sum of all Odd till n");
        System.out.println("16.Check Eligibility to Vote");



        System.out.println("Enter the Choice :");

        int ch = sc.nextInt();



        if ( ch == 1){
            System.out.println("Enter the First Digit : ");
            int a = sc.nextInt();
            System.out.println("Enter the Second Digit : ");
            int b = sc.nextInt();


            System.out.println("The desired Output is : " + Sum(a,b));
            


        } else if ( ch == 2 ){
            System.out.println("Enter the First Digit : ");
            int a = sc.nextInt();
            System.out.println("Enter the Second Digit : ");
            int b = sc.nextInt();


            System.out.println("The desired Output is : " + Difference(a,b));

        } else if ( ch == 3 ){
            System.out.println("Enter the First Digit : ");
            int a = sc.nextInt();
            System.out.println("Enter the Second Digit : ");
            int b = sc.nextInt();


            System.out.println("The desired Output is : " + Divide(a,b));
            
        } else if ( ch == 4 ){
            System.out.println("Enter the First Digit : ");
            int a = sc.nextInt();
            System.out.println("Enter the Second Digit : ");
            int b = sc.nextInt();


            System.out.println("The desired Output is : " + FloorDiv(a,b));
            
        } else if ( ch == 5 ){
            System.out.println("Enter the Digit : ");
            int a = sc.nextInt();
            
            System.out.println("The desired Output is : " + Factorial(a));
            
            
        } else if ( ch == 6 ){
            Average();
            
        } else if ( ch == 7 ){
            System.out.println("Enter the First Digit : ");
            int a = sc.nextInt();
            System.out.println("Enter the Second Digit : ");
            int b = sc.nextInt();


            System.out.println("The desired Output is : " + Product(a,b));
            
        } else if ( ch == 8 ){
            System.out.println("Enter the First Digit : ");
            int a = sc.nextInt();
            


            TableCreator(a);
            
        } else if ( ch == 9 ){
            System.out.println("Enter the Digit : ");
            int a = sc.nextInt();
            


            System.out.println("The desired Output is : ");
            Fibo(a);
            
        } else if ( ch == 10 ){
            System.out.println("Enter the First Digit : ");
            int a = sc.nextInt();

            System.out.println("The Circumference is : " + Circum(a));
            
        } else if ( ch == 11 ){
            System.out.println("Enter the Power Digit : ");
            int a = sc.nextInt();
            System.out.println("Enter the Base Digit : ");
            int b = sc.nextInt();


            System.out.println("The Value of Exponent is : " + Expo(a,b));
            
        } else if ( ch == 12 ){
            System.out.println("Enter the First Digit : ");
            int a = sc.nextInt();
            System.out.println("Enter the Second Digit : ");
            int b = sc.nextInt();


            CheckGreat(a,b);
            
        } else if ( ch == 13 ){
            System.out.println("Enter the First Digit : ");
            int a = sc.nextInt();
            System.out.println("Enter the Second Digit : ");
            int b = sc.nextInt();


            System.out.println("The GCF is : " + Gcf(a,b));
            
        } else if ( ch == 14 ){
            System.out.println("Enter the COUNT : ");
            int a = sc.nextInt();
            


            System.out.println("The Sum is : " + EvenSum(a));
            
        } else if ( ch == 15 ){
            System.out.println("Enter the COUNT : ");
            int a = sc.nextInt();

            System.out.println("The Sum is : " + OddSum(a));
            
        } else if ( ch == 16 ){
            System.out.println("Enter your Age : ");
            int a = sc.nextInt();
            

            VoteElligibility(a);
            
        } else {
            System.out.println("UNVALID CHOICE !!!!");
        }

    }
    
}
