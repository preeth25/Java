//Write a program to check the multiples of 3 in the array.if there are two elements which are exactly divisiblen by 3.the output should be 2.
import java.util.Scanner;
public class multiples{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        System.out.println("Enter the elements of array");
        int count = 0;
        for(i=0;i<n;i++){

            
            a[i]=sc.nextInt();
            if(a[i] % 3 == 0){
                count++;
            }
        }

        System.out.println("Number of elements exactly divisible by 3: " + count);
        sc.close();
    }
}
