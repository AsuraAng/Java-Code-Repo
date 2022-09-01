import java.util.*;


public class Pattern2 {

    static int factorial(int i){
        if ( i==0){
            return 1;
        } else {
            int k=1;

            for(int j = 1 ; j <= i ; j ++){
                k=k*j ;
            }

            return k ;
        }
    }

    public static void main(String args[ ]) {
        while(true){
            
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Butterfly");
        System.out.println("2.Diamond");
        System.out.println("3.Hollow Butterfly");
        System.out.println("4.Hollow Rhombus");
        System.out.println("5.Pascal's Triangle");
        System.out.println("6.Numbered HALF PYRAMID");
        System.out.println("7.Inverted half pyramid with number of row");


        System.out.println("Enter the choice : ");
        int ch = sc.nextInt();

        if(ch == 1){
            System.out.println("Enter the number of rows : ");
            int a = sc.nextInt();
            System.out.println("The Output is : ");

            for(int i = 1 ; i <= a ; i++ ){
                for(int k = 1 ; k <= i ; k ++ ) {
                    System.out.print("*");
                }
                for(int k = 1 ; k <= (a-i)*2 ; k ++){
                    System.out.print(" ");
                }
                for(int k = 1 ; k <= i ; k ++){
                    System.out.print("*");
                }           
                System.out.println();
            }

            for(int i = a ; i >= 1 ; i -- ) {
                for(int k = 1 ; k <= i ; k ++){
                    System.out.print("*");
                }
                for(int k = 1 ; k <= (a-i)*2 ; k ++){
                    System.out.print(" ");
                }
                for(int k = 1 ; k <= i ; k ++){
                    System.out.print("*");
                }           
                System.out.println();
            }

        } else if ( ch == 2) {
            System.out.println("Enter the number of rows : ");
            int a = sc.nextInt();
            System.out.println("The Output is : ");
            
            for(int i = 1 ; i <= a ; i ++){
                for(int j = 1; j <= a ; j ++ ){
                    if((i+j) >= (a+1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            
            for(int i = a ; i >= 1 ; i --){
                for(int j = 1; j <= a ; j ++ ){
                    if((i+j) >= (a+1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        } else if ( ch == 3) {
            System.out.println("Enter the number : ");
            int a = sc.nextInt();

            for(int i = 1 ; i <= a; i ++){
                for(int j = 1 ; j <= a ;j ++){
                    if( j==i || j==1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    
                }

                for(int j = 0 ; j < a; j ++){
                    if( j==a-i || j==a-1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            for(int i = 1 ; i <= a; i ++){
                for(int j = 1 ; j <= a ;j ++){
                    if( i+j==a+1 || j==1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                for(int j = 1 ; j <= a; j ++){
                    if( j==i || j==a){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        } else if ( ch == 4){
            System.out.println("Enter the number of rows : ");
            int a = sc.nextInt();

            for(int i = 1 ; i <= a ; i ++){
                if ( i == a || i == 1){
                    for(int j=1; j<=a-i; j ++){
                        System.out.print(" ");
                    }
                    for(int j = 1 ; j <= a ; j ++){
                        System.out.print("*");
                    }
                } else {
                    for(int j = 1 ; j <= a-i ; j ++){
                        System.out.print(" ");
                    }
                    System.out.print("*");

                    for(int j = 1 ; j <= a-2 ; j ++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }

        } else if ( ch == 5){
            System.out.println("Enter the number of rows : ");
            int a = sc.nextInt();

            int num = 1 ;

            for(int i = 0 ; i <= a ; i ++){
                for(int j = 1 ; j <= a - i; j ++){
                    System.out.print(" ");
                }
                for(int j =0 ; j <= i ; j ++){
                    System.out.print(factorial(i)/(factorial(i-j)*factorial(j))+" ");
                }
                System.out.println();
            }

        } else if ( ch == 6){
            System.out.println("Enter the number of rows : ");
            int a = sc.nextInt();
            System.out.println("The Output is : ");

            for(int i = 1 ; i <= a ; i ++){
                
                for(int j = 1 ; j <= a-i ; j ++){
                    System.out.print(" ");
                }

                for(int j = 1 ; j <= i ; j ++){
                    System.out.print(j);
                }
                System.out.println();
            }

        } else if ( ch == 7){
            System.out.println("Enter the number of rows : ");
            int a = sc.nextInt();
            System.out.println("The Output is : ");


            for(int i = a ; i >= 1 ; i --) {
                for(int j = i ; j >= 1 ; j --){
                    System.out.print(i);
                }
                System.out.println();
            }

        } else {
            System.out.println("INVALID CHOICE !!!");
        }


    }
    
    }
}
