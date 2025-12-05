import java.util.*;
public class condition{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        if(a==6 || b==6 || (a+b)==6 ||(a-b)==6){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        sc.close();
    }
}

    
