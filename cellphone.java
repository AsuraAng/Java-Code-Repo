import java.util.*;

class smartphone {

    Scanner sc = new Scanner(System.in);
    public void vibrating(){
        System.out.println("The phone is on VIBRATE MODE !!!");
    }

    smartphone(){
        System.out.println("What is the mode of the phone : ");
        System.out.println("1.Silent");
        System.out.println("2.Vibrate");
        System.out.println("3.Ring");
        int ch =sc.nextInt();

        if (ch==1){
            ringing();
        } else if (ch==2){
            vibrating();
        } else if (ch==3){
            System.out.println("Then phone is Ringing .......");
        } else {
            System.out.println("INVLAID CHOICE !!!!");
        }

        
    }
    public void smartphone(){
        
    }

    public void ringing (){
        System.out.println("The phone is on SILENT mode ....... ");

    }
}

public class cellphone {
    public static void main(String[] args) {
        smartphone sp = new smartphone();
        sp.smartphone();        
    }
    
}
