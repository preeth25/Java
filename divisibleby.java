import java.util.*;
public class divisibleby{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        System.out.println("Enter the elements of array");
        int count = 0;
        for(i=0;i<n;i++){

            
            a[i]=sc.nextInt();
            if(a[i] % 5 == 0){
                count++;
            }
        }

        System.out.println("Number of elements exactly divisible by 5: " + count);
        
        sc.close();
    }
}