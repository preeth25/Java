import java.util.*;


public class time {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hour:");
        int hour=sc.nextInt();
        String result=time.printTime(hour);
        System.out.println(result);
    }
    public static String printTime(int hour)
    {
        if(hour>=0 && hour<12)
            return "AM";
        else if(hour>=12 && hour<24)
            return "PM";
        else
            return"Invalid hour";
    }
}
