import java.util.*;

public class TwoDArray {
    static void table(int a ){
        
    }
    public static void main(String args[]){

        while(true){
            Scanner sc = new Scanner(System.in);


            System.out.println("ENTER THE WIDTH : ");
            int width = sc.nextInt();

            System.out.println("ENTER THE LENGTH : ");
            int length = sc.nextInt();


            int[][] arra = new int[length] [width];
            for (int i = 0 ; i < length  ; i++ ){
                System.out.println("Enter the elments of "+(i+1)+" Row : ");
                for (int j = 0 ; j < width; j ++ ){
                    System.out.println("Enter the "+(j+1)+" ELEMENT in "+ (i+1) + " row " );
                    arra[i][j]=sc.nextInt();
                }

            }
            System.out.println("Do you want to see the Matrix (true/false) : ");
            boolean view = sc.nextBoolean();


            if (view == true){
                System.out.println("The Matrix formed is : ");
                for (int i = 0 ; i < length ; i++){
                    for(int j = 0 ; j < width ; j ++){
                        System.out.print(" " + arra[i][j] + " ");
                    }
                    System.out.println();
                    
                }
            } else if ( view == false ){
                break ;

            } else {
                System.out.println("INVALID CHOICE !!!");
            }

        }

    }
    
}
