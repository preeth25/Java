import java.util.*;

public class methoddemo {
    public static void main(String args[])
    {
        boolean value=methoddemo.canVotye(20);
        if(value)
            System.out.println("CAN VOTE");
        else
            System.out.println("cannot vote");
    }
    public static boolean canVotye(int age)
    {
        if(age>=18)
            return true;
        else
            return false;
    }
}


//write a method to print am and pm for given hour
// public class methoddemo {
//     public static void main(String args[])
//     {
//         methoddemo.printAmPm(14);    
//     }
//     public static void printAmPm(int hour){
    //         if(hour>=0 && hour<12)
    //             System.out.println("AM");
    //         else if(hour>=12 && hour<24)
    //             System.out.println("PM");
    //         else
        //             System.out.println("Invalid hour");  
    //     }