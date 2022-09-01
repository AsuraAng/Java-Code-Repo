import java.util.*;

interface solidPatterns{
    default void parralelogram(){}
    default void butterfly(){}
    default void pyramid(){}
    default void halfPyramid(){}
    default void invertedHalfpyramid(){}
    default void rectangle(){}
}
interface hollowPatterns{
    default void hollowButterfly(){}
    default void hollowRectangle(){}
    default void hollowRhombus(){}
}
class Intro  implements solidPatterns,hollowPatterns{
    static Scanner sc = new Scanner(System.in);
    public void hollowButterfly(){
        System.out.println("Enter a value : ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(j==0||j==i){
                    System.out.print("*");
                } else {System.out.print(" ");}
            }
            for(int j = 1 ; j <= n ; j++){
                if(j==n||j==n-i){
                    System.out.print("*");
                } else {System.out.print(" ");}
            }
            System.out.println();
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(j==0||j==n-i-1){
                    System.out.print("*");
                } else {System.out.print(" ");}
            }
            for(int j = 0 ; j < n ; j++){
                if(j==i||j==n-1){
                    System.out.print("*");
                } else {System.out.print(" ");}
            }
            System.out.println();
        }
    }

    public void hollowRectangle(){
        System.out.println("Enter the Length : ");
        int l = sc.nextInt();
        System.out.println("Enter the Breadth : ");
        int b = sc.nextInt();
            for(int p = 0 ; p< b ; p++){
                for(int q = 0 ; q < l ; q++){
                   if(p==0||p==b-1||q==0||q==l-1){System.out.print("*");}
                   else{System.out.print(" ");}
                }System.out.println();
            }

        
    }
    
    public void hollowRhombus(){
        System.out.println("Enter the height of Row : ");
        int h = sc.nextInt();
        for(int p = 0 ; p < h ; p++){
            if(p==0 || p == h-1 ){
                for(int r = 0 ; r < h-p ; r++){System.out.print(" ");}
                for(int r = 0 ; r < h ; r++){System.out.print("*");}
            }else {
                for(int r = 0 ; r < h-p ; r++){System.out.print(" ");}
                System.out.print("*");
                for(int r = 0 ; r < h-2 ; r++){System.out.print(" ");}
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int facto(int i){
        if ( i == 0){return 1 ;}
        return i*facto(i-1);}

    public static  void pyramid(int i){
        if (i==9){
            System.out.println("Enter the Number of Rows : ");
            int h = sc.nextInt();
            for(int j = 1 ; j <= h; j++){
                for(int m = h-j ; m > 0 ; m--){System.out.print(" ");}
                for(int k = j ; k > 0 ; k--){System.out.print("* ");}
                System.out.println();
            }

        } else if (i==15){
            System.out.println("Enter the Number of Rows : ");
            int h = sc.nextInt();
            for(int j = 1 ; j <= h; j++){
                for(int m = h-j ; m > 0 ; m--){System.out.print(" ");}
                for(int k = j ; k > 0 ; k--){System.out.print("* ");}
                System.out.println();
            }
            for(int j = h-1 ; j >= 1; j--){
                for(int m = h-j ; m > 0 ; m--){System.out.print(" ");}
                for(int k = j ; k > 0 ; k--){System.out.print("* ");}
                System.out.println();
            }

        } else if (i==13){
            System.out.println("Enter the Number of Rows : ");
            int h = sc.nextInt();
            for(int p = 1 ; p <= h; p++){
                for(int q = h-p ; q > 0 ; q--){
                    System.out.print("  ");
                }
                for(int r = p ; r > 0; r--){
                    System.out.print(r+" ");
                }
                for(int r = 2 ; r <= p; r++){
                    System.out.print(r+" ");
                }
                System.out.println();
            }
            
        } else if (i==12){
            System.out.println("Enter the Number of Rows : ");
            int h = sc.nextInt();
            for(int j = 1 ; j <= h; j++){
                for(int m = h-j ; m > 0 ; m--){System.out.print(" ");}
                for(int k = j ; k > 0 ; k--){System.out.print(j+" ");}
                System.out.println();
            }
            
        } else if (i==18){
            System.out.println("Enter the Number of Rows : ");
            int h = sc.nextInt();
            for(int p = 0 ; p < h; p++){
                for(int q = 1 ;q<=h-p; q++){
                    System.out.print(" ");
                }
                for(int r = 0 ; r <= p; r++){
                    System.out.print( ( facto(p)/ ( facto(r)*facto(p-r) ) ) + " ");
                }
                System.out.println();
            }
        }
    }

    public static void halfPyramid(int i){
        
        if ( i == 3){
            System.out.println("Enter the height of PYRAMID : ");
            int h = sc.nextInt();
            for(int k = 1 ; k <= h ; k++){
                for(int m = k ; m > 0 ; m--){System.out.print("*");}
                System.out.println();
            }

        } else if (i==20){
            System.out.println("Enter the height of PYRAMID : ");
            int h = sc.nextInt();
            for(int k = 1 ; k <= h ; k++){
                for(int j = k ; j>=1 ; j--){
                    System.out.print(k);
                }
                System.out.println();
            }

        } else if (i==11){
            System.out.println("Enter the height of PYRAMID : ");
            int h = sc.nextInt();
            for(int k = 1 ; k <= h; k++){
                for(int j = 1 ; j <= h-k ; j++){System.out.print(" ");}
                for(int m = 1 ; m <= k ; m ++){System.out.print("*");}
                System.out.println();
            }
        } else if (i==7||i==19){
            System.out.println("Enter the height of PYRAMID : ");
            int h = sc.nextInt();
            for(int k = 1 ; k < h ; k++){
                for(int m = h-k ; m >= 1; m--){System.out.print(" ");}
                int count = 1;
                for (int n = k; n > 0 ; n--){
                    System.out.print(count);
                    count+=1;
                } System.out.println();
            }
        } else if(i==6){
            System.out.println("Enter the Number of Rows : ");
            int h = sc.nextInt();
            for(int p = 1 ; p <= h; p++){
                for(int q = p ;q >= 1; q--){
                    if ((p+q)%2==0){
                        System.out.print("1 ");
                    } else {System.out.print("0 ");}
                }System.out.println();
            }

        } else if(i==5){
            System.out.println("Enter the Number of Rows : ");
            int h = sc.nextInt();
            int count = 1;
            for(int p = 1 ; p <= h; p++){
                for(int q = p ;q >= 1; q--){
                   System.out.print(count+ " s");
                   count+=1;
                }System.out.println();
            }
        }
    }

    public static void invertedHalfpyramid(int i){
        System.out.println("Enter the Number of rows : ");
        int h = sc.nextInt();
        if(i==4){
            for(int p = 0 ;p < h; p++){
                for(int q = 0 ; q < p ; q++){System.out.print(" ");}
                for(int r = 1 ; r <= h - p ; r++){System.out.print("* ");}
                System.out.println();
            }

        } else if(i==8){
            for(int p = 0 ;p < h; p++){
                for(int q = 0 ; q < p ; q++){System.out.print(" ");}
                for(int r = 1 ; r <= h - p ; r++){System.out.print(r+" ");}
                System.out.println();
            }

        }
    }

    public static void butterfly(int i){
        for (int m = 1 ; m <= i ; m ++){
            for(int k = m ; k > 0 ; k --){System.out.print("*");}

            for(int n = 1 ; n<=(i-m)*2; n++){System.out.print(" ");} 
            
            for(int k = m ; k > 0 ; k --){System.out.print("*");}
            System.out.println();
        }
        for (int m = i-1  ; m >= 1 ; m --){
            for(int k = m ; k > 0 ; k --){System.out.print("*");}

            for (int n = 1 ; n<=(i-m)*2 ; n++){System.out.print(" ");}

            for(int k = m ; k > 0 ; k --){System.out.print("*");}
            System.out.println();
        }
    }

    public static void parralelogram(int i){
        for(int m = 0 ; m < i-m ; m++ ){System.out.print(" ");}
        for(int m = 0 ; m < i ; m++ ){System.out.print("*");}

    }

    public static void rectangle(int i , int j ){
        int k = 0;
        while( k<i ){
            for(int m = 0 ; m < j ; m++){
                System.out.println("*");
            }
        }
    }

    public static void EntryView(){
        for(int i = 1 ;i <= 50; i++){
            System.out.print("*");
            if (i == 50){
                System.out.println("*");
            }
        }
        System.out.println("Hello welcome To OOPs implemnted program for making pattern......");
        System.out.println("1.Rectangular Solid");//done
        System.out.println("2.Hollow Rectangle");//-->
        System.out.println("3.Half Pyrammid");//done
        System.out.println("4.Half Pyramid Inverted");//done
        System.out.println("5.Floyd's Triangle");//done
        System.out.println("6. (0,1)-Triangle");//done
        System.out.println("7.Nunbered Half Pyramid");//done
        System.out.println("8.Numbered Half Pyramid Inverted");//done
        System.out.println("9.Pyramid");//done
        System.out.println("10.Parallelogram");//done
        System.out.println("11.Mirror image of half pyramid");//done
        System.out.println("12.Homework - 1 : Number Pyramid ");//done
        System.out.println("13.Homework - 2 : Palindromic ");//done
        System.out.println("14.Butterfly");//done
        System.out.println("15.Diamond");//done
        System.out.println("16.Hollow Butterfly");//-->
        System.out.println("17.Hollow Rhombus");//-->
        System.out.println("18.Pascal's Triangle");//done
        System.out.println("19.Numbered HALF PYRAMID");//done
        System.out.println("20.Inverted half pyramid with number of row");//done
        for(int i = 1 ;i <= 50; i++){
            System.out.print("*");
            if (i == 50){
                System.out.println("*");
            }
        }
        System.out.println("Enter the choice (1-20): ");
    }
}







public class newInter {
    
    
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            Intro in = new Intro();

            in.EntryView();

            int ch = sc.nextInt();
            if (ch==1){
                System.out.println("Enter the Length of Rectangle : ");
                int i = sc.nextInt();
                System.out.println("Enter the Breadth of Rectangle : ");
                int j = sc.nextInt();
                in.rectangle(i,j);

            } else if (ch==2){
                in.hollowRectangle();
            } else if (ch==3){
                in.halfPyramid(ch);
                
            } else if (ch==4){
                in.invertedHalfpyramid(ch);
                
            } else if (ch==5){
                in.halfPyramid(ch);
            } else if (ch==6){
                in.halfPyramid(ch);
                
            } else if (ch==7){
                in.halfPyramid(ch);
                
            } else if (ch==8){
                in.invertedHalfpyramid(ch);
                
            } else if (ch==9){
                in.pyramid(ch);
                
            } else if (ch==10){
                System.out.println("Enter the dimension for parallelogram : ");
                int i = sc.nextInt();
                in.parralelogram(i);
                
            } else if (ch==11){
                in.halfPyramid(ch);
                
            } else if (ch==12){
                in.pyramid(ch);
                
            } else if (ch==13){
                in.pyramid(ch);
                
            } else if (ch==14){
                System.out.println("Enter an Integer value : ");
                int i = sc.nextInt();
                in.butterfly(i);
                
            } else if (ch==15){
                in.pyramid(ch);
                
            } else if (ch==16){
                in.hollowButterfly();
                
            } else if (ch==17){
                in.hollowRhombus();
                
            } else if (ch==18){
                in.pyramid(ch);
            } else if (ch==19){
                in.halfPyramid(ch);
                
            } else if (ch==20){
                in.halfPyramid(ch);
                
            } else {
                System.out.println("Invalid CHOICE COMMITED !!!!");
            }
        }
    }
    
}
