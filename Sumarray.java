

import java.util.*;

public class Sumarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        System.out.println("Enter the elements of array");
        int sum = 0;
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum += a[i];
        }

        System.out.println("Sum of elements in the array: " + sum);
        sc.close();
    }
}