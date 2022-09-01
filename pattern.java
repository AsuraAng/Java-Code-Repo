import java.util.*;


public class pattern { 
    public static void main(String args[]) {
        while(true){
            System.out.println("1.Rectangular Solid");
            System.out.println("2.Hollow Rectangle");
            System.out.println("3.Half Pyrammid");
            System.out.println("4.Half Pyramid Inverted");
            System.out.println("5.Floyd's Triangle");
            System.out.println("6. (0,1)-Triangle");
            System.out.println("7.Nunbered Half Pyramid");
            System.out.println("8.Numbered Half Pyramid Inverted");
            System.out.println("9.Pyramid");
            System.out.println("10.Parallelogram");
            System.out.println("11.Mirror image of half pyramid");
            System.out.println("12.Homework - 1 : Number Pyramid ");
            System.out.println("13.Homework - 2 : Palindromic ");


            Scanner  sc = new Scanner(System.in);

            System.out.println("Enter the CHOICE : ");
            int ch = sc.nextInt();


            System.out.println("Fill the Details asked ..... ");  

            if (ch == 1) {
                System.out.println("Enter the number of rows : ");
                int a = sc.nextInt();
                System.out.println("Enter the number of columns : ");
                int b = sc.nextInt();

                System.out.println("The Output is :");  

                for( int i = 0 ; i < a ; i++ ) {
                    for(int j = 0 ; j < b ; j ++ ) {
                        System.out.print("* ");
                    }
                    System.out.println();

                }

            } else if ( ch==2) {
                System.out.println("Enter the number of rows : ");
                int a = sc.nextInt();

                System.out.println("Enter the number of columns : ");
                int b = sc.nextInt();
                System.out.println("The Output is :");

                for(int i = 0 ; i < a; i++) {
                    for(int j = 0 ; j < b ; j++) {
                        if ( i == (a-1) || i==0 || j ==(b-1) || j == 0 ) {
                            System.out.print("*") ;

                        } else {
                            System.out.print(" ");

                        }

                    }
                    System.out.println() ;

                }
            } else if ( ch==3) {
                System.out.println("Enter the number of rows : ");
                int a = sc.nextInt();
                System.out.println("The Output is :");


                for (int i = 0 ; i < a ; i++){
                    for (int j = 0 ; j <= i ; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }

            } else if ( ch==4) {
                System.out.println("Enter the number of rows : ");
                int a = sc.nextInt();
                System.out.println("The Output is :");

                for(int i = a ; i > 0 ; i --){
                    for(int k = a-i ; k>0 ;k--){System.out.print(" ");}
                    for(int j = 1 ; j <= i ; j ++){System.out.print("* ");}
                    System.out.println();

                }

            } else if ( ch==5) {
                System.out.println("Enter the number of rows : ");
                int a = sc.nextInt();

                System.out.println();  
                int k = 1;
                System.out.println("The Output is :");

                for(int i = 0 ; i < a ; i ++){
                    for(int j = 0 ; j <= i ; j ++){
                        System.out.print(k+" ");
                        k++;

                    }
                    System.out.println();                
                }

            } else if ( ch==6) {
                System.out.println("Enter the number of rows : ");
                int a = sc.nextInt();
                System.out.println("The Output is :");

                for(int i = 1 ; i <= a ; i ++) {
                    for(int j = 1 ; j<=i ; j ++){
                        int sum = i + j;
                        if ((sum % 2) == 0 ){
                            System.out.print("1 ");
                        } else {
                            System.out.print("0 ");
                        }
                    }
                    System.out.println();
                }

            } else if ( ch==7) {
                System.out.println("Enter the number of rows : ");
                int a = sc.nextInt();
                System.out.println("The Output is :");

                for(int i = 1 ; i <= a ; i ++ ){
                    for(int j = 1 ; j <= i ; j ++){
                        System.out.print(j + " " );
                    }
                    System.out.println();
                }

            } else if ( ch==8) {
                System.out.println("Enter the number of rows : ");
                int a = sc.nextInt();
                System.out.println("The Output is :");

                for(int i = a ; i > 0 ; i --){
                    for(int j = 1 ; j <= i ; j ++){
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }

            } else if ( ch==9) {
                System.out.println("Enter the number of rows : ");
                int a = sc.nextInt();
                System.out.println("The Output is :");
                        
                for(int i = 1 ; i <= a ; i ++){
                    for(int j = 1 ; j <= a ; j ++){
                        if((i+j) >= (a+1)){
                            System.out.print("* ");
                        }else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                
            } else if ( ch==10) {
                System.out.println("Enter the number of rows : ");
                int a = sc.nextInt();
                System.out.println("The Output is :");

                for(int i = a ; i >= 1 ; i --){
                    for(int j = 1 ; j < i ; j++){
                        System.out.print(" ");
                        }

                    for(int j =0; j<=(a-1); j ++){
                        System.out.print("* ");
                    }
                    
                    System.out.println();
                }

            } else if ( ch==11) {
                System.out.println("Enter the number of rows : ");
                int a = sc.nextInt();

                System.out.println("The Output is :");

                for(int i = 1 ; i <= a ; i ++) {
                    for(int j = 1 ; j <= a ; j ++) {
                        if((i+j) >= (a+1)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    
                    }
                System.out.println();
                }

            } else if ( ch==12) {
                System.out.println("Enter the number of rows : ");
                int a = sc.nextInt();

                System.out.println("The Output is :");

                for(int i = 1 ; i <= a ; i ++ ){
                    for(int j = 1 ; j <= a ; j ++){
                        if((i+j) >= (a+1)){
                            System.out.print(i + " ");
                        } else {
                            System.out.print(" ");
                        }
                    }
                System.out.println();
                }

            } else if ( ch==13) {
                System.out.print("Enter the number of rows : ");
                int a = sc.nextInt();

                System.out.println("The Output is :");

                for(int i = 1 ; i <= a ; i ++ ){
                    for(int j = 1 ; j <= a ; j ++){
                        if ((i+j) == (a+1)){
                            for(int k = i ; k > 1 ; k --){
                                System.out.print(k);
                            }

                            for(int k = 1 ; k <= i; k ++){
                                System.out.print(k);
                            }
                        } else {
                            System.out.print(" ");
                        }
                    }

                    System.out.println();
                }

            } else {
                System.out.println("INVALID CHOICE !!!!");
            }
        }    
    }
        
}
    