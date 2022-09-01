import java.util.*;
import java.io.*;

class database {
    
    public static void EntryView(){
        for(int i = 1 ;i <= 50; i++){
            System.out.print("*");
            if (i == 50){
                System.out.println("*");
            }
        }
        System.out.println("Hello!! Welcome to Student Database .....");
        System.out.println("1.Create Table");
        System.out.println("2.Read Table");
        System.out.println("3.Find Record");
        System.out.println("4.Add Record");
        System.out.println("5.Delete Record");
        System.out.println("6.Exit");


        for(int i = 1 ;i <= 50; i++){
            System.out.print("*");
            if (i == 50){
                System.out.println("*");
            }
        }
        System.out.println("Enter the choice (1-6): ");
    }

    public static void METH1(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
    } 
    public static void METH2(){
        Scanner sc = new Scanner(System.in);
    }
    public static void METH3(){
        Scanner sc = new Scanner(System.in);
    }
    public static void METH4(){
        Scanner sc = new Scanner(System.in);
    }
    public static void METH5(){
        Scanner sc = new Scanner(System.in);
    }
    public static void METH6(){
        Scanner sc = new Scanner(System.in);
    }
}

public class test {
    public static void main(String[] args) {
        boolean flag = true ;
        ArrayList al = new ArrayList<>(5000);


        while(flag){
            database db = new database();
            db.EntryView();
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();

            if( ch == 1) {
                db.METH1();

            } else if ( ch == 2){

            } else if ( ch == 3){

            } else if ( ch == 4){

            } else if ( ch == 5){

            } else if ( ch == 6){

            } else{
                System.out.println("Invalid !! Input encountered ....");
            }
        }

    }

    
}
