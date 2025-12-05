import java.util.*;

public class time {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        time.printTime(14);
    }
    public static void printTime(int hour)
    {
        if(hour>=0 && hour<12)
            System.out.println("AM");
        else if(hour>=12 && hour<24)
            System.out.println("PM");
        else
            System.out.println("Invalid hour");
    }
}
