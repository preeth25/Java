import java.util.*;
public class sub{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum = sumOfArray(a);
        System.out.println("Sum of elements in the array: " + sum);
        sc.close();
    }
    
    public static int sumOfArray(int a[]){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        return sum;
    }
}